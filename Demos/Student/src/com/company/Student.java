package com.company;

public class Student {

    // 1. Attributes / Properties
    // Those are encapsulated properties, because we used a private
    private String fName;
    private String lname;
    private String wNumber;
    private boolean isFullTime;
    private double tuitionFees;

    // 2. Constructors
    // 1. The default constructor
    // 2. User defined constructor with parameters
    // this is where we are saving the data
    public Student(String pFirName, String pLName, String pWNumber, boolean pIsFulltime, double pTuitionFees) {
        // assign the values using this keyword
        this.fName = pFirName;
        this.lname = pLName;
        this.wNumber = pWNumber;
        this.isFullTime = pIsFulltime;
        this.tuitionFees = pTuitionFees;

    }

    // Methods to get the data back out
    public void reportOne() {
        System.out.println(this.wNumber + "\t" + this.fName + "\t" + this.lname + "\t" + this.isFullTime + "\t"
                + this.tuitionFees + "\t");
    }
    public double getTuitionFees() {
        return this.tuitionFees; //this method will retrieve the value of tuition fees for any object so you can
        // use it for calculations
    }
}
