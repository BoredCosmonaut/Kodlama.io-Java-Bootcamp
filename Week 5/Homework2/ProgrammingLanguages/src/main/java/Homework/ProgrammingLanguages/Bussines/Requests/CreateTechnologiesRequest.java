package Homework.ProgrammingLanguages.Bussines.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTechnologiesRequest {
    private int id;
    private String name;
}
