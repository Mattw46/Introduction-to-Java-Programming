/*
 * Health application: computing BMI
 * 
 * Write a program that prompts the user to enter a weight in pounds
 * and hieght in inches and display the BMI. Note that one pound is 
 * 0.45359237 kilograms and one inch is 0.0254 meters.
 */
package Chapter2;

import java.util.*;

public class Question2_14 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final double KILOGRAMS_PER_POUNDS = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        double bmi = (pounds * KILOGRAMS_PER_POUNDS) / Math.pow((height * 
                METERS_PER_INCH),2);
        System.out.println("BMI is " + bmi);
    }
}
