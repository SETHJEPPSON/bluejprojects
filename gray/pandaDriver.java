
/**
 * Write a description of class pandaDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pandaDriver
{
    public static void main(){
        panda p1 = new panda("USA", 435.5);
        
        double currentWeight = p1.getWeight();
        
        currentWeight += 1000;
        
        p1.setWeight(currentWeight);

        System.out.println(p1.getWeight());
        
        panda[] pArray = new panda[3];
        
        pArray[0] = new panda("Japan", 2000.0);
        pArray[1] = new panda("Russia", 31.3);
        pArray[2] = new panda("Mexico", 200.5);
        
        for (int i = 0; i < pArray.length; i++){
            System.out.println(pArray[i].getCountry());
        }
    }

}
