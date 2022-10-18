package Homework3.Business;

import Homework3.DataAccess.CourseDao;
import Homework3.Entities.Course;
import Homework3.core.Logger.Logger;

import java.util.ArrayList;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;
    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course... courses) throws Exception{
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getPrice() < 0) {
                throw new Exception("Kursun ucreti 0'dan az olamaz");
            }
        }
        for (int i = 0; i < courses.length; i++) {
            for (int j = i + 1; j < courses.length; j++) {

                if (courses[i].getCourseName().toString().equals(courses[j].getCourseName().toString())) {
                    throw new Exception("Kurs isimleri aynı olamaz");
                }
            }
        }
        for (int i = 0; i < courses.length; i++) {
            for (int j = i + 1; j < courses.length; j++) {

                if (courses[i].getCategory().toString().equals(courses[j].getCategory().toString())) {
                    throw new Exception("Kategori isimleri aynı olamaz");
                }
            }
        }


        for (int i = 0; i < courses.length; i++) {
            courseDao.add(courses[i]);
        }
        for (Logger logger : loggers) {
            for (int i = 0; i < courses.length; i++) {
                logger.log(courses[i].getCourseName().toString());
            }
        }

    }
    public String toString(String word) {
        String returnWord = "";
        for (int i = 0; i < word.length(); i++) {
            returnWord = returnWord + word.charAt(i);
        }
        return returnWord;
    }
}
