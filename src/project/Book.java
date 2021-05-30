package project;

import java.util.Objects;


enum BookType {
    Ebook, 
    PrintCopyBook
}

abstract class Book implements BookInterface, Comparable<Book>
{

    private String title;
    private String ISBN;
    private short releaseYear;
    private Author author;

    public Book(String title, String ISBN, short releaseYear, Author author) {
        this.title = title;
        this.ISBN = ISBN;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public short getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(short releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    public BookType getBookType()
    {
        if (this instanceof Ebook)
        {
            return BookType.Ebook;        
        }
        
        return BookType.PrintCopyBook;
    }
    
    @Override
    public int compareTo(Book otherBook)
    {
        int number = Short.compare(this.releaseYear, otherBook.releaseYear);
        if(number==0 && !this.equals(otherBook))
            return -1;
        return number;
    }
    
    
    public String toString()
    {
        return this.getISBN()+" "+this.getReleaseYear()+" "+this.getAuthor();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.ISBN);
    }
    
    public boolean equals(final Object obj)
    {
        Book object = (Book)obj;
        return this.ISBN.equals(object.getISBN());
    }
    
}