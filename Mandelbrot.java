
/**
 * Write a description of class Mandelbrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class Mandelbrot
{
    

    public static void main (String [] args) {
      String keepGoing="y";
     
        double z=0; 
        double c=0.25;
        double epsilon;
        System.out.print("Please enter epsilon: ");
        Scanner sc= new Scanner(System.in);
        epsilon=sc.nextDouble();
        c=c+epsilon;
        int ctr=0;
        while (z<2) {
        z=Math.pow(z,2)+c;
        ctr++;
    }
        System.out.print("\n"+ctr);
        System.out.print("\n"+(Math.pow(epsilon, 0.5)*ctr)+"\n");
        
    
        
        
    }
}
