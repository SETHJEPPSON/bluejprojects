import javax.swing.JOptionPane;
/**
 * Write a description of class lowValue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lowValue
{
    // instance variables - replace the example below with your own
   public static void main(){
    int low = Integer.parseInt(JOptionPane.showInputDialog("Enter low value"));

    double x = -5.7;
    
    System.out.println((int)x);
    
    int high = Integer.parseInt(JOptionPane.showInputDialog("Enter high value"));
    
    int dif = high - low;
    
   
    if(low >= high){
        System.out.println("error");
        
    }
    else{
        int[] myArray =new int[10];
        
        int evens = 0;
        
        int odds = 0;
        
        for(int i = 0; i < 10; i++){
             int num = (int)(Math.random()*(dif + 1)) + low;
             
             myArray[i] = num;
             
            
             
              if(num%2 == 1){
                 odds = odds + 1;
                  System.out.println("Item #" + (i +1) + " is " + num + " which is odd");
             
             }
        
            else if (num%2 == 0){
                evens = evens + 1;
                 System.out.println("Item #" + (i + 1) + " is " + num + " which is even");
            }
             
            
             
            
        
    }
    
    System.out.println("the array has " + odds + " odds and " + evens + " evens");
    

}
}
}
