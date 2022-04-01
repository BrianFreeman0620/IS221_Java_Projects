/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch3_PP3_2.java
 * Lang:    Java
 * Date:    2021-02-16
 * Author:  Brian Freeman
 * Purpose: This code will take two integers and find the sum of their cubes
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-16
 * Desc:    The integers can be read and have their cubes added together
 */
package brianfreeman_is221_ch3_pp3;

import java.util.Scanner;

public class BrianFreeman_IS221_CH3_PP3_2 {

    public static void main(String[] args) {
        int intCubed1, intCubed2; //Declares two integers intCubed1 and intCubed2
        
        Scanner scanInts = new Scanner(System.in); //Declares scanner scanInts
        
        System.out.print("Type in an integer: ");
        intCubed1 = scanInts.nextInt(); //Sets intCubed1 as inputted integer
        
        System.out.print("Type in a second integer (can be the same as the "
                + "first): ");
        intCubed2 = scanInts.nextInt(); //Sets intCubed2 as inputted integer
        
        int intSumOfCubes = (int) Math.pow(intCubed1, 3) 
                + (int) Math.pow(intCubed2, 3); //Cubes intCubed1 and intCubed2
                                                //and adds them together
        
        System.out.println(intCubed1 + "^3 + " + intCubed2 + "^3 = "
                + intSumOfCubes); //Prints intSumOfCubes
        
    }
    
}
