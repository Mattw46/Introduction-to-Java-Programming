/*
 * Convert pounds to kilograms
 */
package Chapter2;

import java.util.*;

public class Question2_4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = sc.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println("\n" + pounds + " pounds is " +
                kilograms + " kilograms");
    }
}
