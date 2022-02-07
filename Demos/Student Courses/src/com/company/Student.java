package com.company;

public class Student {
    //Member variables
    //for assignment 2, use public, for assignment 3, use private
    public String stdName;
    public Double firstAssignment;
    public Double secondAssignment;
    public Double totalMarks;
    public Double courseAverage;

    //Constructors
    public Student(String stdName, double firstAssignment, double secondAssignment) {
        this.stdName = stdName;
        this.firstAssignment = firstAssignment;
        this.secondAssignment = secondAssignment;
        this.totalMarks = this.firstAssignment + this.secondAssignment;
        this.courseAverage = this.totalMarks / 2;
        //you can do the math from within the constructor to get the total
        //inside the student class, it has these properties ^^
    }
        //Report
    public void reportOne() {
        System.out.println(this.stdName + "-".repeat(10)
                + this.firstAssignment + "-".repeat(10)
                + this.secondAssignment + "-".repeat(10)
                + this.totalMarks + "-".repeat(10)
                + this.courseAverage);
    }
}
