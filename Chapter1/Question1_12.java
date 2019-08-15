/*
 * Average speed in kilometers.
 * calculate average speed where
 * runner runs 24 miles in 1 hour 40 minutes and 35 seconds
 */
package chapter1;

public class Question1_12 {
    
    public static void main(String[] args) {
        double timeInHours = 1 + (40/60.0) + (35/3600.0);
        System.out.println(((24 / timeInHours) * 1.6 ) + 
                " Kilometers per hour");
    }
    
}
