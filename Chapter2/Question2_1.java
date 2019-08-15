package Chapter2;

import java.util.Scanner;

/*
 * Read in degrees in Celsius and convert to Fahrenheit
*/
public class Question2_1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Degrees in Celsius: ");
      double celsius = sc.nextDouble();
      double fahrenheit = (9.0/5) * celsius + 32;
      System.out.println("\n" + celsius + " Celsius is " + fahrenheit + " Fehrenheit");
   }
}