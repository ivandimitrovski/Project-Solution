package project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author ivandimitrovski
 */


interface BookInterface
{
   public BookType getBookType();
}

public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Author author = new Author("Ivan", "Dimitrovski", (short)1990);
        PrintCopyBook printBook = new PrintCopyBook((short)20, (byte) 20, "Kniga", "ISBN1", (short)2021, author);
        PrintCopyBook printBook2 = new PrintCopyBook((short)20, (byte) 20, "Kniga", "ISBN2", (short)1992, author);
        
        //byte storageSize, Format format, String title, String ISBN, short releaseYear, Author autho
        Ebook printBook3 = new Ebook((byte)20, Format.PDF, "Kniga", "ISBN3", (short)2021, author);

        System.out.println(printBook.getBookType());
        System.out.println(author.getFirstName());

        // TODO code application logic here
        Application a = new Application();
        a.addAuthor(author);
        a.addBook(printBook);
        a.addBook(printBook2);
        a.addBook(printBook3);

        System.out.println("Latest book : "+a.getLatestBook());
        
        System.out.println("Books by author last name : ");
        a.getBooksByAuthorLastName();
        System.out.println("Authors with 3 or greater Number of books");
        a.getAuthorsWithGreaterNumberOfBooks();
        System.out.println("Books in order");
        a.getBooksInOrder();
        
        System.out.println("Authors born in same decade with other published books:");
        a.getAutorsWithSameDecade();
        
    }
    
}
