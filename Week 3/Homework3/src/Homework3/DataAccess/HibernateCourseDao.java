package Homework3.DataAccess;

import Homework3.Entities.Course;

public class HibernateCourseDao implements  CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
