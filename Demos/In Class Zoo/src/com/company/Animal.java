package com.company;

public class Animal {
    //Member variables
    //Step 1 define an Animal class with 4 properties
    private String species;
    private int weight;
    private String habitat;
    private String isEndangered;
    private String noise; //added an extra one

    //Step 2 add a default constructor
    //Default Constructor
    public Animal() {
        this.setSpecies("cat");
        this.setWeight(12);
        this.setHabitat("home");
        this.setEndangered("not an endangered");
        this.setNoise("meow");
    }
    //Step 3 Add a parameterized constructor
    //Parameterized Constructor
    public Animal(String species, int weight, String habitat, String isEndangered, String noise) {
        this.setSpecies(species);
        this.setWeight(weight);
        this.setHabitat(habitat);
        this.setEndangered(isEndangered);
        this.setNoise(noise);
    }
    //Step 4 Getters and Setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getEndangered() {
        return isEndangered;
    }

    public void setEndangered(String endangered) {
        isEndangered = endangered;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    //Step 6 Methods
    public String toString() {
        return species + " can be fed steak.";
    }
    public String toString1() {
        return species + " makes a " + noise + " sound.";
    }
    public String toString2() {
        return "I am a " + weight + "lb " + species + " who lives in a " + habitat + ". I am " + isEndangered + " species.";
    }

}

//Step 4 Determine the scope and access of the properties

//Are they completely internal to the class?
//  they are public and available outside of the class

//Should an external class be permitted to read the property values?

//Should an external class be permitted to change the property values?
