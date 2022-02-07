package com.company;
//create a relationship between students and courses

public class Course {
    //Member variables
    public String courseCode;
    double assignmentOneTotal = 0;
    double assignmentTwoTotal = 0;
    double totalMarks;

    //User Defined Constructor
    //these are different than the properties names even if they share the same name
    public Course(String courseCode, double assignmentOneTotal, double assignmentTwoTotal) {
        this.courseCode = courseCode; //these are assigning the values in the constructor to the parameters
        this.assignmentOneTotal = assignmentOneTotal;
        this.assignmentTwoTotal = assignmentTwoTotal;
        this.totalMarks = this.assignmentOneTotal + this.assignmentTwoTotal;
    }

}
