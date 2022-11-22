package Homework.ProgrammingLanguages.Bussines.Concretes;

import Homework.ProgrammingLanguages.Bussines.Abstracts.ProgrammingLanguageService;
import Homework.ProgrammingLanguages.Bussines.Requests.CreateLanguageRequest;
import Homework.ProgrammingLanguages.Bussines.Requests.DeleteLanguageRequest;
import Homework.ProgrammingLanguages.Bussines.Responses.GetAllLanguagesResponse;
import Homework.ProgrammingLanguages.DataAccess.Abstracts.LanguageRepository;
import Homework.ProgrammingLanguages.Entities.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    LanguageRepository languageRepository;

    public ProgrammingLanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    @Override
    public List<GetAllLanguagesResponse> getAllLanguages() {
        List<ProgrammingLanguage> programmingLanguages = languageRepository.findAll();
        List<GetAllLanguagesResponse> getAllLanguagesResponses =new ArrayList<>();
        for (ProgrammingLanguage language: programmingLanguages) {
            GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
            responseItem.setId(language.getID());
            responseItem.setName(language.getName());
            getAllLanguagesResponses.add(responseItem);
        }
        return getAllLanguagesResponses;
    }

    @Override
    public void addLanguage(CreateLanguageRequest createLanguageRequest) throws Exception {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.setName(createLanguageRequest.getName());
        if (nameExists(createLanguageRequest.getName())) {
            throw new Exception("Languages can't have the same name");
        }
        languageRepository.save(language);
    }

    public void deleteLanguage(DeleteLanguageRequest deleteLanguageRequest) throws Exception {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.setID(deleteLanguageRequest.getId());
        if (idExists(deleteLanguageRequest.getId())) {
            languageRepository.deleteById(language.getID());
        }
        else {
            throw new Exception("There is no language with this id");
        }
    }

    public boolean idExists(int id) {
        for (GetAllLanguagesResponse language : getAllLanguages()) {
            if (language.getId() == id) {
                return true;
            }
        }
        return false;
    }
    public boolean nameExists(String name) {
        for (GetAllLanguagesResponse language: getAllLanguages()) {
            if (language.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
