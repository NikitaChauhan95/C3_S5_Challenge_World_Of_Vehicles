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

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getForwardGear() {
        return forwardGear;
    }

    public void setForwardGear(int forwardGear) {
        this.forwardGear = forwardGear;
    }

    public double getGearRatio() {
        return gearRatio;
    }

    public void setGearRatio(double gearRatio) {
        this.gearRatio = gearRatio;
    }

    void showSpecs(){
        System.out.println("Transmission Type : " +typeOfTransmission);
        System.out.println("Transmission Model Number : " +modelNumber);
        System.out.println("Key Specifications : " +forwardGear +" " +gearRatio);
    }
}
