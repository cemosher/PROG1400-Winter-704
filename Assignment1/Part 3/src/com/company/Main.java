package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //using arrays, do the following
        //declare a two dim array myArray[3][4] and let the program do the following
        //enter the array's elements from inside the program (pre-defined, not user input)
        //calculate the total sum of the first row in the array
        //calculate the average of all of the array's elements
        //print your results

        //Welcome to the Third Part!
        //The array's elements are:
        //10 20 30 40
        //12 15 18 19
        //10 10 10 10
        //The summation mof Row # 1 is : 100
        //The average for the entire array is: 17
        //Save the previous array as a one dimensional array and print the elements
        int[][] myArray = { {10, 20, 30, 40},
                            {12, 15, 18, 19},
                            {10, 10, 10, 10}}; //declared the 2d array

        System.out.println("Welcome to the Third Part!");
        System.out.println("The array's elements are:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print((myArray[i][j] + "\t"));
            }
            System.out.println();
        }
        //adding myArray[0][0]+myArray[0][1]+myArray[0][2]+myArray[0][3]=total
        double total = 0;
        for (int j = 0; j < myArray[0].length; j++) {
            total = total + myArray[0][j];
        }
        System.out.println("The summation of row # 1 is : " + total);

        double sum = 0;
        double count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                count++;
                sum = sum + myArray[i][j];
            }
        }
        double average = (sum/count);
        System.out.println("The average for the entire array is: " + average);

        int[] myNewArray = new int[12];
        int k = 0; //need the vew variable to represent each location in the 2dim array
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myNewArray[k] = myArray[i][j];
                k++;
            }
        }
        for (int i = 0; i < myNewArray.length; i++) {
            System.out.print(myNewArray[i] + " ");
        }
    }
}
