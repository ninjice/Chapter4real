import java.util.Scanner;
public class TestNames
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a first, middle, and last name");
        Name name1 = new Name(scan.nextLine(),scan.nextLine(),scan.nextLine());
        
        System.out.println("\tPlease enter another first, middle, and last name");
        Name name2 = new Name(scan.nextLine(),scan.nextLine(),scan.nextLine());
        
        System.out.println("For " + name1.getFirst() + ":");
        System.out.println(name1.firstMiddleLast());
        
    }
    
}
