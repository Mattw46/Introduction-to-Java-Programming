/*
 * Sum the digits in an integer
 */
package Chapter2;

import java.util.*;

public class Question2_6 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number between 0 and 1000: ");
        int number = sc.nextInt();
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
}
