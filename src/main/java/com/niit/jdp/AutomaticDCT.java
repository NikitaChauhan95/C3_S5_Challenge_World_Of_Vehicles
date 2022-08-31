/*
 *Author Name: Nikita Chauhan
 *Date: 30-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp;

public class AutomaticDCT extends Transmission {


    public AutomaticDCT(String typeOfTransmission, String modelNumber, int forwardGear, double gearRatio) {
        super(typeOfTransmission, modelNumber, forwardGear, gearRatio);
        this.modelNumber = modelNumber;
    }

    public AutomaticDCT(String modelNumber) {
        super(modelNumber);
        this.modelNumber = modelNumber;
        double[] gearRatio = {4.714, 3.143, 2.106, 1.667, 1.285, 1.000, 0.839, 0.667};

        if (this.modelNumber.equals("DCT8")) {
            System.out.println("Transmission Type : Automated Manual Transmission");
            System.out.println("Model Number : DCT8");
            System.out.println("Key Specifications :");
            System.out.println("1. Forward gear : 8");
            System.out.println("2. 1st Gear Ratio :" + gearRatio[0]);
            System.out.println("3. 2nd Gear Ratio :" + gearRatio[1]);
            System.out.println("4. 3rd Gear Ratio :" + gearRatio[2]);
            System.out.println("5. 4th Gear Ratio :" + gearRatio[3]);
            System.out.println("6. 5th Gear Ratio : " +gearRatio[4]);
            System.out.println("7. 6th Gear Ratio : " +gearRatio[5]);
            System.out.println("8. 7th Gear Ratio : " +gearRatio[6]);
            System.out.println("9. 8th Gear Ratio : " +gearRatio[7]);
        }
    }
}

