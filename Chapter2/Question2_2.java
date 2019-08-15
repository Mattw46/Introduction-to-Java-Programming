package Chapter2;

import java.util.Scanner;

/*
 * Read in radius and lenght of a cylinder then calculate volume
*/
public class Question2_2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radius and length of a cylinder: ");
      double radius = sc.nextDouble();
      double length = sc.nextDouble();
      double area = radius * radius * Math.PI;
      double volume = area * length;
      System.out.println("\nThe area is " + area);
      System.out.println("The volumne is " + volume);
   }
}