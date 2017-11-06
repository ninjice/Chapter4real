
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private String name;
    private Book books[];
    private int index = 0;
    
    /**
     * Constructor for objects of class Library
     */
    public Library(String nm, int size)
    {
        // initialise instance variables
        this.name = nm;
        this.books = new Book[size];
    }
    
    public String toString(){
        String output = "The library has: \n";
        for(Book b : books){
            output += b + "\n";
        }
        return output;
    }
    
    public void addBook(Book b){
        books[index] = b;
        index++;
    }

    public void addBook(Book b, int i){
        books[i] = b;
    }
    
}
