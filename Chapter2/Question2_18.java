/*
 * Print table:
 * 
 * Write a program to display table of powers
 */
package Chapter2;


public class Question2_18 {
    
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        System.out.println("a     b     pow(a, b)");
        while (a <= 5) {
            System.out.println(a + "     " + b + "     " + (int) Math.pow(a, b));
            a++;
            b++;
        }
    }
}
