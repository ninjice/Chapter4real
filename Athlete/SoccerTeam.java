package Athlete;

public class SoccerTeam
{
    
    public static void main(String[] Args)
    {
        
        Team acalanes = new Team("Acalanes Soccer", 20);
        
        Athlete joe = new Athlete("Joe", 16);
        acalanes.addAthlete(joe,0);
        System.out.println(acalanes);
    }
    
}
