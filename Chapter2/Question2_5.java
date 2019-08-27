/*
 * Financial application: calculate tips
 */
package Chapter2;

import java.util.*;

public class Question2_5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double amount = sc.nextInt();
        double rate = sc.nextDouble() / 100;
        double gratuity = amount * rate;
        amount += gratuity;
        System.out.println("\n The gratuity is " + gratuity +
                " and total is " + amount);
        
    }
}
