package com.company;

public class Animal {
    //step 1
    //define an animal class with four properties
    //1. species (ex. lion, cow, anything else)
    //2. max weight (max avg weight of the adult of the species)
    //3. habitat (jungle, ocean, mountain)
    //4. is endangered (flag to indicate whether the animal species is endangered)

    private String species;
    private double maxWeight;
    private String habitat;
    private boolean isEndangered;

    //step 2
    //add a user defined constructor with any constant values that you feel are required
    public Animal() {
        this.setSpecies("Dog");
        this.setMaxWeight(30);
        this.setHabitat("Home");
        this.setEndangered(false);
    }
    //step 3
    //add a parameterized constructor to allow setting of all properties on object creation
    public Animal(String pSpecies, double pMaxWeight, String pHabitat, boolean pIsEndangered) {
        this.setSpecies(pSpecies);
        this.setMaxWeight(pMaxWeight);
        this.setHabitat(pHabitat);
        this.setEndangered(pIsEndangered);
    }


    //step 4
    //determine scope/access of properties
    //are they completely internal to the class?
    //should an external class be permitted to read the property values?
    //should an external class be permitted to change the property values

    //step 5 setters and getters

}