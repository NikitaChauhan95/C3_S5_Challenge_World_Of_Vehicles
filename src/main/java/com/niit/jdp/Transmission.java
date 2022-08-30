/*
 *Author Name: Nikita Chauhan
 *Date: 30-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp;

public class Transmission {
    String typeOfTransmission;
    String modelNumber;
    int forwardGear;
    double gearRatio;

    public Transmission() {
    }

    public Transmission(String typeOfTransmission, String modelNumber, int forwardGear, double gearRatio) {
        this.typeOfTransmission = typeOfTransmission;
        this.modelNumber = modelNumber;
        this.forwardGear = forwardGear;
        this.gearRatio = gearRatio;
    }

    void showSpecs(){
        System.out.println("Transmission Type : " +typeOfTransmission);
        System.out.println("Transmission Model Number : " +modelNumber);
        System.out.println("Key Specifications : " +forwardGear +" " +gearRatio);
    }
}
