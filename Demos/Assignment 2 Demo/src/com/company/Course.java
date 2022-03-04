package com.company;

public class Course {
    //properties
    public String courseName;
    public double assignment1Total;
    public double assignment2Total;
    public double finalTotal;

    //constructor
    //will create an object with only the course name
    public Course(String pCourseName) {
        this.courseName = pCourseName;
    }


    public Course(String pCourseName, double pAssignment1Total, double pAssignment2Total) {
        this.courseName = pCourseName;
        this.assignment1Total = pAssignment1Total;
        this.assignment2Total = pAssignment2Total;
        this.finalTotal = this.assignment1Total + this.assignment2Total;
    }

    //method
    public String statReport() {
        return String.format("%s :\tAssignment1 - %.1f \tAssignment2 - %.1f\tTotal: - %.1f",
                this.courseName, this.assignment1Total, this.assignment2Total, this.finalTotal);
    }
}



