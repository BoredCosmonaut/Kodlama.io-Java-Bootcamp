package Homework.ProgrammingLanguages.WebApı.Controllers;

import Homework.ProgrammingLanguages.Bussines.Abstracts.TechnologiesService;
import Homework.ProgrammingLanguages.Bussines.Requests.CreateTechnologiesRequest;
import Homework.ProgrammingLanguages.Bussines.Requests.DeleteTechnologyRequest;
import Homework.ProgrammingLanguages.Bussines.Requests.UpdateTechnologyRequest;
import Homework.ProgrammingLanguages.Bussines.Responses.GetAllLanguagesResponse;
import Homework.ProgrammingLanguages.Bussines.Responses.GetAllTechnologiesResponse;
import Homework.ProgrammingLanguages.Bussines.Responses.GetTechnologyByIdResponse;
import Homework.ProgrammingLanguages.Entities.Technologies;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Technologies")
public class TechnologyControllers {

    private TechnologiesService technologiesService;

    @Autowired
    public TechnologyControllers(TechnologiesService technologiesService) {
        this.technologiesService = technologiesService;
    }

    @GetMapping("/getAllTechnologies")
    public List<GetAllTechnologiesResponse> getAllTechnologies() {
        return technologiesService.getAllTechnologies();
    }

    @GetMapping("/getTechnologyById")
    public GetTechnologyByIdResponse getTechnologyById(int id) throws Exception {
        return technologiesService.getTechnologyById(id);
    }
    @PostMapping("/addTechnology")
    public String addTechnology(CreateTechnologiesRequest createTechnologiesRequest) throws Exception {
        technologiesService.addTechnology(createTechnologiesRequest);
        return "Technology has been added successfully";
    }

    @DeleteMapping("/deleteTechnology")
    public String deleteTechnology(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
        technologiesService.deleteTechnology(deleteTechnologyRequest);
        return "Technology has been removed";
    }

    @PutMapping("/updateTechnology")
    public String updateTechnology(UpdateTechnologyRequest updateTechnologyRequest, int currentID) throws Exception {
        technologiesService.updateTechnology(updateTechnologyRequest,currentID);
        return "Technology has been updated successfully";
    }
}
