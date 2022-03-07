package com.company;

public class Food {
    //define properties
    private String foodName;
    public String foodType;

    //constructor
    public Food(String pFoodName, String pFoodType) {
        this.setFoodName(pFoodName);
        this.setFoodType(pFoodType);
    }

    //create getters and setters


    //method
    public String eatIt() {return String.format("You just ate %s", this.getFoodName());}
    public String denyIt() {return String.format("I can't eat a good that is %s", this.foodType);}

}
