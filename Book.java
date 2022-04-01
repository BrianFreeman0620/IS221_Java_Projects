/*
 -------------------------------------------------------------------------------
 * Name:    Book.java
 * Lang:    Java
 * Date:    2021-02-24
 * Author:  Brian Freeman
 * Purpose: This code has the Book class for the main function
--------------------------------------------------------------------------------
 * ChangeLog:
 * Who:     Brian Freeman           Date:       2021-02-24
 * Desc:    The Book class has been created
 */
package brianfreeman_is221_ch4_pp4;

public class Book 
{
    // strings bookTitle, bookAuthor, and bookPublisher and integer bookDate
    // have been initialized for usage in the class
    private String bookTitle, bookAuthor, bookPublisher;
    private int bookDate;
    
    public Book()
    {
        // the Strings have been set to " " and bookDate is set to 0 to prevent 
        // crashing of the program
        bookTitle = " ";
        bookAuthor = " ";
        bookPublisher = " ";
        bookDate = 0;
        
    }
    
    public String setTitle(String bookInputTitle)
    {
        // bookTitle can be inputted to be used in the class
        bookTitle = bookInputTitle;
        return bookTitle;
        
    }
    
    public String getTitle()
    {
        // returns the String of bookTitle
        return bookTitle;
        
    }
    
    public String setAuthor(String bookInputAuthor)
    {
        // bookAuthor can be inputted to be used in the class
        bookAuthor = bookInputAuthor;
        return bookAuthor;
        
    }
    
    public String getAuthor()
    {
        // returns the String of bookAuthor
        return bookAuthor;
        
    }
    
    public String setPublisher(String bookInputPublisher)
    {
        // bookPublisher can be inputted to be used in the class
        bookPublisher = bookInputPublisher;
        return bookPublisher;
        
    }
    
    public String getPublisher()
    {
        // returns the String of bookPublisher
        return bookPublisher;
        
    }
    
    public int setDate(int bookInputDate)
    {
        // bookDate can be inputted to be used in the class
        bookDate = bookInputDate;
        return bookDate;
        
    }
    
    public int getDate()
    {
        // returns the integer of bookDate
        return bookDate;
        
    }
    
    public String toString()
    {
        // the string shows book title, author, publisher, and the year it was
        // published
        String bookString = "The book's title is: " + bookTitle 
                + "\nThe author's name is: " + bookAuthor + "\nThe book's publisher is"
                + bookPublisher + "\nThe book was published on: " + bookDate
                + "\nWhich is about " + (2021 - bookDate) + " years ago\n";
        return bookString;
        
    }
}
    
