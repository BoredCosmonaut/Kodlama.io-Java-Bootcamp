package Homework3.Entities;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String category;
    private int price;


    public  Course(String courseName, String category, int price) {
        this.courseName = courseName;
        this.category = category;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
