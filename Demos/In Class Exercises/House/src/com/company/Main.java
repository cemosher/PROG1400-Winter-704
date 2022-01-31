package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        House houseList[] = new House[1];

        for (int i = 0; i < 1; i++) {
            System.out.print("Enter the house address: ");
            String houseAddress = sc.nextLine();
            System.out.print("Enter the length of the house: ");
            double houseLength = sc.nextDouble();
            System.out.print("Enter the width of the house: ");
            double houseWidth = sc.nextDouble();
            System.out.print("Enter the number of floors: ");
            double houseNumOfFloors = sc.nextDouble();
            System.out.print("Enter the color of the house: ");
            String houseColor = sc.nextLine();
            sc.nextLine();


            houseList[i] = new House(houseAddress, houseLength, houseWidth, houseColor, houseNumOfFloors);
        }
            for (int i = 0; i < 3; i++) {
                houseList[i].houseInfo();
                houseList[i].printLevelArea();
                houseList[i].printTotalArea();
            }
        }
    }
//same as the student program

//Create a program with two classes main and house
//main will run the program and interact with the house class
//define properties for length, width, and at least two other properties
//a method called printTotalArea() to print the square footage
//another method of our choice to print a description of its action
//create 3 instances of different house objects from the main class, assigning values via the constructor
//write code to invoke the methods of each of the house objects we made. at minimum, each house area should be printed

//properties are used to describe attributes of an object while methods are actions the object can do
//don't forget to add a constructor to the house class


