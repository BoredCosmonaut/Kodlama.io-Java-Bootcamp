package Homework.ProgrammingLanguages.Bussines.Responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllLanguagesResponse {
    private int id;
    private String name;
}
