package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] stMarks = new double[10];
        System.out.println(stMarks.length);
        System.out.println("Welcome to the Second Part!");
        System.out.println("Enter the student marks: ");
        Scanner marks = new Scanner(System.in);
//
        for (int i = 0; i <= 9; i++) { //because of index 0
            System.out.print("Enter mark # " + (i + 1) + " : ");
            stMarks[i] = marks.nextDouble();
        }
//        for (int i = 0; i <= 9; i++) {
//            System.out.print(stMarks[i] + " "); //this isn't part of the assignment, just wanted to see it
//        }
        System.out.println("Final Report:");
        double total = 0;
        for (int j = 0; j <= 9; j++) {
            total = total + stMarks[j];
        }
        System.out.println("The Total Marks: " + total);

        System.out.println("The Average: " + (total / stMarks.length));

        double myMax = stMarks[0];
        for (int i = 1; i < stMarks.length; i++) {
            if (stMarks[i] > myMax) {
                myMax = stMarks[i];
            }
        }
        System.out.println("The Maximum Value: " + myMax);

        double myMin = stMarks[0];
        for (int i = 1; i < stMarks.length; i++) {
            if (stMarks[i] < myMin) {
                myMin = stMarks[i];
            }
        }
        System.out.println("The Minimum Value: " + myMin);
    }
}


//Assignment 1 part 2
//Using arrays, declare a 1d array that has 10 students marks
//fill out the total of all marks, average, minimum value, and maximum value