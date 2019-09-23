import javax.swing.JOptionPane;

public class Name
{
    public static void Name(){
    
        String[] names1 = new String [3];
        String[] names2 = new String [3];
        int lengthName1 = 0;
        int lengthName2 = 0;
        for(int i = 0; i<3; i++){
            if(i==0){
            names1[i] = JOptionPane.showInputDialog("What is your first name?");
            names2[i] = JOptionPane.showInputDialog("What is your  FRIEND'S first name?");
            lengthName1 += names1[i].length();
            lengthName2 += names2[i].length();
           }
           else if(i==1){
            names1[i] = JOptionPane.showInputDialog("What is your MIDDLE name?");
            names2[i] = JOptionPane.showInputDialog("What is your  FRIEND'S MIDDLE name?");
            lengthName1 += names1[i].length();
            lengthName2 += names2[i].length();
           }
           else if(i==2){
            names1[i] = JOptionPane.showInputDialog("What is your LAST name?");
            names2[i] = JOptionPane.showInputDialog("What is your  FRIEND'S LAST name?");
            lengthName1 += names1[i].length();
            lengthName2 += names2[i].length();
           }
        }
        if( lengthName1 > lengthName2){
            System.out.println("You have a longer name");
        }
        else if(lengthName2 >  lengthName1){
            System.out.println("Your FRIEND has a longer name");
        }
        else{
            System.out.println("tie");
        }
        
        
        
        
    
    
    
    
    }

}
