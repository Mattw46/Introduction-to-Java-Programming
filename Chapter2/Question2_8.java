/*
 * Current time: Enter offset from GMT to get current time
 */
package Chapter2;

import java.util.*;

public class Question2_8 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = sc.nextInt();
        
        // Total milliseconds since midnight Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // Total seconds since midnight Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;
        
        // current seconds
        long currentSeconds = totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        
        currentHour += offset;
        
        System.out.println("\nCurrent time is " + currentHour + 
                ":" + currentMinutes + ":" + currentSeconds);
    }
}
