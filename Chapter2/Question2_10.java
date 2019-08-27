/*
 * Science: calculate energy
 * 
 * formula Q = M * (finalTempreture - initialTemprature) * 4184
 * where M is weight of water ini kilograms, temperatures are 
 * in degrees celcius and energy Q is measured in kilograms
 */
package Chapter2;

import java.util.*;

public class Question2_10 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);          
        System.out.print("Enter the amount of water in kilograms: ");
        double kg = sc.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemp = sc.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = sc.nextDouble();
        double energy = kg * (initialTemp - finalTemp) *4184;
        System.out.println("The energy needed is " + energy);
    }
}
