/*
 * Geometery: distance of two points
 * 
 * Write a program to prompt user for two points (x1, y1) and (x2,y2)
 * and display the distance between them. (see text for formula)
 */
package Chapter2;

import java.util.*;

public class Question2_15 {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        System.out.println("The distance between the two points is " + distance);
    }
}
