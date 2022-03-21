package com.company;


public class Main {
    public static void main(String[] args) {
        Food[] picnicBasket = new Food[3];
        Food eatCheese = new Food("Cheese", "dairy");
        Food eatPopcorn = new Food("Popcorn", "snack food");
        Food eatBroccoli = new Food("Broccoli", "vegetables");

        //add them to the array picnicBasket
        picnicBasket[0] = eatCheese;
        picnicBasket[1] = eatPopcorn;
        picnicBasket[2] = eatBroccoli;

        System.out.println(eatCheese.eatIt());
        System.out.println(eatPopcorn.eatIt());
        System.out.println(eatBroccoli.denyIt());

    }
}
