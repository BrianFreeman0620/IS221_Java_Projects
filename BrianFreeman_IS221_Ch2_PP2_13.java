/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch2_PP2_13.java
 * Lang:    Java
 * Date:    2021-02-10
 * Author:  Brian Freeman
 * Purpose: This code will take two integers and find the decimal equivalent
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-10
 * Desc:    The integers can be accepted and turned into a decimal
 */
package brianfreeman_is221_ch2_pp2;

import java.util.Scanner;

public class BrianFreeman_IS221_Ch2_PP2_13 {
    
    public static void main(String[] args) {
        int intNumerator, intDenominator;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an integer for the numerator: ");
        intNumerator = scan.nextInt();
        
        System.out.print("Enter an integer for the denominator: ");
        intDenominator = scan.nextInt();
        
        float floatDecimal = (float) intNumerator / (float) intDenominator;
        System.out.println(intNumerator + "/" + intDenominator + " = " + floatDecimal);
    }
    
}
