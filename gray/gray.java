
import javax.swing.JOptionPane;
public class gray
{
  public static void main(){
      String[] classmates = {"Jaykwellin", null, "D-Nice", "Teemoathy"};
      for(int i = 0; i < classmates.length; i++){
          if(classmates[i] != null){
              System.out.println(classmates[i].length());
          }
      }
  }
}
