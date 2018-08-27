//Amber Hunter
//24 August 2018
//Prog2_11
//Compute num of mpg of gas for a trip

import java.util.Scanner;

public class Prog2_11
{
    public static void main(String[] args)
    {
        double odo1, odo2, gasUsed, mpg;
        
        Scanner keyboard = new Scanner (System.in);
        // Inputs
        System.out.print("What was the starting odometer reading? ");
        odo1 = keyboard.nextDouble();
        System.out.print("What was the ending odometer reading? ");
        odo2 = keyboard.nextDouble();
        System.out.print("What was the total amt of gas used? ");
        gasUsed = keyboard.nextDouble();
        
        // Equation for Miles per gallon of gas
        mpg = (odo2 - odo1) / gasUsed;
        
        // Outputs
        System.out.println("The MPG for the trip was:++ " + mpg);
    }
}
