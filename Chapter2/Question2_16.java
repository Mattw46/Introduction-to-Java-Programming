/*
 * Geometry: area of a hexagon
 * 
 * Calculate area of a hexagon when the length of a side is given s
 */
package Chapter2;

import java.util.*;
public class Question2_16 {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = in.nextDouble();
        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(s, 2);
        System.out.println("The area of the hexagon is " + area);
    }
}
