/*
 * Science: wind-chill temperature
 * Calculate how cold outside.
 * 
 * Prompt user for temperature in degrees Fahrenheit between -58 and 41.
 * Prompt the user for wind speed greater than 2.
 * See text for more details
 */
package Chapter2;

import java.util.*;

public class Question2_17 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double temp = sc.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double miles = sc.nextDouble();
        double index = 35.74 + (0.6215 * temp) -35.75 * Math.pow(miles, 0.16) +
                0.4275 * temp * Math.pow(miles,0.16);
        System.out.println("The wind chill index is " + index);
    }
}
