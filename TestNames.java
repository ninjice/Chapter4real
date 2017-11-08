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
        
        System.out.println("\nFor " + name1.getFirst() + ":");
        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.initial());
        System.out.println(name1.length());
        
        System.out.println("\nFor " + name2.getFirst() + ":");
        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.initial());
        System.out.println(name2.length());
        
        if(name1.firstMiddleLast().equals(name2.firstMiddleLast())){
            System.out.println("\nThe names are the same.");
        }
        else{
            System.out.println("\nThe names are different.");
        }
    }
    
}
