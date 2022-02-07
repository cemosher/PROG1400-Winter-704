package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Part 1
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
        System.out.println("Welcome to the First Part!");
        System.out.print("Enter the number of asterisks: ");

        Scanner stars = new Scanner(System.in); //this is to get user input
        int numOfStars = stars.nextInt();


        for (int i = numOfStars; i >= 0; i--) { //in order to print i amount of times we use the outer loop
            for (int j = 0; j < i; j++) { //we are print this character j amount of times for each i
                System.out.print("*"); //this is the character we are printing
            }
            System.out.println(); //this drops us to the next line
        }

    }
}
