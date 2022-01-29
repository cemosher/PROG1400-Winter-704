package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int shipFee = 10;

        System.out.println("Welcome to my store!");

        Scanner shipping = new Scanner(System.in);
        System.out.print("What is the total of your order? ");
        double orderTotal = shipping.nextDouble();

        if (orderTotal >= 50) {
            double shippingTotal = orderTotal;
            System.out.println("You qualify for free shipping! Your total is " + shippingTotal);
        } else {
            double shippingTotal = shipFee + orderTotal;
            System.out.println("Your total today including shipping is $" + shippingTotal);
        }


    }
}




// calculate the shipping charges for a shopper
// display a welcome message
// ask the user to enter the amount for their total purchase
// if their total is under $50, add $10
// if their order is over or equal to $50, free shipping
// tell the user their final total including shipping costs
// Don't worry about proper currency formatting or rounding
