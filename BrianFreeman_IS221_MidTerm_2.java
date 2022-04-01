/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_MidTerm_2.java
 * Lang:    Java
 * Date:    2021-03-15
 * Author:  Brian Freeman
 * Purpose: This program will simulate Yahtzee
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-15
 * Desc:    The Die and YahtzeeSet classes have been created.
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-16
 * Desc:    The Die and YahtzeeSet classes have become static to run in main
 *          method. The main method has been created.
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-17
 * Desc:    Fixed some errors with unwanted inputs.
 */

package brianfreeman_is221_midterm;

import java.util.Random;
import java.util.Scanner;

// Main starts at line 33
// Die starts at line 152
// YahtzeeSet starts at line 178
public class BrianFreeman_IS221_MidTerm_2 {

    public static void main(String[] args) {
        
        // Initializes yahtFiveDice, which rolls five Dice and keeps track of data
        // scanYahtzee receives user input for playing the game
        // strKeepPlaying is used in loops to end the loop
        // intTurnCount keep track of how many turns have been completed
        YahtzeeSet yahtFiveDice = new YahtzeeSet();
        Scanner scanYahtzee = new Scanner(System.in);
        String strKeepPlaying;
        int intTurnCount;
        
        // Introduces the program with println statements
        System.out.println("This program will roll five dice.");
        System.out.println("Maybe you will get a Yahtzee?");
        System.out.println("Would you like to play? (yes/no)");
        
        // Changes strKeepPlaying to response
        strKeepPlaying = scanYahtzee.next();
        
        // Checks if the user wants to play
        if (strKeepPlaying.equalsIgnoreCase("yes")){
            
            // Sets intTurnCount to 1 since it is the first turn
            intTurnCount = 1;
            
            while(strKeepPlaying.equalsIgnoreCase("yes")){
                
                // Runs three turns of rolling the Dice
                for(int intTurnNumber = 1; intTurnNumber <= 3; intTurnNumber++){

                    yahtFiveDice.RollDice();

                    // Prints out the values of the five Dice
                    System.out.println("The side up for the five dice are:");
                    for(int intDieNumber = 1; intDieNumber <= 5; intDieNumber++){
                        
                        System.out.println("Die " + intDieNumber + ": " + yahtFiveDice.GetDie(intDieNumber));

                    }

                    // Unlocks all Dice after each roll
                    for(int intResetDice = 1; intResetDice <= 5; intResetDice++){

                        yahtFiveDice.UnlockDie(intResetDice);
                    }

                    // Checks if Yahtzee has been rolled and breaks loop is so
                    if(yahtFiveDice.IsYahtzee()){
                        
                        System.out.println("Wow! You got Yahtzee!");
                        System.out.println("All five of the dice are " + yahtFiveDice.GetDie(1) + "!");
                        System.out.println("It took you " + intTurnCount + " turns.");
                        
                        // Sets strKeepPlaying to no so the loop breaks
                        strKeepPlaying = "no";
                        break;
                        }

                        else{
                            
                            // Checks if it is the third roll of the round and if not,
                            // allows user to change dice
                            if(intTurnNumber != 3){
                                
                                // Asks the user how many Dice they want to keep 
                                // and gives the option to keep none
                                System.out.println("How many dice would you like to keep?");
                                System.out.println("Type in an integer from 0-5.");
                                int intNumberKept = scanYahtzee.nextInt();
                                
                                // Prevents the user from typing in an integer too
                                // big or small
                                while((intNumberKept>5) | (intNumberKept<0)){
                                    
                                    System.out.println("That is not a vaild integer.");
                                    System.out.println("Please type in an integer 0-5.");
                                    System.out.println("How many dice would you like to keep?");
                                    intNumberKept = scanYahtzee.nextInt();
                                }

                                // intKeptDice is the counter for number of kept Dice
                                for(int intKeptDice = 0; intKeptDice < intNumberKept; intKeptDice++){

                                    // Asks which Die number should be kept
                                    System.out.println("Type in the number of a die that should be kept.");
                                    System.out.println("For example if you want to keep Die 1: 6,");
                                    System.out.println("type in 1.");
                                    int intLockDie = scanYahtzee.nextInt();

                                    // Locks the die so it can't be rolled next time
                                    yahtFiveDice.LockDie(intLockDie);
                                }
                            }
                            else{
                                System.out.println("Sorry, no Yahtzee this turn.");

                                // Increments intTurnCount since turn is done
                                intTurnCount ++;
                                
                                // Checks if the user wants to play again
                                System.out.println("Would you like to play again? (yes/no)");
                                strKeepPlaying = scanYahtzee.next();

                            }
                        }
                }
            }
            
            // Says bye to the user after they are done playing
            System.out.println("Thank you for playing!");
        }
        else{
            
            // Runs if the user doesn't want to play at all
            System.out.println("Maybe next time you'll want to play Yahtzee.");
        }
    }
    
    // Creates the Die class used in YahtzeeSet
    static class Die{

        // intFace is the side of die facing up
        // randFace is a Random object
        int intFace;
        Random randFace = new Random();

        public Die(){

            // Sets intFace to 1 to start
            intFace = 1;
        }

        public int getFace(){

            // Returns the integer value of intFace
            return intFace;
        }

        public void Roll(){

            // Randomly chooses an integer between 1 and 6
            intFace = randFace.nextInt(6) + 1;
        }
    }

    static class YahtzeeSet{

        // Initializes five Dice objects
        Die DieOne = new Die();
        Die DieTwo = new Die();
        Die DieThree = new Die();
        Die DieFour = new Die();
        Die DieFive = new Die();

        // boolYahtzee is a boolean keeping track if a Yahtzee has been rolled
        // boolDieLocked checks if the corresponding Die can be rolled
        boolean boolYahtzee;
        boolean boolDieOneLocked;
        boolean boolDieTwoLocked;
        boolean boolDieThreeLocked;
        boolean boolDieFourLocked;
        boolean boolDieFiveLocked;

        public YahtzeeSet(){

            // Sets boolYahtzee as false as no rolls have been done
            // Sets boolDieLocked as false so all Dice can be rolled
            boolYahtzee = false;
            boolDieOneLocked = false;
            boolDieTwoLocked = false;
            boolDieThreeLocked = false;
            boolDieFourLocked = false;
            boolDieFiveLocked = false;

        }

        public void LockDie(int intLockDie){

            // Checks which Die should locked to not be able to roll
            switch(intLockDie){

                // Each case number locks the corresponding Die
                case 1:
                    boolDieOneLocked = true;
                    break;
                case 2:
                    boolDieTwoLocked = true;
                    break;
                case 3:
                    boolDieThreeLocked = true;
                    break;
                case 4:
                    boolDieFourLocked = true;
                    break;
                case 5:
                    boolDieFiveLocked = true;
                    break;
                // If an integer not 1-5 is inputted, breaks without changing anything
                default:
                    break;
            }

        }

        public void UnlockDie(int intUnlockDie){

            // Checks which Die should unlocked to be able to roll
            switch(intUnlockDie){

                // Each case number unlocks the corresponding Die
                case 1:
                    boolDieOneLocked = false;
                    break;
                case 2:
                    boolDieTwoLocked = false;
                    break;
                case 3:
                    boolDieThreeLocked = false;
                    break;
                case 4:
                    boolDieFourLocked = false;
                    break;
                case 5:
                    boolDieFiveLocked = false;
                    break;
                // If an integer not 1-5 is inputted, breaks without changing anything
                default:
                    break;
            }

        }

        public void RollDice(){

            // Checks each Die to see if it unlocked
            // If it is unlocked, it will Roll the Die
            // Else, it will not change the Die's intFace
            if (! boolDieOneLocked){
                DieOne.Roll();
            }
            if (! boolDieTwoLocked){
                DieTwo.Roll();
            }
            if (! boolDieThreeLocked){
                DieThree.Roll();
            }
            if (! boolDieFourLocked){
                DieFour.Roll();
            }
            if (! boolDieFiveLocked){
                DieFive.Roll();
            }
        }

        public int GetDie(int intDieNumber){

            // Initializes intDieValue which will be returned
            int intDieValue;

            // Checks which Die should have its value returned
            switch(intDieNumber){

                // Each case number locks the corresponding Die
                case 1:
                    intDieValue = DieOne.getFace();
                    break;
                case 2:
                    intDieValue = DieTwo.getFace();
                    break;
                case 3:
                    intDieValue = DieThree.getFace();
                    break;
                case 4:
                    intDieValue = DieFour.getFace();
                    break;
                
                // Returns the face for DieFive if none of the other Dice are
                // selected to prevent the program from crashing.
                // The main function should never input an integer not between 
                // 1-5 because the user cannot change the value.
                default:
                    
                    intDieValue = DieFive.getFace();
                    break;
            }

            return intDieValue; 
        }

        public boolean IsYahtzee(){

            // Starts with boolYahtzee as false to not need else statements as
            // each else statement would return the same value
            boolYahtzee = false;

            // Checks all Dice to see if they are all equal
            if (DieOne.getFace() == DieTwo.getFace()){
                if (DieOne.getFace() == DieThree.getFace()){
                    if (DieOne.getFace() == DieFour.getFace()){
                        if (DieOne.getFace() == DieFive.getFace()){
                            boolYahtzee = true;
                        }
                    }
                }
            }

            // Returns true or false depending if a Yahtzee has been rolled
            return boolYahtzee;
        }
    }
}