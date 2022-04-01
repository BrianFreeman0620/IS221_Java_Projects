/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch2_PP2_11.java
 * Lang:    Java
 * Date:    2021-02-09
 * Author:  Brian Freeman
 * Purpose: This code will take a dollar amount and convert it to least number
            of coins and bills
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-09
 * Desc:    The equation was implemented and used to convert an inputted value
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-10
 * Desc:    Money was converted to cents to prevent double rounding errors
 */
package brianfreeman_is221_ch2_pp2;

import java.util.Scanner;

public class BrianFreeman_IS221_Ch2_PP2_11 {
    
    public static void main(String[] args) {
        double doubleMoney;
        int intCents;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an amount of money in dollars to the "
                + "nearest cent: $");
        doubleMoney = scan.nextDouble();
        
        intCents = (int)(doubleMoney * 100);
        
        int tenBill = (int) (intCents/1000);
        intCents -= (tenBill * 1000);
        System.out.println(tenBill + " ten dollar bills");
        
        int fiveBill = (int) (intCents/500);
        intCents -= (fiveBill * 500);
        System.out.println(fiveBill + " five dollar bills");
        
        int oneBill = (int) (intCents/100);
        intCents -= (oneBill * 100);
        System.out.println(oneBill + " one dollar bills");
        
        int quarterCoin = (int) (intCents/25);
        intCents -= (quarterCoin * 25);
        System.out.println(quarterCoin + " quarters");
        
        int dimeCoin = (int) (intCents/10);
        intCents -= (dimeCoin * 10);
        System.out.println(dimeCoin + " dimes");
        
        int nickelCoin = (int) (intCents/5);
        intCents -= (nickelCoin * 5);
        System.out.println(nickelCoin + " nickels");
        
        System.out.println(intCents + " pennies");
    }
    
}
