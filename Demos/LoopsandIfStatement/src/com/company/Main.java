package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in); //brings the scanner into the code
        System.out.print("Enter the student's mark :");
        double stMark = sc.nextDouble(); //sc calls the scanner, and nextDouble bc we declared it a double
        //the actual function
        if (stMark >= 60) { //curly brakcets if you have more than one statement to write
            System.out.println("Pass");
        } else { //if it doesn't pass condition one, do this
            System.out.println("Fail");
        }
        if ((stMark >= 90)&&(stMark<=100)) { //&& says and, so it has to meet both conditions

        }
    }
}
