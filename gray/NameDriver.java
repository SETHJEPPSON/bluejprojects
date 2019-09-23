import javax.swing.JOptionPane;

public class NameDriver
{
    public static void main(){
    
        Person p1 = new Person(JOptionPane.showInputDialog("Your first name"),
        JOptionPane.showInputDialog("Your middle name"),
        JOptionPane.showInputDialog("Your last name"),
        Integer.parseInt(JOptionPane.showInputDialog("Your age")));
    
        Person p2 = new Person(JOptionPane.showInputDialog("Your FRIEND'S first name"),
        JOptionPane.showInputDialog("Your FRIEND'S middle name"),
        JOptionPane.showInputDialog("Your FRIEND'S last name"),
        Integer.parseInt(JOptionPane.showInputDialog("Your FRIEND'S age")));
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        if( p1.length() > p2.length()){
            System.out.println("You have a longer name");
        }
        else if(p1.length() < p2.length()){
            System.out.println("Your FRIEND has a longer name");
        }
        else{
            System.out.println("tie");
        }
    
    }
}
