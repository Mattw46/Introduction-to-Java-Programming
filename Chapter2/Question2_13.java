/*
 * Financial application: compound value
 * 
 * Prompt user for amount then display balance after 6 months
 * The interest rate is 5%
 */
package Chapter2;

import java.util.*;

public class Question2_13 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the monthly saving amount: ");
        int amount = sc.nextInt();
        double balance = 0;
        for (int i = 0; i < 6; i++) {
            balance = (amount + balance) * (1 + (0.05/12));
        }
        System.out.println("After the sixth month, the account value is: " + 
                balance);
    }
}
