package com.company;

public class Course {
    //properties
    public String courseName;
    public double assignment1Total;
    public double assignment2Total;
    public double finalTotal;

    //constructor
    public Course(String pCourseName, double pAssignment1Total, double pAssignment2Total) {
        this.courseName = pCourseName;
        this.assignment1Total = pAssignment1Total;
        this.assignment2Total = pAssignment2Total;
        this.finalTotal = this.assignment1Total + this.assignment2Total;
    }
}
