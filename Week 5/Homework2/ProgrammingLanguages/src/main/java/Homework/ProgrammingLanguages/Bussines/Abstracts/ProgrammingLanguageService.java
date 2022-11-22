package Homework.ProgrammingLanguages.Bussines.Abstracts;

import Homework.ProgrammingLanguages.Bussines.Requests.CreateLanguageRequest;
import Homework.ProgrammingLanguages.Bussines.Requests.DeleteLanguageRequest;
import Homework.ProgrammingLanguages.Bussines.Responses.GetAllLanguagesResponse;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllLanguagesResponse> getAllLanguages();

    void addLanguage(CreateLanguageRequest createLanguageRequest) throws Exception;

    void deleteLanguage(DeleteLanguageRequest deleteLanguageRequest) throws Exception;
}
