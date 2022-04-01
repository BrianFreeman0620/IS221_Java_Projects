/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch6_PP6_5.java
 * Lang:    Java
 * Date:    2021-03-09
 * Author:  Brian Freeman
 * Purpose: This program will roll two dice and report the number of boxcars
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-09
 * Desc:    The Die class can be rolled and be looped 1000 times
 */
package brianfreeman_is221_ch6_pp6;

import java.util.Random;

public class BrianFreeman_IS221_Ch6_PP6_5 {

    public static void main(String[] args) {
        
        // Two Die objects are created from the class implemented later
        Die dieOne = new Die();
        Die dieTwo = new Die();
        
        // intBoxCars keeps track how many box cars are rolled
        int intBoxCars = 0;
        
        System.out.println("Two dice will be rolled 1000 times each");
        System.out.println("The result is a box car if both values are 6");
        
        // Runs the loop 1000 times
        for (int intTimesRolled = 1; intTimesRolled<=1000; intTimesRolled++){
            
            dieOne.Roll();
            dieTwo.Roll();
            
            // If both dieOne and dieTwo are 6, then the counter increases by 1
            if (dieOne.isSix() && dieTwo.isSix()){
                intBoxCars ++;
            }
        }
        System.out.println("The number of box cars is " + intBoxCars);
    }
    
}
class Die{
    
    // intFace is the current face of Die object
    // boolFaceSix returns whether the face is 6 or not
    int intFace;
    boolean boolFaceSix;
    Random randomFace = new Random();
    
    public Die(){
        
        // intFace is set to 1 to start
        // Since 1 != 6, boolFaceSix is set to false
        intFace = 1;
        boolFaceSix = false;
    }
    
    public void Roll(){
        
        // The face is a random int between 1 and 6
        intFace = randomFace.nextInt(6) + 1;
    }
    
    public boolean isSix(){
        
        // if intFace is 6, the method returns true
        if (intFace == 6){
            boolFaceSix = true;
        }
        // if intFace isn't 6, the method returns false
        else{
            boolFaceSix = false;
        }
        return boolFaceSix;
    }
    
    
            
}
