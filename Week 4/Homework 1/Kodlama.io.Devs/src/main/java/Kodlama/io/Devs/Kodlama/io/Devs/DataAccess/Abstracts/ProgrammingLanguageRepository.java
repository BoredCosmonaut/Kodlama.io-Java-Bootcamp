package Kodlama.io.Devs.Kodlama.io.Devs.DataAccess.Abstracts;

import Kodlama.io.Devs.Kodlama.io.Devs.Entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    public void add(ProgrammingLanguage programmingLanguage);
    public void delete(int id) throws Exception;
    public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception;
    public ProgrammingLanguage getById(int id) throws Exception;
}
