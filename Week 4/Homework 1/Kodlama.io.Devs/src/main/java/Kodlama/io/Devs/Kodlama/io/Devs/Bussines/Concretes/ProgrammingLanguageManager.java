package Kodlama.io.Devs.Kodlama.io.Devs.Bussines.Concretes;

import Kodlama.io.Devs.Kodlama.io.Devs.Bussines.Abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Kodlama.io.Devs.DataAccess.Abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.Entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (IdExists(programmingLanguage.getId())) {
            throw new Exception("Id'ler tekrar edemez");
        }
        else if (nameExists(programmingLanguage)) {
            throw new Exception("Isimler tekrar edemez");
        }
        else if (programmingLanguage.getName().isEmpty()) {
            throw new Exception("Isim bos bırakılamaz");
        }
        programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(int id) throws Exception {
        if (!IdExists(id)) {
            throw new Exception("Boyle bir ıd bulunmamaktadır");
        }
        programmingLanguageRepository.delete(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception {
        if (!IdExists(id)) {
            throw new Exception("Boyle bir id bulunmamaktadır");
        }
        else if (nameExists(programmingLanguage)) {
            throw new Exception("Isimler tekrar edemez");
        }
        programmingLanguageRepository.update(programmingLanguage,id);
    }

    @Override
    public ProgrammingLanguage getById(int id) throws Exception {
        for (ProgrammingLanguage language : getAll()) {
            if (language.getId() == id) {
                return language;
            }
        }
        throw new Exception("Boyle bir dil bulunmamaktadır");
    }

    public boolean IdExists(int id) {
        for (ProgrammingLanguage programmingLanguage1 : getAll()) {
            if (programmingLanguage1.getId() == id) {
                return true;
            }
        }
        return  false;
    }

    public boolean nameExists(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage programmingLanguage2: getAll()) {
            if (programmingLanguage2.getName().equals(programmingLanguage.getName())) {
                return true;
            }
        }
        return false;
    }
}
