package Homework3;

import Homework3.Business.CourseManager;
import Homework3.DataAccess.HibernateCourseDao;
import Homework3.Entities.Course;
import Homework3.core.Logger.DatabaseLogger;
import Homework3.core.Logger.FileLogger;
import Homework3.core.Logger.Logger;
import Homework3.core.Logger.MailLogger;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        Course course1 = new Course("Java","Yazılım",40);
        Course course2 = new Course("Resim","Resim",45);
        Course course3 = new Course("C+","C+ Yazılım Dili", 45);
        courseManager.add(course1,course2,course3);
    }
}
