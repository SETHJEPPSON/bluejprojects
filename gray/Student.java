
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private int grade;

    public Student()
    {
        this.grade = 0;
        this.name = null;
    }
    
    public Student(int grade, String name){
        this.name = name;
        this.grade = grade;
    }
    
    public void setGrade(int grade){
        this.grade = grade;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    public int getGrade(){
        return this.grade;
    }

    public String toString()
    {
        return "Name: " + this.name + " Grade: " + this.grade;
    }
}
