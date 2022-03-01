package com.company;

public class Student {
    //properties
    public String stName;
    public double assignment1Mark;
    public double assignment2Mark;
    public double totalMark;

    //constructor
    public Student(String pStName, double pAssignment1Mark, double pAssignment2Mark) {
        this.stName = pStName;
        this.assignment1Mark = pAssignment1Mark;
        this.assignment2Mark = pAssignment2Mark;
        this.totalMark = this.assignment1Mark + this.assignment2Mark;

    }
    //method
    public String stdReport() {
        return String.format("%s :\tAssignment1: - %f\tAssignment2: - %.2fTotal: - %.2f",
                this.stName, this.assignment1Mark, this.assignment2Mark, this.totalMark);
    }
}
