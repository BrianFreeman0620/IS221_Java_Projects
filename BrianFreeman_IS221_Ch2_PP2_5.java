/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch2_PP2_5.java
 * Lang:    Java
 * Date:    2021-02-09
 * Author:  Brian Freeman
 * Purpose: This code will convert a temperature in Fahrenheit to Celsius
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-09
 * Desc:    The conversion formula was added for use of an inputted Fahrenheit
 */
package brianfreeman_is221_ch2_pp2;

import java.util.Scanner;

public class BrianFreeman_IS221_Ch2_PP2_5 {
    
    public static void main(String[] args) {
        int intFaren;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a temperature in Farenheit (as a whole number): ");
        intFaren = scan.nextInt();
        int intCelsius = (int) ((intFaren - 32)/1.8);
        
        System.out.println(intFaren + " °F = " + intCelsius + " °C");
    }
    
}
