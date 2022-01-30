package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner grade = new Scanner(System.in);
        String[] myVar1 = {"A", "B", "C", "D", "E", "F"};
        double[] myVar2 = {5, 4, 3, 2, 1, 0};

        while (true) {
            System.out.print("Enter a letter grade: ");
            String input = grade.nextLine();
            for (int i = 0; i < myVar1.length; i++) {
                if (input.equals(myVar1[i])) {
                    System.out.println(myVar2[i] + " is your numerical grade.");
                }
            }
        }
    }
}

// create a java program that converts a letter grade
// into it's numeric counterpart. Start by creating
// two arrays, one with letters, one with grades
// ask the user to enter a letter grade
// determine and output the corresponding numeric grade
//with an appropriate message