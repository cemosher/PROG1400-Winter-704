package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Scanner sc = new Scanner(System.in);


        // primitive data types arrays
        int[] stMarks = new int[10];//this is the original way we learned to assign an array
        Student[] stList = new Student[3];
        // array of objects

        //arraylist of objects
        //declare arraylist for student class
        ArrayList<Student> classList = new ArrayList<>();//call variable name
//        //this ArrayList starts with no elements and we can add them in
//        classList.add(new Student("Candace", "Mosher", "W0468626", true, 4000)); //creates a new object of type student
//        //we have used the student constructor to make a student object and add it to the arraylist
//        System.out.println(classList.size()); //will give you the size of the array
//        classList.add(new Student("Charlotte", "Mosher", "W0465646", true, 4000)); //creates a new object of type student
//        System.out.println(classList.size()); //will give you the size of the array
//        classList.add(new Student("Alex", "Cochrane", "W0467833", false, 4000)); //creates a new object of type student
//        System.out.println(classList.size()); //will give you the size of the array
//        // we can keep making people in this manner if we want
//        for (Student stInfo:classList) { //this is a for each loop, type of element is student
//            //use stInfo element
//            stInfo.reportOne(); //report method
//        }

        int k=0;
        //array of list
        do {
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
            classList.add(new Student(stFirstName, stLastName, stWNumber, stIsFullTime, stTuitionFees)); // we are passing values in here to create the array
            System.out.println("Do you want to continue?");
            answer = sc.nextBoolean();
            sc.nextLine();
            k++;

            // we are pushing all of the information above into the statement on student.java
//            Student firstStudent = new Student(stFirstName, stLastName, stWNumber, stIsFullTime, stTuitionFees);
            // using the student class that we have created
            // because those properties are private, then you can't use them in the other programs like this one
            // we are creating an array of objects inside this main class so we don't have to copy/paste this
            // code for each student, but rather have a loop to keep running it
            //firstStudent.reportOne();
        } while(answer);
        for (Student stInfo:classList) {
            stInfo.reportOne();

        //this is not an efficient way to get the print out, it should be a for loop
//        stList[0].reportOne();
//        stList[1].reportOne();
//        stList[2].reportOne();
//        for (int i = 0; i < stList.length; i++) {
//            stList[i].reportOne(); //this will serve the same functions
        }


    }

}
