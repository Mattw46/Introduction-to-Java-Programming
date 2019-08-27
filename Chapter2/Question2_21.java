/*
 * Financial application: calculate future investment value
 */
package Chapter2;

//import java.util.Scanner;

import java.util.*;

public class Question2_21 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        double years = sc.nextDouble();
        double futureValue = amount * Math.pow(1 + (rate /1200),years*12);
        System.out.println("Accumulated value is " + futureValue);
    }
}
