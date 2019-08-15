/*
 * Population Projection: given following rates:
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * Current population fo 312,032,486
 * Calculate annual population for next 5 years.
 */
package chapter1;

public class Question1_11 {
    
    public static void main(String[] args) {
        double birthsRateInSeconds = 7;
        double deathRateInSeconds = 13;
        double immigrantsPerYear = 45;
        double population = 312032486;
        
        double secondsInYears = 60 * 60 * 24 * 365;
        
        double numBirths = secondsInYears / birthsRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / immigrantsPerYear;
        
        for (int i = 1; i <= 5; i++) {
            population += numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + (int)population);
        }
    }
    
}
