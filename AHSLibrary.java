
public class AHSLibrary
{
    public static void main(String[] args){
        //create library object
        Library ahs = new Library("Acalanes", 4);
        
        Author a = new Author("Jim", 23);
        Book b = new Book("Java Book", a);
        ahs.addBook(b);
        
        Book c = new Book("How to Plan the Perfect Party", a);
        ahs.addBook(c);
        
        Author j = new Author("Jay", 16);
        Book d = new Book("A Wasted Career", j);
        ahs.addBook(d);
        
        Book e = new Book("How to ruin your life", j);
        ahs.addBook(e);
        
        System.out.println(ahs);
        
    }
}
