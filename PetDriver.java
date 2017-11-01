
public class PetDriver
{
    public static void main(String[] args){
        Pet fluffy = new Pet("Fluffy", true, 0);
        System.out.println(fluffy);
        fluffy.setAlive(false);
        fluffy.setTimesFed(1);
        fluffy.getTimesFed();
        
        Pet.example();
        System.out.println("Number of pets: " + Pet.numPets); 
        
        Pet sam = new Pet("sam", true, 0);
        System.out.println("Number of pets: " + Pet.numPets); 
    }
}
