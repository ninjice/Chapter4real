package Athlete;


/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Athlete[] members;

    /**
     * Constructor for objects of class Team
     */
    public Team(String name, int size)
    {
        // initialise instance variables
        this.teamName = name;
        members = new Athlete[size];
    }
    
    public void addAthlete(Athlete a, int index){
        members[index] = a;
    }
    
    public String toString(){
        String output = "The team members for " + this.teamName + "\n";
        for(Athlete a : members){
            output += a + "\n";
        }
        return output;
    }
}
