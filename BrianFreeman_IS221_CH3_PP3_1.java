/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch3_PP3_1.java
 * Lang:    Java
 * Date:    2021-02-16
 * Author:  Brian Freeman
 * Purpose: This code will take two names and create a string using the 
 *          characters and a random integer
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-16
 * Desc:    The names are accepted and changed into the format required
 */
package brianfreeman_is221_ch3_pp3;

import java.util.Scanner;
import java.util.Random;

public class BrianFreeman_IS221_CH3_PP3_1 {

    public static void main(String[] args) {
        String strFirstName, strLastName; //Declares two strings strFirstName 
                                          //and strLastName
        
        Scanner scanNames = new Scanner(System.in); //Declares scanner scanNames
        Random randomInteger = new Random(); //Declares random randomInteger 
        
        System.out.print("What is your first name? ");
        strFirstName = scanNames.next(); //Sets strFirstName as inputted string
        
        System.out.print("What is your last name? ");
        strLastName = scanNames.next(); //Sets strLastName as inputted string
        
        int intRandom =  randomInteger.nextInt(90) + 10; //Randomly generates a 
                                                         //number between 10 
                                                         //and 99
        
        String strCombineName = strFirstName.substring(0, 1) 
                + strLastName.substring(0, 5) 
                + intRandom; //Combines first letter of strFirstName, first five 
                             //letters of strLastName, and the randomly 
                             //generated number
        
        System.out.println("Your generated username is: " 
                + strCombineName); //Prints strCombineName
        
    }
    
}
