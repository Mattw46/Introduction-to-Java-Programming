/*
 * Financial application: calculate Interest
 */
package Chapter2;

import java.util.*;

public class Question2_20 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = sc.nextDouble();
        double rate = sc.nextDouble();
        double interest = balance * (rate/1200);
        
        System.out.println("Accumulated value is " + interest);
    }
}
