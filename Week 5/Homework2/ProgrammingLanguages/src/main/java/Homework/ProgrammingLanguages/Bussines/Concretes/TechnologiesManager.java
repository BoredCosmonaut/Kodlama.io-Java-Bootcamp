package Homework.ProgrammingLanguages.Bussines.Concretes;

import Homework.ProgrammingLanguages.Bussines.Abstracts.TechnologiesService;
import Homework.ProgrammingLanguages.Bussines.Requests.CreateTechnologiesRequest;
import Homework.ProgrammingLanguages.Bussines.Requests.DeleteTechnologyRequest;
import Homework.ProgrammingLanguages.Bussines.Requests.UpdateTechnologyRequest;
import Homework.ProgrammingLanguages.Bussines.Responses.GetAllTechnologiesResponse;
import Homework.ProgrammingLanguages.Bussines.Responses.GetTechnologyByIdResponse;
import Homework.ProgrammingLanguages.DataAccess.Abstracts.TechnologiesRepository;
import Homework.ProgrammingLanguages.Entities.Technologies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologiesManager implements TechnologiesService {
    TechnologiesRepository technologiesRepository;

    public TechnologiesManager(TechnologiesRepository technologiesRepository) {
        this.technologiesRepository = technologiesRepository;
    }

    @Override
    public List<GetAllTechnologiesResponse> getAllTechnologies() {
        List<Technologies> technologies = technologiesRepository.findAll();
        List<GetAllTechnologiesResponse> getAllTechnologiesResponses = new ArrayList<>();
        for (Technologies technology : technologies) {
            GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
            responseItem.setID(technology.getID());
            responseItem.setName(technology.getName());
            getAllTechnologiesResponses.add(responseItem);
        }
        return getAllTechnologiesResponses;
    }

    @Override
    public GetTechnologyByIdResponse getTechnologyById(int id) throws Exception {
        Technologies technology = technologiesRepository.getReferenceById(id);
        if (!ıdExists(id)) {
            throw new Exception("There is no Sub-Technology with this id");
        }
        GetTechnologyByIdResponse response = new GetTechnologyByIdResponse();
        response.setId(technology.getID());
        response.setName(technology.getName());
        return response;
    }

    @Override
    public void deleteTechnology(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
        Technologies technology = new Technologies();
        technology.setID(deleteTechnologyRequest.getId());
        if (ıdExists(technology.getID())) {
            technologiesRepository.deleteById(technology.getID());
        }
        else {
            throw new Exception("There is no Sub-Technology with this id");
        }
    }

    @Override
    public void addTechnology(CreateTechnologiesRequest createTechnologiesRequest) throws Exception {
        Technologies technology = new Technologies();
        technology.setName(createTechnologiesRequest.getName());
        technology.setID(createTechnologiesRequest.getId());
        if (ıdExists(technology.getID())) {
            throw new Exception("Sub-Technologies can't have the same id");
        }
        else if (nameExists(technology.getName())) {
            throw new Exception("Technologies can't have the same names");
        }
        technologiesRepository.save(technology);
    }

    @Override
    public void updateTechnology(UpdateTechnologyRequest updateTechnologyRequest, int currentID) throws Exception {
        if (ıdExists(currentID)) {
            Technologies technology = technologiesRepository.getReferenceById(currentID);
            if (nameExists(updateTechnologyRequest.getName())) {
                throw new Exception("There is already a technology with this name");
            }
            else if (updateTechnologyRequest.getName().isEmpty()) {
                throw new Exception("Name can't be empty");
            }
            else {
                technology.setName(updateTechnologyRequest.getName());
                technologiesRepository.save(technology);
            }
        }
        else {
            throw new Exception("There is no technology with this id");
        }
    }


    public boolean ıdExists(int id) {
        for (GetAllTechnologiesResponse technology : getAllTechnologies()) {
            if (technology.getID() == id) {
                return  true;
            }
        }
        return false;
    }

    public boolean nameExists(String name) {
        for (GetAllTechnologiesResponse technology : getAllTechnologies()) {
            if (technology.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
