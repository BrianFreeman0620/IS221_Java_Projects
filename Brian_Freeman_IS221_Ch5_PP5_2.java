/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch5_PP5_2.java
 * Lang:    Java
 * Date:    2021-03-02
 * Author:  Brian Freeman
 * Purpose: This code will figure out if a year is a leap year and can run
 *          multiple times
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-02
 * Desc:    The if, else, and while loops have been implemented to find leap years
 */
package brian_freeman_is221_ch5_pp5;

import java.util.Scanner;

public class Brian_Freeman_IS221_Ch5_PP5_2 {
    
    public static void main(String[] args) {
        // Creates a boolean String to end the while loop
        String boolEndLoop = "YES";
        
        // scanLeapYear is a Scanner that takes input for the year integer
        // and the end loop String
        Scanner scanLeapYear = new Scanner(System.in);
        
        System.out.println("This program will tell you if the year is a leap year");
        
        // The while loop will end when the user does not type in yes in either
        // upper or lower case, or a mixture of both
        while (boolEndLoop.toUpperCase().equals("YES")){
            System.out.print("Give a year greater than 1581 as an integer: ");
            int intLeapYear = scanLeapYear.nextInt();
            // Checks if the year is too small and gives an error message if it is
            if (intLeapYear < 1582){
                System.out.println("The number " + intLeapYear + " is less than "
                        + "1582\nPlease try again");
            }
            else{
               // Checks if it is a leap year not divisible by 400
               if ((intLeapYear%4 == 0) && (intLeapYear%100 != 0)){
                   System.out.println(intLeapYear + " is a leap year");
               }
               else{
                   // Checks if it is a leap year divisible by 400
                   if (intLeapYear%400 == 0){
                       System.out.println(intLeapYear + " is a leap year");
                   }
                   // If it does not pass either leap year test, it will run
                   // and say it isn't a leap year
                   else{
                       System.out.println(intLeapYear + " is not a leap year");
                   }
               }
            }
            // Gives the while loop an out by inputting anything but yes
            System.out.println("Would you like to try another number? Type 'yes' if you would: ");
            boolEndLoop = scanLeapYear.next();
        }
    }
    
}
