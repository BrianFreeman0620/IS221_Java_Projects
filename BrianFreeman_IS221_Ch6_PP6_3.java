/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch6_PP6_3.java
 * Lang:    Java
 * Date:    2021-03-09
 * Author:  Brian Freeman
 * Purpose: This code will create a 12 by 12 multiplication table
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-03-09
 * Desc:    The for loops have been created to allow the table to be made quickly
 */
package brianfreeman_is221_ch6_pp6;

public class BrianFreeman_IS221_Ch6_PP6_3 {

    public static void main(String[] args) {
        
        // intProduct is used to store the product of two integers
        // strMultiplicationTableRow is printed after an integer is multiplied by
        // integers 1-12
        int intProduct;
        String strMultiplicationTableRow;
        
        // Prints the header of the multiplication table and the column factors
        System.out.println("                             Multiplication Table");
        System.out.println("");
        System.out.println("      1     2     3     4     5     6     7     8     9     10    11    12");
        System.out.println("");
        System.out.println("   *************************************************************************");
        
        // first for loop runs through each row factor
        for(int intFactorRow = 1; intFactorRow <= 12; intFactorRow++){
            // if loop checks if intFactorRow is one or two characters long
            // if it is one character long, one extra space is added between the
            // integer and the table border
            if(intFactorRow < 10){
                strMultiplicationTableRow = intFactorRow + "  *";
            }
            else{
                strMultiplicationTableRow = intFactorRow + " *";
            }
            // second for loop runs through each column factor
            for(int intFactorColumn = 1; intFactorColumn <= 12; intFactorColumn++){
                // the row and column integers are multiplied together
                intProduct = intFactorRow * intFactorColumn;
                
                // checks the length of the product
                // if it is one character long, there is one space more between
                // the product and the right column border than if it was two characters long
                if (intProduct < 10){
                    strMultiplicationTableRow += "  " + intProduct + "  *";
                }
                else{
                    // if it is two characters long, there is one space more between
                    // the product and the left column border than if it was 
                    // three characters long
                    if (intProduct < 100){
                        strMultiplicationTableRow += "  " + intProduct + " *";
                    }
                    else{
                        strMultiplicationTableRow += " " + intProduct + " *";
                    }
                }
            }
            // After the for loop added the products to strMultiplicationTableRow,
            // the string is printed out followed by a row border
            System.out.println(strMultiplicationTableRow);
            System.out.println("   *************************************************************************");
        }
    }
    
}
