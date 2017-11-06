
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables
    
    private String title;
    private Author author;
    
    /**
     * Constructor for objects of class Book
     */
    public Book(String ttl, Author a)
    {
        // initialise instance variables
        this.title = ttl;
        this.author = a;
    }
    
    public String toString(){
        return("The author is " + author + ", wrote " + this.title);
    }
}
