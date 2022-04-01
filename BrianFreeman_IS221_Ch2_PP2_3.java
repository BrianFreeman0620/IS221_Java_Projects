/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch2_PP2_3.java
 * Lang:    Java
 * Date:    2021-02-09
 * Author:  Brian Freeman
 * Purpose: This code will take 2 floats and finds their sum, difference, and
            product
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-09
 * Desc:    The floats could be inputted to be added, subtracted, and multiplied
            by each other
 */
package brianfreeman_is221_ch2_pp2;

import java.util.Scanner;

public class BrianFreeman_IS221_Ch2_PP2_3 {
    
    public static void main(String[] args) {
        float floatOne, floatTwo;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        floatOne = scan.nextFloat();

        System.out.println("Enter a second number: ");
        floatTwo = scan.nextFloat();
        
        System.out.println(floatOne + " + " + floatTwo + " = " 
                + (floatOne + floatTwo));
        System.out.println(floatOne + " - " + floatTwo + " = " 
                + (floatOne - floatTwo));
        System.out.println(floatOne + " * " + floatTwo + " = " 
                + (floatOne * floatTwo));
    }
    
}
