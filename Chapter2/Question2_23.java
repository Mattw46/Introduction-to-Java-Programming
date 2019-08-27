/*
 * Cost of driving:
 *
 * Write a program to prompt the user for distance to drive,
 * the fuel efficiency of the car in miles per galon, and the
 * price per gallon.
 */
package Chapter2;

import java.util.*;

public class Question2_23 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = sc.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = sc.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = sc.nextDouble();
        double cost = (distance / milesPerGallon) * price;
        System.out.println("The cost of driving is " + cost);
    }
}
