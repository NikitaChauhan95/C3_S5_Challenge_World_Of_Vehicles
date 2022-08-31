/*
 *Author Name: Nikita Chauhan
 *Date: 30-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp;

public class AutomaticCVT extends Transmission {



    public AutomaticCVT(String typeOfTransmission, String modelNumber, int forwardGear, double gearRatio) {
        super(typeOfTransmission, modelNumber, forwardGear, gearRatio);
        this.modelNumber = modelNumber;
    }

    public AutomaticCVT(String modelNumber) {
        super(modelNumber);
        this.modelNumber = modelNumber;
        double[] gearRatio = {2.631, 1.440, 1.165, 0.096, 0.680, 0.499};

        if (this.modelNumber.equals("CVT6")) {
            System.out.println("Transmission Type : Automated Manual Transmission");
            System.out.println("Model Number : CVT6");
            System.out.println("Key Specifications :");
            System.out.println("1. Forward gear : 6");
            System.out.println("2. 1st Gear Ratio :" + gearRatio[0]);
            System.out.println("3. 2nd Gear Ratio :" + gearRatio[1]);
            System.out.println("4. 3rd Gear Ratio :" + gearRatio[2]);
            System.out.println("5. 4th Gear Ratio :" + gearRatio[3]);
            System.out.println("6. 5th Gear Ratio : " +gearRatio[4]);
            System.out.println("7. 6th Gear Ratio : " +gearRatio[5]);
        }
    }
}
