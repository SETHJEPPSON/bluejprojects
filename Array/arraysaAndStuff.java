
/**
 * Write a description of class arraysaAndStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arraysaAndStuff
{
    public static void main(){
       
        //random number between 90 and 100, inclusive
       
        int num;
        
        for(int i = 0; i < 30; i++){
            num = (int)(Math.random()*10) + 90;
            System.out.println(num);
            
            System.out.println("remainder when divided by 2 is " + num%2);
            
            

        }
       

    }
}
