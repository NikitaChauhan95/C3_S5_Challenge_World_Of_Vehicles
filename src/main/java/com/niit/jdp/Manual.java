/*
 *Author Name: Nikita Chauhan
 *Date: 30-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp;

public class Manual extends Transmission {

    public Manual(String typeOfTransmission, String modelNumber, int forwardGear, double gearRatio, double[] gearRatio1, double[] gearRatio11, double[] gearRatio2, double[] gearRatio3, double[] gearRatio4) {
        super(typeOfTransmission, modelNumber, forwardGear, gearRatio);
        this.modelNumber = modelNumber;
    }

    public Manual(String modelNumber) {
        super(modelNumber);
        this.modelNumber = modelNumber;
        double[] gearRatio = {2.540, 1.920, 1.510, 1.000};
        double[] gearRatio1 = {3.545, 1.904, 1.280, 0.914, 0.757};
        double[] gearRatio2 = {3.010, 2.070, 1.430, 1.000, 0.710, 0.570};
        double[] gearRatio3 = {3.545, 1.904, 1.233, 0.914, 0.727};
        double[] gearRatio4 = {3.610, 2.270, 1.430, 1.000, 0.750, 0.630};
    if (this.modelNumber.equals("MP4")) {
            System.out.println("Transmission Type : Manual");
            System.out.println("Model Number : MP4");
            System.out.println("Key Specifications :");
            System.out.println("1. Forward gear : 4");
            System.out.println("2. 1st Gear Ratio :" + gearRatio[0]);
            System.out.println("3. 2nd Gear Ratio :" + gearRatio[1]);
            System.out.println("4. 3rd Gear Ratio :" + gearRatio[2]);
            System.out.println("5. 4th Gear Ratio :" + gearRatio[3]);
        } else if (this.modelNumber.equals("MP5")) {
            System.out.println("Transmission Type : Manual");
            System.out.println("Model Number : MP5");
            System.out.println("Key Specifications :");
            System.out.println("1. Forward gear : 5");
            System.out.println("2. 1st Gear Ratio :" + gearRatio1[0]);
            System.out.println("3. 2nd Gear Ratio :" + gearRatio1[1]);
            System.out.println("4. 3rd Gear Ratio :" + gearRatio1[2]);
            System.out.println("5. 4th Gear Ratio :" + gearRatio1[3]);
            System.out.println("6. 5th Gear Ratio :" + gearRatio1[4]);
        } else if (this.modelNumber.equals("MP6")) {
            System.out.println("Transmission Type : Manual");
            System.out.println("Model Number : MP6");
            System.out.println("Key Specifications :");
            System.out.println("1. Forward gear : 6");
            System.out.println("2. 1st Gear Ratio :" + gearRatio2[0]);
            System.out.println("3. 2nd Gear Ratio :" + gearRatio2[1]);
            System.out.println("4. 3rd Gear Ratio :" + gearRatio2[2]);
            System.out.println("5. 4th Gear Ratio :" + gearRatio2[3]);
            System.out.println("6. 5th Gear Ratio :" + gearRatio2[4]);
            System.out.println("7. 6th Gear Ratio :" + gearRatio2[5]);
        } else if (this.modelNumber.equals("MD5")) {
            System.out.println("Transmission Type : Manual");
            System.out.println("Model Number : MD5");
            System.out.println("Key Specifications :");
            System.out.println("1. Forward gear : 5");
            System.out.println("2. 1st Gear Ratio :" + gearRatio3[0]);
            System.out.println("3. 2nd Gear Ratio :" + gearRatio3[1]);
            System.out.println("4. 3rd Gear Ratio :" + gearRatio3[2]);
            System.out.println("5. 4th Gear Ratio :" + gearRatio3[3]);
            System.out.println("6. 5th Gear Ratio :" + gearRatio3[4]);
        } else
         {
            System.out.println("Transmission Type : Manual");
            System.out.println("Model Number : MD6");
            System.out.println("Key Specifications :");
            System.out.println("1. Forward gear : 6");
            System.out.println("2. 1st Gear Ratio :" + gearRatio4[0]);
            System.out.println("3. 2nd Gear Ratio :" + gearRatio4[1]);
            System.out.println("4. 3rd Gear Ratio :" + gearRatio4[2]);
            System.out.println("5. 4th Gear Ratio :" + gearRatio4[3]);
            System.out.println("6. 5th Gear Ratio :" + gearRatio4[4]);
            System.out.println("7. 6th Gear Ratio :" + gearRatio4[5]);


        }
    }
}
