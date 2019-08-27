/*
 * Question from 8th edition
 * 
 * Enter number between 0 and 128 to get character
 */
package Chapter2;

import java.util.*;

public class Question2_8_8thEd {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int num = sc.nextInt();
        char c = (char) num;
        System.out.println("\nThe character for ASCII code " + num + 
                " is " + c);
    }
}
