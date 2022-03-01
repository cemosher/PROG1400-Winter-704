package com.company;

public class Animal {
    //define an animal class with four properties: species, maxweight, habitat, and is endangered
    private String species;
    private double maxWeight;
    private String habitat;
    private boolean isEndangered;

    //step 2 add user defined constructor without parameters
    public Animal() {
        this.setSpecies("Dog");
        this.setMaxWeight(40);
        this.setHabitat("Home");
        this.setEndangered(false);
    }

    //step 3 add a constructor with parameters
    public Animal(String pSpecies, double pMaxWeight, String pHabitat, boolean pIsEndangered) {
        this.setSpecies(pSpecies);
        this.setMaxWeight(pMaxWeight);
        this.setHabitat(pHabitat);
        this.setEndangered(pIsEndangered);
    }

    //step 4 scope/access

    //step 5 create appropriate getters/setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    //step 6 create three methods involving the animal objects
    public String Feed() {
        return String.format("Feed a %s a Steak", this.species);
    }

    public String makeSound() {
        String sound = "----";
        return String.format("A %s can make a %s sound", this.species, sound);
    }

    public String toString() {
        String animalStatus = "Not endangered";
        if (this.isEndangered==true)
            animalStatus = "Endangered";

        return String.format("I am a %.2f lb %s that lives in the %s. I am an %s species.",
            this.maxWeight, this.species, this.habitat, animalStatus);
    }

}
