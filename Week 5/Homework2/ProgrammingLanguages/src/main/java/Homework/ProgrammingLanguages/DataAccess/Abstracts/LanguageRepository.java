package Homework.ProgrammingLanguages.DataAccess.Abstracts;

import Homework.ProgrammingLanguages.Entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}
