/*
 -------------------------------------------------------------------------------
 * Name:    BrianFreeman_IS221_Ch4_PP4_7.java
 * Lang:    Java
 * Date:    2021-02-24
 * Author:  Brian Freeman
 * Purpose: This code will use the Book class to return author, publisher, and
            copyright date
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-24
 * Desc:    The Book class can be used to return author, publisher, and copyright
 */
package brianfreeman_is221_ch4_pp4;

import java.util.Scanner;

public class BrianFreeman_IS221_Ch4_PP4_7 {

    public static void main(String[] args) {
        // the Book class from Book.java is used to create 3 Books
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Scanner scanBookString = new Scanner(System.in);
        Scanner scanBookInt = new Scanner(System.in);
        
        // the scanner gets the titles, authors, and publishers of the three 
        // books as strings and the date as an integer
        System.out.println("Choose a name for a book: ");
        String inputTitle1 = scanBookString.nextLine();
        System.out.println("Who is the author for the book?: ");
        String inputAuthor1 = scanBookString.nextLine();
        System.out.println("Who published the book?: ");
        String inputPublisher1 = scanBookString.nextLine();
        System.out.println("What year was it written? (write in the format 1951): ");
        int inputDate1 = scanBookInt.nextInt();
        
        System.out.println("Choose a name for a second book: ");
        String inputTitle2 = scanBookString.nextLine();
        System.out.println("Who is the author for the second book?: ");
        String inputAuthor2 = scanBookString.nextLine();
        System.out.println("Who published the second book?: ");
        String inputPublisher2 = scanBookString.nextLine();
        System.out.println("What year was it written? (write in the format 1951): ");
        int inputDate2 = scanBookInt.nextInt();
        
        System.out.println("Choose a name for a third book: ");
        String inputTitle3 = scanBookString.nextLine();
        System.out.println("Who is the author for the third book?: ");
        String inputAuthor3 = scanBookString.nextLine();
        System.out.println("Who published the third book?: ");
        String inputPublisher3 = scanBookString.nextLine();
        System.out.println("What year was it written? (write in the format 1951): ");
        int inputDate3 = scanBookInt.nextInt();
        
        // the inputted values are used in the book class and returned
        System.out.println("Book 1");
        book1.setTitle(inputTitle1);
        book1.setAuthor(inputAuthor1);
        book1.setPublisher(inputPublisher1);
        book1.setDate(inputDate1);
        System.out.print(book1);
        
        System.out.println("Book 2");
        book2.setTitle(inputTitle2);
        book2.setAuthor(inputAuthor2);
        book2.setPublisher(inputPublisher2);
        book2.setDate(inputDate2);
        System.out.print(book2);
        
        System.out.println("Book 3");
        book3.setTitle(inputTitle3);
        book3.setAuthor(inputAuthor3);
        book3.setPublisher(inputPublisher3);
        book3.setDate(inputDate3);
        System.out.print(book3);
    }
    
}
