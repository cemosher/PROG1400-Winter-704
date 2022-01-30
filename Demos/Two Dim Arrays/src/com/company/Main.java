//package com.company;
//
//import org.w3c.dom.ls.LSOutput;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // write your code here
//        Scanner sc = new Scanner(System.in);
//        //declare a two dimensional array
//        int[][] my2DimArray = new int[2][2]; //specify the number of rows and columns
//        //declare an array in a different way
//        int[][] my2ndArray = {{10, 20, 30, 11},
//                {40, 50, 55, 44},
//                {77, 88, 99, 23}}; //for each row, create a new {} with its elements
//
//        System.out.println(my2ndArray.length); //will give you 3 as there are 3 parent elements in the array
//        for (int i = 0; i < 3; i++) { //this is the 3 rows
//            for (int j = 0; j < 4; j++) { //this is the 3 columns
//                System.out.print(my2ndArray[i][j] + "\t"); //print out the 2dim array, \t tabs it over
//            }
//            System.out.println(); //this drops it down to the next level for the next row
//        }
//        System.out.println("Enter my2DimArray's elements : ");
//        for (int i = 0; i < my2DimArray.length; i++) { //this one pulls the rows
//            for (int j = 0; j < my2DimArray[i].length; j++) { //this one pulls the child arrays
//                System.out.print("Enter the element here ");
//                my2DimArray[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < my2DimArray.length; i++) { //this is the 3 rows
//            for (int j = 0; j < my2DimArray[i].length; j++) { //this is the 3 columns
//                System.out.print(my2DimArray[i][j] + "\t"); //print out the 2dim array, \t tabs it over
//            }
//            System.out.println(); //this drops it down to the next level for the next row
//        }
//        int[] my1DimArray = new int[4];
//        int k = 0;
//        for (int i = 0; i < my2DimArray.length; i++) {
//            for (int j = 0; j < my2DimArray[i].length; j++) {
//                my1DimArray[k] = my2DimArray[i][j];
//                k++;
//            }
//        }
//        for (int i = 0; i < my1DimArray.length; i++) {
//            System.out.print(my1DimArray[i] + " ");
//        }
//    }
//}
//
////to turn the double array into a one dim array we need a 3rd variable k to idenify the index position
//    }
//}
//
package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
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
