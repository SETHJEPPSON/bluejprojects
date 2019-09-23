import javax.swing.JOptionPane;

public class Person
{
    private String first;
    private String middle;
    private String last;
    private int age;
    private String[] full = new String[3];
    
    public Person(){
        first = null;
        middle = null;
        last = null;
        age = 0;
    }
    
    public Person(String first, String middle, String last, int age){
        this.first = first;
        full[0] = first;
        this.middle = middle;
        full[1] = middle;
        this.last = last;
        full[2] = last;
        this.age = age;
    }
    
    public String toString(){
        return this.first + " " + this.middle + " " + this.last + " is " + this.age + " years old.";
    }
    
    public int length(){
        return full[0].length() + full[1].length() + full[2].length();
    }
    
}
