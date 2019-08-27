/*
 * Physics: finding runway length
 * 
 * Given an airplane's acceleration a and take-off speed v,
 * you can compute the minimum runway length needed for an airplan to
 * take off. (See text for formula)
 * 
 */
package Chapter2;

import java.util.*;

public class Question2_12 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed and acceleration:");
        double v = sc.nextDouble();
        double a = sc.nextDouble();
        double length = Math.pow(v, 2) / (2*a);
        System.out.println("The minimum runway length for this " +
                "airplane is " + length);
    }
}
