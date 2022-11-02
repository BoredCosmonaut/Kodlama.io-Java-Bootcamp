package Kodlama.io.Devs.Kodlama.io.Devs.DataAccess.Concretes;

import Kodlama.io.Devs.Kodlama.io.Devs.DataAccess.Abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.Entities.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguage() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();

        programmingLanguages.add(new ProgrammingLanguage("Java",1));
        programmingLanguages.add(new ProgrammingLanguage("PHP",2));
        programmingLanguages.add(new ProgrammingLanguage("JavaScript",3));
        programmingLanguages.add(new ProgrammingLanguage("Python",4));
        programmingLanguages.add(new ProgrammingLanguage("C+",5));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(int id) throws Exception {
        programmingLanguages.remove(getById(id));
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception {
        ProgrammingLanguage programmingLanguageToUpdate = getById(id);
        programmingLanguageToUpdate.setName(programmingLanguage.getName());
        programmingLanguageToUpdate.setId(programmingLanguage.getId());
    }

    public ProgrammingLanguage getById(int id) throws Exception {
        for (ProgrammingLanguage language : getAll()) {
            if (id == language.getId()) {
                return language;
            }
        }
        throw new Exception("Boyle bir dil bulunmamaktadır");
    }
}
