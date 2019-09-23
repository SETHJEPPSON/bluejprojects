
/**
 * Write a description of class dogDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dogDriver
{
    public static void main(){
        dog d1 = new dog();
        dog d2 = new dog("Lightning", "Australian sheepdog", 13);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.getWeight());
        
        
    }
}
