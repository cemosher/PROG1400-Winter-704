package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Scanner sc = new Scanner(System.in);


        // primitive data types arrays
        int[] stMarks = new int[10];//this is the original way we learned to assign an array
        Student[] stList = new Student[3];
        // array of objects

        //array of list

        for (int i = 0; i < stList.length; i++) {
            System.out.println("Enter student # " + (i+1) + " information: ");
            System.out.println("Enter student first name: ");
            String stFirstName = sc.nextLine(); // pulls in the next string from input
            System.out.println("Enter student last name: ");
            String stLastName = sc.nextLine();
            System.out.println("Enter student W number: ");
            String stWNumber = sc.nextLine();
            System.out.println("Enter student enrollment (true/false): ");
            Boolean stIsFullTime = sc.nextBoolean();
            System.out.println("Enter student tuition fees: ");
            Double stTuitionFees = sc.nextDouble();
            sc.nextLine();

            // we are pushing all of the information above into the statement on student.java
            Student firstStudent = new Student(stFirstName, stLastName, stWNumber, stIsFullTime, stTuitionFees);
            // using the student class that we have created
            // because those properties are private, then you can't use them in the other programs like this one
            stList[i] = new Student(stFirstName, stLastName, stWNumber, stIsFullTime, stTuitionFees); // we are passing values in here to create the array
            // we are creating an array of objects inside this main class so we don't have to copy/paste this
            // code for each student, but rather have a loop to keep running it
            //firstStudent.reportOne();
        }
        //this is not an efficient way to get the print out, it should be a for loop
//        stList[0].reportOne();
//        stList[1].reportOne();
//        stList[2].reportOne();
        for (int i = 0; i < stList.length; i++) {
            stList[i].reportOne(); //this will serve the same functions
        }
    }
}
