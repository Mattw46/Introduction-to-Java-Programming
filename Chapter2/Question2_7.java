/*
 * Find the number of years
 */
package Chapter2;

import java.util.*;

public class Question2_7 {
    
    public static void main(String args[]) {
        final int MINUTES_IN_DAY = 60 * 24;
        final int MINUTES_IN_YEAR = 60 * 24 * 365;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        int years = minutes / MINUTES_IN_YEAR;
        int days = (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY;
        
        System.out.println("\n" + minutes + " minutes is approximately " +
                years + " years and " + days + " days");
    }
}
