
import javax.swing.JOptionPane;

public class whileLoops
{
    public static void main(){
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("How many integers in your array? (10-20)"));
    
        while(10>num||1000<num){
            num = Integer.parseInt(JOptionPane.showInputDialog("U wot m8"));
            
            
        
        }
    
        int[] ourArray = new int[num];
        
        for (int i = 0; i < num; i++){
            ourArray[i] = (int)(Math.random()*5 + 15);
            System.out.println(ourArray[i]);
        }
        
        int greater = ourArray[0];
        
        for(int k = 0; k < num; k++ ){
            if(greater < ourArray[k]){
                greater = ourArray[k];
            }
        }
        
        int less = ourArray[0];
        
        for (int q = 0; q < num; q++){
            if(less > ourArray[q]){
                less = ourArray[q];
            }
        }
        
        System.out.println("Greatest: " + greater);
        System.out.println("Least: " + less);
    }
}
