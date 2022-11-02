package Kodlama.io.Devs.Kodlama.io.Devs.Bussines.Abstracts;

import Kodlama.io.Devs.Kodlama.io.Devs.Entities.ProgrammingLanguage;

import java.util.List;
//Managerlar icinde kullanacagımız metoddları buraya kurduk
public interface ProgrammingLanguageService {
    public List<ProgrammingLanguage> getAll();
    public void add(ProgrammingLanguage programmingLanguage) throws Exception;
    public void delete(int id) throws Exception;
    public void update(ProgrammingLanguage programmingLanguage, int id) throws Exception;
    public ProgrammingLanguage getById(int id) throws Exception;
}
