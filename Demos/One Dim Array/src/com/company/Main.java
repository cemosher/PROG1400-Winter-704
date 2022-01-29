package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in); // creates the scanner for user input
        double[] stMarks = new double[5]; //this creates the array called stMarks and gives it 5 elements
        System.out.println(stMarks.length);
        System.out.println("Adding elements to the array");

        for (int i = 0; i < stMarks.length; i++) {
            System.out.println("Enter mark number " + (i+1)); //just using i would start this at 0 as i=0; the + sign is concatenation, not arithmetic
            stMarks[i] = sc.nextDouble(); // prompt the user to enter the element for the array
        }
        for (int i = 0; i < stMarks.length; i++) {
            System.out.println(stMarks[i]);
        }
    }
}
