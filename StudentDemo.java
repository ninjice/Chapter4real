

public class StudentDemo
{   
    // instance variables
    private String name;
    private int idNumber;
    private StudentDemo bestFriend;
    /**
     * Constructor for objects of class Student
     */
    
    
    public StudentDemo(int num, String nm){
        this.idNumber = num;
        this.name = nm;
    }
    
    public int combineIDNumbers(){
        return this.idNumber + bestFriend.idNumber;
    }
    
    public StudentDemo newStudent(StudentDemo other){
        StudentDemo temp = new StudentDemo(other.idNumber, this.name);
        return temp;
    }
    
    public int getID(){
        return this.idNumber;
    }
    
    public String toString(){
        return "The student's name is: " + this.name;
    }
}
