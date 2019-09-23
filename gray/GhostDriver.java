
/**
 * Write a description of class GhostDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GhostDriver
{
    public static void main(){
        Ghost g4 = new Ghost("chartruse", 99, 1);
                
        System.out.println(g4.toString());
        
        g4.bumpSpeed(6);
        
        System.out.println(g4.toString());
        
        g4.doubleColor();
        
        System.out.println(g4.toString());
        
        g4.levelUp(100);
        
        System.out.println(g4.toString());
        
        
    
    
    }
    
}
