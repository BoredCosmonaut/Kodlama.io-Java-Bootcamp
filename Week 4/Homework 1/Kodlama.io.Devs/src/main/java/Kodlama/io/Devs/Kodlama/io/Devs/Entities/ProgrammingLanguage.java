package Kodlama.io.Devs.Kodlama.io.Devs.Entities;

public class ProgrammingLanguage {
    //Eklemek istedeigimiz nesneyi bu sınıfa kurduk
    private String name;
    private int id;

    public ProgrammingLanguage() {

    }

    public ProgrammingLanguage(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
