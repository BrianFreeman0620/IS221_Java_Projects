/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_CH8_PP8_2.java
 * Lang:    Java
 * Date:    2021-03-25
 * Author:  Brian Freeman
 * Purpose: This program will count inputted integers from -25 to 25
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-25
 * Desc:    The loop has been created to accept inputted integers and count them
--------------------------------------------------------------------------------
*/
package brianfreeman_is221_ch8_pp8;

import java.util.Scanner;

public class BrianFreeman_IS221_CH8_PP8_2 {
    
    public static void main(String[] args) {
        
        // Creates an array to store integers with length 51
        int[] arrayIntegerCount = new int[51];
        
        // Creates a scanner object
        Scanner scanIntegers = new Scanner(System.in);
        
        // Creates an integer that will be used for counting and leaving while loop
        int intInputted = -25;
        
        // Loops 50 times
        for(int intStartCount = 0; intStartCount <= 50; intStartCount ++){
            
            // Fills in the rest of the array with 0s, making it length 51
            arrayIntegerCount[intStartCount] = 0;
        }
        
        // Decreases the 0th value because the loop increases it incorrectly
        arrayIntegerCount[0] = -1;
        
        System.out.println("This program will count the integers that are inputted.");
        System.out.println("The range is between -25 and 25.");
        System.out.println("Any integer larger or smaller will show the counts of any integers in range inputted.");
        
        // Checks if the inputted number is between -25 and 25 and leaves loop if not
        while((intInputted <= 25) && (intInputted >= -25)){
        
            // Increases count of corresponding array position
            arrayIntegerCount[(intInputted + 25)] ++;
            
            // Asks for an integer to be incremented and sets intInputted to the value
            System.out.println("Type in an integer betweeen -25 and 25 (other integers will end program): ");
            intInputted = scanIntegers.nextInt();
            
        }
        
        // Checks the array for any value greater than 0 and prints the corresponding
        // integer with its count
        for(int intCounted = 0; intCounted <= 50; intCounted ++){
            
            if(arrayIntegerCount[intCounted] > 0){
                
                System.out.println((intCounted - 25) + " was inputted " + 
                        arrayIntegerCount[intCounted] + " time(s).");
            }
        }
    }
    
}
