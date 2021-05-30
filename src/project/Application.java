package project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;



class Application
{
    private Book oldestBook;
    private Book latestBook;
    

    HashMap<Character, LinkedList<Book>> libraryMap = new HashMap<Character, LinkedList<Book>>();
    SortedSet<Book> chronologicOrder = new TreeSet<Book>();
   
    HashSet<Book> books = new HashSet<Book>();
    HashSet<Author> authors = new HashSet<Author>();
    HashMap<Author, Integer> author_maps = new HashMap<Author, Integer>();// ZA SEKOJ AUTOR KOLKU NAPISAL

    public Book getOldestBook() {
        return oldestBook;
    }

    public Book getLatestBook() {
        return latestBook;
    }
  
    public void addAuthor(Author author)
    {
        this.authors.add(author);
    }
    
    public void addBook(Book book)
    {
        this.chronologicOrder.add(book); //O(1)
        
        this.books.add(book);
        this.authors.add(book.getAuthor());
        
        
        Character first_char = book.getAuthor().getLastName().toCharArray()[0];
        
        if  (!this.libraryMap.containsKey(first_char))
        {
            this.libraryMap.put(first_char, new LinkedList<Book>());
        }        
        this.libraryMap.get(first_char).add(book); //O(1)
       
      
        int count = this.author_maps.containsKey(book.getAuthor())? this.author_maps.get(book.getAuthor()) : 0;
   
        this.author_maps.put(book.getAuthor(), count+1);
        
        if (this.oldestBook==null)
        {
            this.oldestBook = book;
        }
            
        if (this.latestBook==null)
        {
            this.latestBook = book;
        }
        if (this.oldestBook.compareTo(book)>0)
        {
            this.oldestBook = book;
        }
        else if (this.latestBook.compareTo(book)<0)
        {
            this.latestBook = book;
        }
       
    }
    
    // O(|Authors| * |Books|) Slow
    public void getAutorsWithSameDecade()
    {
        HashSet<Author> authors_decade = new HashSet<Author>();
        
        for (Author author : this.authors)
        {
              
            int year = author.getBirthday();

            int div_mod = year%10;
            int decadeUp = year+(10-div_mod);
            int decadeDown = year-(div_mod);
      
            System.out.println("Decade"+" "+decadeDown+" "+decadeUp);
            for (Book book : this.books)
            {
                if(book.getReleaseYear()>=decadeDown && book.getReleaseYear()<decadeUp)
                {
                   authors_decade.add(author);
                }
            }
        }         
        
        for (Author author : authors_decade)
        {
            System.out.println(author);
        }
    }
    
    
    
    public void getAuthorsWithGreaterNumberOfBooks()
    {
        //Collections.sort(objectOfArrayList, Collections.reverseOrder());  
        for (Author author : this.authors)
        {
            if (this.author_maps.get(author)>=3)
            {
                System.out.println(author);
            }
        }
    }
    
    public void getBooksInOrder()
    {
        Iterator iterator = chronologicOrder.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    
    public void getBooksByAuthorLastName()
    {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        
        LinkedList<Book> books = libraryMap.get(c);
        if (books!=null)
        {
            for (Book book : books)
            {
                System.out.println(book);
            }
        }
        
    }
    
}