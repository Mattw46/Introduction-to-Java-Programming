/*
 * Population projection.
 * 
 * Rewrite Programming Exercise 1.11 to prompt user for
 * number of years
 */
package Chapter2;

import java.util.Scanner;


public class Question2_11 {
    
    public static void main(String[] args) {
        double birthsRateInSeconds = 7;
        double deathRateInSeconds = 13;
        double immigrantsPerYear = 45;
        double population = 312032486;
        
        double secondsInYears = 60 * 60 * 24 * 365;
        
        double numBirths = secondsInYears / birthsRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / immigrantsPerYear;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of years:");
        int years = sc.nextInt();
        
        for (int i = 1; i <= years; i++) {
            population += numBirths + numImmigrants - numDeaths;
            //System.out.println("Year " + i + " = " + (int)population);
        }
        System.out.println("The population in " + years + " years is " +
                (int) population);
    }
    
}
