/*
 * Algebra: Solve 2x2 linear equation
 * ## See textbook for full question and equation
 */
package chapter1;

public class Question1_13 {
    
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double x, y;
        
        x = ((e*d) - (b*f)) / ((a*d) - (b*c));
        y = (e*d - e*c) / (a*d - b*c);
        
        System.out.println("x: " + x + " y: " + y);
    }
    
}
