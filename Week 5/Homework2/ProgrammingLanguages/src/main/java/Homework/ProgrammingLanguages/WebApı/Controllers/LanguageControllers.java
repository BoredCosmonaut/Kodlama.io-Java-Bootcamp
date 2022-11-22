package Homework.ProgrammingLanguages.WebApı.Controllers;


import Homework.ProgrammingLanguages.Bussines.Abstracts.ProgrammingLanguageService;
import Homework.ProgrammingLanguages.Bussines.Requests.CreateLanguageRequest;
import Homework.ProgrammingLanguages.Bussines.Requests.DeleteLanguageRequest;
import Homework.ProgrammingLanguages.Bussines.Responses.GetAllLanguagesResponse;
import Homework.ProgrammingLanguages.DataAccess.Abstracts.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Language")
public class LanguageControllers {
    private ProgrammingLanguageService languageService;

    @Autowired
    public LanguageControllers(ProgrammingLanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getLanguages")
    public List<GetAllLanguagesResponse> getAllLanguages() {
        return languageService.getAllLanguages();
    }

    @PostMapping("/addLanguage")
    public void addLanguage(CreateLanguageRequest createLanguageRequest) throws Exception {
        languageService.addLanguage(createLanguageRequest);
    }
    @DeleteMapping("/deleteLanguage")
    public void deleteLanguage(DeleteLanguageRequest deleteLanguageRequest) throws Exception {
        languageService.deleteLanguage(deleteLanguageRequest);
    }
}
