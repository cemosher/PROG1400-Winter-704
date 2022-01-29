package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        // write your code here
//        Scanner sc = new Scanner(System.in); //brings the scanner into the code
//        System.out.print("Enter the student's mark :");
//        double stMark = sc.nextDouble(); //sc calls the scanner, and nextDouble bc we declared it a double
//        //the actual function
//        if (stMark >= 60) { //curly brakcets if you have more than one statement to write
//            System.out.println("Pass");
//        } else { //if it doesn't pass condition one, do this
//            System.out.println("Fail");
//        }
//        if ((stMark >= 90) && (stMark <= 100)) { //&& says and, so it has to meet both conditions
//            System.out.println("Excellent");
//        } else if ((stMark >= 80) && (stMark <= 90)) {
//            System.out.println("Very good");
//        } else
//            System.out.println("Let's check your mark again");
//
//        //we can rewrite the above in nested ifs
//
//        //for loops
//        for (int i = 0; i < 10; i++) { //this is similar to javascript, starting at 0, as long as less than 10, plus 1 each time
//            System.out.println(i);
//        }
//        for (int i = 0; i < 20; i=i+2) {
//            System.out.println(i);
//        }
//        //do while statement
//        //establish a new variable, j
//        System.out.println("Do-While Statement");
//        int j = 0 ;
//        do {
//            System.out.println(j); //do print j while j is less than 10
//            j++; //increases the value of j from 0 until it breaks at the j < 10.
//        } while (j < 10);
//        //if the value of j is already more than the condition it will only run once as it must run once before it can ever
//        //check the condition on it. it will just print the new value once.
//
//        //we can also do while do
//        System.out.println("While Loop");
//        int k = 11;
//        while (k < 10) {
//            System.out.println(k);
//            k++;
//        }
        System.out.println("Nested Loop");
        for (int i = 0; i < 10; i++) { //outer loop
            for (int l = 0; l < 10; l++) { //inner loop
                System.out.print(i + " " + l + " ");
            }
            System.out.println(); //to jump to the next line
        }
        // ********
        // *******
        // ******
        // *****
        // ****
        // ***
        // **
        // *
        // decrease one star each line
        // prompt the user to enter the number of *
        // we need to do this without writing so many ********* statements, we want to use a loop
//        Scanner stars = new Scanner(System.in);
//        System.out.print("Enter a number of stars: ");
//        double numOfStars = stars.nextDouble();
//
//        for (int i = 0; i >= 0; i--) {
//            System.out.println();
//        }

    }
}

