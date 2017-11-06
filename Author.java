
/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    
    
    /**
     * Constructor for objects of class Author
     */
    public Author(String nm, int authorAge)
    {
        // initialise instance variables
        this.name = nm;
        this.age = authorAge;
    }
    
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    
    public String toString(){
        return(this.name + " and is " + this.age); 
    }
}
