/*
 *Author Name: Nikita Chauhan
 *Date: 30-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp;

public class AutomatedManualTransmission extends Transmission {


    public AutomatedManualTransmission(String typeOfTransmission, String modelNumber, int forwardGear, double gearRatio) {
        super(typeOfTransmission, modelNumber, forwardGear, gearRatio);
        this.modelNumber = modelNumber;
    }

    public AutomatedManualTransmission(String modelNumber) {
        super(modelNumber);
        this.modelNumber = modelNumber;
        double[] gearRatio = {2.540, 1.920, 1.510, 1.000};
        double[] gearRatio1 = {2.950, 1.940, 1.340, 1.000, 0.630};

        if (this.modelNumber.equals("AMTP4")) {
           // System.out.println("Transmission Type : Automated Manual Transmission");
            setTypeOfTransmission("");
            System.out.println("Model Number : AMTP4");
            System.out.println("Key Specifications :");
            System.out.println("1. Forward gear : 4");
            System.out.println("2. 1st Gear Ratio :" + gearRatio[0]);
            System.out.println("3. 2nd Gear Ratio :" + gearRatio[1]);
            System.out.println("4. 3rd Gear Ratio :" + gearRatio[2]);
            System.out.println("5. 4th Gear Ratio :" + gearRatio[3]);
        } else {
            System.out.println("Transmission Type : Automated Manual Transmission");
            System.out.println("Model Number : AMTP5");
            System.out.println("Key Specifications :");
            System.out.println("1. Forward gear : 5");
            System.out.println("2. 1st Gear Ratio :" + gearRatio1[0]);
            System.out.println("3. 2nd Gear Ratio :" + gearRatio1[1]);
            System.out.println("4. 3rd Gear Ratio :" + gearRatio1[2]);
            System.out.println("5. 4th Gear Ratio :" + gearRatio1[3]);
            System.out.println("6. 5th Gear Ratio :" + gearRatio1[4]);
        }
    }
}
