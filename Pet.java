

public class Pet
{
    //instance variables
    private String name;
    private boolean alive;
    private int timesFed;
    public static int numPets;
    
    /**
     * Constructor for objects of class Pet
     */
    public Pet(String nm, boolean al, int tf)
    {
        this.name = nm;
        this.alive = al;
        this.timesFed = tf;
        numPets++;
    }
    
    public static void example(){
        System.out.println("This is static!");
    }
    
    
    
    public String getName(){
        return this.name;
    }
    
    public void setAlive(boolean al){
        this.alive = al;
    }
    
    public int getTimesFed(){
        return this.timesFed;
    }
    
    public void setTimesFed(int tf){
        this.timesFed = tf;
    }
    
    public String toString(){
        return "This pet is named: " + this.name;
    }
    
    }

