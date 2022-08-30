/*
 *Author Name: Nikita Chauhan
 *Date: 30-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp;

public class Transmission {
    String modelNumber;
    int forwardGear;
    double gearRatio;

    public Transmission() {
    }

    public Transmission(String modelNumber, int forwardGear, double gearRatio) {
        this.modelNumber = modelNumber;
        this.forwardGear = forwardGear;
        this.gearRatio = gearRatio;
    }
}
