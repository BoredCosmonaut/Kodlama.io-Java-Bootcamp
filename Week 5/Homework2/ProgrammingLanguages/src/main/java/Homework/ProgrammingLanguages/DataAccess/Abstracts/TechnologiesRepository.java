package Homework.ProgrammingLanguages.DataAccess.Abstracts;

import Homework.ProgrammingLanguages.Entities.Technologies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologiesRepository extends JpaRepository<Technologies,Integer> {
}
