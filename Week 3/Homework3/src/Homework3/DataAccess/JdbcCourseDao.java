package Homework3.DataAccess;

import Homework3.Entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veritabanına eklendi");
    }
}
