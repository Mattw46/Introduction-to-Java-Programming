/*
 * Convert feet into meters
 */
package Chapter2;

import java.util.*;


public class Question2_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = sc.nextDouble();
        double meters = feet * 0.305;
        System.out.println("\n" + feet + " feet is " +
                meters + " meters");
    }
}
