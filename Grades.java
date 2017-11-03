// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary", 0, 0);
        
        //create student2, "Mike"
        Student student2 = new Student("Mike", 0, 0);
        
        //input grades for Mary
        student1.inputGrades("Mary", 1);
        student1.inputGrades("Mary", 2);
        
        System.out.println("\nStudent 1: " + student1);
        
        //print average for Mary
        System.out.println("\nThe average for " + student1.getName() + " is " + student1.getAverage(student1.getGrade(1), student1.getGrade(2)));
        
        //input grades for Mike
        student2.inputGrades("Mike", 1);
        student2.inputGrades("Mike", 2);
        
        System.out.println("\nStudent 2: " + student2);
        
        //print average for Mike
        System.out.println("\nThe average for " + student2.getName() + " is " + student1.getAverage(student2.getGrade(1), student2.getGrade(2)));
        
        
        
    }
}