package Kodlama.io.Devs.Kodlama.io.Devs.WebApı.Controllers;

import Kodlama.io.Devs.Kodlama.io.Devs.Bussines.Abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.Entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguageControllers {

    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageControllers(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getAll")
    public List<ProgrammingLanguage> getAll() {
        return this.programmingLanguageService.getAll();
    }

    @GetMapping("/getByID")
    public ProgrammingLanguage getById(int id) throws Exception {
        return this.programmingLanguageService.getById(id);
    }

    @GetMapping("/add")
    public String add(ProgrammingLanguage programmingLanguage) throws Exception {
       this.programmingLanguageService.add(programmingLanguage);
        return "Dil basariyla eklendi";
    }

    @GetMapping("/delete")
    public String delete(int id) throws Exception {
        this.programmingLanguageService.delete(id);
        return "Dil basariyla silindi";
    }

    @GetMapping("/update")
    public String update(ProgrammingLanguage programmingLanguage, int id) throws Exception {
        this.programmingLanguageService.update(programmingLanguage,id);
        return "Dil basariyla guncellendi";
    }
}
