package com.company;

public class Food {
    //define properties
    private String foodName;
    private String foodType;

    //constructor
    public Food(String pFoodName, String pFoodType) {
        this.setFoodName(pFoodName);
        this.setFoodType(pFoodType);
    }

    //create getters and setters


    //method
    public String eatIt() {return String.format("You just ate %s", this.getFoodName());}
    public String denyIt() {return String.format("I can't eat a food that is %s", this.getFoodType());}

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
