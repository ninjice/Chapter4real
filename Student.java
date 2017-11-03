
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private int test1Score;
    private int test2Score;
    
    //constructor
    //-----------------------------------------------
    public Student(String studentName, int ts1, int ts2)
    {
        //add body of constructor
        this.name = studentName;
        this.test1Score = ts1;
        this.test2Score = ts2;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades(String studentName, int testNumber)
    {
        //add body of inputGrades
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter " + studentName + "'s score for test " + testNumber);
        
        if(testNumber == 1){
            this.test1Score = scan.nextInt();
        }
        
        if(testNumber == 2){
            this.test2Score = scan.nextInt();
        }
    }
    
    public int getGrade(int testNumber){
        int output = 0;
        
        if(testNumber == 1){
            output = this.test1Score;
        }
        
        if(testNumber == 2){
            output = this.test2Score;
        }
        
        return output;
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public int getAverage(int score1, int score2)
    {
        //add body of getAverage
        int average = ((score1 +score2)/2);
        return(average);
    }
    
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    public String getName()
    {
        //add body of getName
        return this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public void printName()
    {
        //add body of printName
        System.out.println(this.name);
    }
    
    public String toString(){
        return("Name: "+this.name +"\tTest1: "+this.test1Score + "\tTest2: "+this.test2Score);
    }
}