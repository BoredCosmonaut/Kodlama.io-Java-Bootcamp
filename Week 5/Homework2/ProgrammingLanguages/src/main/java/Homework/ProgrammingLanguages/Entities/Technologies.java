package Homework.ProgrammingLanguages.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Table(name = "Technologies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Technologies {

    @Id
    @Column(name = "ID")
    private int ID;

    @Column(name = "Name")
    private String Name;


}
