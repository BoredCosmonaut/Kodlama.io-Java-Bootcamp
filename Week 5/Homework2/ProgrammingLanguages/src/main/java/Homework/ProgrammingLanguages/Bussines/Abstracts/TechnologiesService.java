package Homework.ProgrammingLanguages.Bussines.Abstracts;

import Homework.ProgrammingLanguages.Bussines.Requests.CreateTechnologiesRequest;
import Homework.ProgrammingLanguages.Bussines.Requests.DeleteTechnologyRequest;
import Homework.ProgrammingLanguages.Bussines.Requests.UpdateTechnologyRequest;
import Homework.ProgrammingLanguages.Bussines.Responses.GetAllTechnologiesResponse;
import Homework.ProgrammingLanguages.Bussines.Responses.GetTechnologyByIdResponse;
import Homework.ProgrammingLanguages.Entities.Technologies;

import java.util.List;

public interface TechnologiesService {

    List<GetAllTechnologiesResponse> getAllTechnologies();

    GetTechnologyByIdResponse getTechnologyById(int id) throws Exception;

    void deleteTechnology(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception;

    void addTechnology(CreateTechnologiesRequest createTechnologiesRequest) throws Exception;

    void updateTechnology(UpdateTechnologyRequest updateTechnologyRequest, int currentId) throws  Exception;
}
