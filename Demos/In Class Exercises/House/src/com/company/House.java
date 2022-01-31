package com.company;

public class House {

    private String houseAddress;
    private double houseLength;
    private double houseWidth;
    private String houseColor;
    private double numOfFloors;

    public House(String pHouseAddress, double pHouseLength, double pHouseWidth, String pHouseColor, double pNumOfFloors) {
        this.houseAddress = pHouseAddress;
        this.houseLength = pHouseLength;
        this.houseWidth = pHouseWidth;
        this.numOfFloors = pNumOfFloors;
        this.houseColor = pHouseColor;
    }

    public void houseInfo() {
        System.out.println("The house address is " + this.houseAddress + ". The length of the house is " + this.houseLength
                + " feet. The width of the house is " + this.houseWidth + " feet. The number of floors in the house is "
                + this.numOfFloors + ". The color of the house is " + this.houseColor + ".");
    }
    public void printLevelArea() {
        System.out.println("The total square feet of each floor is " + (this.houseLength * this.houseWidth));
    }
    public void printTotalArea() {
        System.out.println("The total square feet of the entire house is " + (this.numOfFloors * (this.houseLength * this.houseWidth)));
    }
}

