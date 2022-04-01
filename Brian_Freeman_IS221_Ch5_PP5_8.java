/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch5_PP5_8.java
 * Lang:    Java
 * Date:    2021-03-04
 * Author:  Brian Freeman
 * Purpose: This code will imitate a slot machine and respond with appropriate
 *          messages
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-04
 * Desc:    The slotMachine class has been implemented and can be used by the
 *          main class
 */
package brian_freeman_is221_ch5_pp5;

import java.util.Random;
import java.util.Scanner;

public class Brian_Freeman_IS221_Ch5_PP5_8 {
    
    public static void main(String[] args) {
        // Creates the slotMachine that will be spun
        slotMachine mainSlotMachine = new slotMachine();
        
        // Creates a scanner to have the user leave the loop
        Scanner scanDone = new Scanner(System.in);
        
        // Sets strDone as "YES" to start the loop
        String strDone = "YES";
        
        while (strDone.toUpperCase().equals("YES")){
            // Spins the slot machine and returns values
            mainSlotMachine.spin();
            System.out.println(mainSlotMachine.getNumbers());
            
            // Finds the results using getMatch and responds appropriately
            if (mainSlotMachine.getMatch().equals("All")){
                System.out.println("Wow! Three " + mainSlotMachine.intMatching + "s in a row!");
            }
            else{
                if (mainSlotMachine.getMatch().equals("Two")){
                    System.out.println("You got two " + mainSlotMachine.intMatching + "s. Good job!");
                }
                else{
                    System.out.println("None of the numbers match...");
                }
            }
            
            // Lets to user decide to leave the loop
            System.out.println("Would you like to spin again? (Type YES if you would): ");
            strDone = scanDone.next();
        }
    }
    
}

// Creates the slotMachine class used in the main function
class slotMachine{
    // Sets the integers of the three positions of the slot machine
    // intMatching is the integer that matches after a spin
    // strReturn will return the three integers as a string
    // strMatch will be used to show how many integers match
    int intFirst, intSecond, intThird, intMatching;
    String strReturn, strMatch;
    
    public slotMachine(){
        
    }
    
    public void spin(){
        
        // Randomly chooses between 0 and 9 for each integer
        Random randomFace = new Random();
        intFirst = randomFace.nextInt(10);
        intSecond = randomFace.nextInt(10);
        intThird = randomFace.nextInt(10);
    }
    
    public String getNumbers(){
        
        // Returns the three numbers as a string
        strReturn = "Your spin was: " + intFirst + " " + intSecond + " " + intThird;
        return strReturn;
    }
    
    public String getMatch(){
        
        // Checks if all integers are equal
        if ((intFirst == intSecond) && (intFirst == intThird)){
            strMatch = "All";
            intMatching = intFirst;
        }
        else{
            // Checks if all integers are unique
            if ((intFirst != intSecond) && (intFirst != intThird) && (intSecond != intThird)){
                strMatch = "None";
            }
            // Runs if two integers match and one doesn't
            else{
                strMatch = "Two";
                // Checks if intFirst is equal to either of the two other numbers
                if ((intFirst == intSecond)|(intFirst == intThird)){
                    intMatching = intFirst;
                }
                // Sets intMatching as intSecond
                else{
                    intMatching = intSecond;
                }
            }
        }
        return strMatch;
    }
}
