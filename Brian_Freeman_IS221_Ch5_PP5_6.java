/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch5_PP5_6.java
 * Lang:    Java
 * Date:    2021-03-02
 * Author:  Brian Freeman
 * Purpose: This code will flip two coins and see which one flips three heads
 *          in a row first
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-02
 * Desc:    The coin class and the race have been implemented with if, else, 
 *          and while loops
 */
package brian_freeman_is221_ch5_pp5;

import java.util.Random;

public class Brian_Freeman_IS221_Ch5_PP5_6 {
    
    public static void main(String[] args) {
        // Creates the two Coins that will be flipped
        Coin coinOne = new Coin();
        Coin coinTwo = new Coin();
        
        // intConsecutiveHeadsOne and intConsecutiveHeadsTwo keep track of
        // number of heads in a row
        // intFlipsNeeded counts the number of rounds in the game
        int intConsecutiveHeadsOne = 0;
        int intConsecutiveHeadsTwo = 0;
        int intFlipsNeeded = 0;
        
        // Checks if there is a winner and ends loop if there is one
        while ((intConsecutiveHeadsOne < 3) && (intConsecutiveHeadsTwo < 3)){
            
            coinOne.flip();
            coinTwo.flip();
            
            // Checks if the coin is head and increments counter if it is
            if (coinOne.getFace().equals("Heads")){
                intConsecutiveHeadsOne += 1;
                System.out.println("Coin one got heads");
            }
            // If the coin gets tails, resets consecutive heads counter
            else{
                intConsecutiveHeadsOne = 0;
                System.out.println("Coin one got tails");
            }
            if (coinTwo.getFace().equals("Heads")){
                intConsecutiveHeadsTwo += 1;
                System.out.println("Coin two got heads");
            }
            else{
                intConsecutiveHeadsTwo = 0;
                System.out.println("Coin two got tails");
            }
            System.out.println("Coin one consecutive heads: " + intConsecutiveHeadsOne);
            System.out.println("Coin two consecutive heads: " + intConsecutiveHeadsTwo);
            System.out.println();
            intFlipsNeeded += 1;
        }
        // Checks if the game ended in a tie, else declares the winner
        if (intConsecutiveHeadsOne == intConsecutiveHeadsTwo){
            System.out.println("The game ended in a draw...");
        }
        else{
            if (intConsecutiveHeadsOne > intConsecutiveHeadsTwo){
                System.out.println("Coin one wins! Congratulations!");
            }
            else{
                System.out.println("Coin two is the winner! Good job!");
            }
        }
        System.out.println("Each coin was flipped " + intFlipsNeeded + " times");
        
    }
    
}

// Creates the Coin class used in the main function
class Coin{
    // Sets the conditions for heads and tails
    int intHeads = 0;
    int intTails = 1;
    int intFace;
    
    public Coin(){
        
    }
    
    public void flip(){
        
        // Randomly chooses between 0 and 1
        Random randomFace = new Random();
        intFace = randomFace.nextInt(2);
    }
    
    public String getFace(){
        
        // If intFace is 0, returns heads
        if (intFace == intHeads){
            return "Heads";
        }
        // If intFace is 1, returns tails
        else{
            return "Tails";
        }
    }
}
