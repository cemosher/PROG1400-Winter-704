package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
            //add your constant variables here so they are established
            double priceOfCoffee = 1.25;
            double salesTax = 1.15;
            double priceOfCake = 3.25;
        System.out.println("Welcome to the Coffee Shop!");
        //println stands for print line and move to next line.
        //we don't want to move to the next line for the enter, so change to print only
        System.out.print("Enter the number of cups: "); //these will print out, but do not ask for user input
        // create a new scanner object. this will look for input from the terminal
        Scanner scannerName = new Scanner(System.in); //this says assign the scanner the name scannerName and the right
        //hand side is a new scanner to take this parameter
        //we have to create a variable in order to enter number of cups
        int numOfCups = scannerName.nextInt(); //int says that we are creating a variable called numOfCups that must be an integer

        System.out.print("Enter the number of cakes: ");
        int numOfCakes = scannerName.nextInt();


        System.out.println("Number of cups is: " + numOfCups); //now it will print out whatever the input was
        System.out.println("Number of cakes is: " + numOfCakes);
        //the plus signs allows us to concantenate them together

        //calculating the total order
        //declare a new variable to save the pretax total in
        //both the cost of coffee $1.25 and the tax 15% are constants
        double preTaxTotal = (numOfCups * priceOfCoffee) + (numOfCakes * priceOfCake); //a double is a float, number with decimal
        System.out.println("Your pretax total is $" + preTaxTotal);
        //this produces a number with infinite decimal places
        double postTaxTotal = preTaxTotal * salesTax;
        System.out.printf("Your final total is $% .2f",  postTaxTotal);
        //printf changes to print format. the % is considered to be a placeholder. the .2f says to use 2 decimals,
        //similar concept to fstrings in python
        //n will also skip to the next line down

    }
}
