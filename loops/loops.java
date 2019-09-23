
public class loops
{
    public static void main(){
        String[] firstNames = {"dark lord", "bruh", "myguy", "gamer", "LeBron", "Sir", "Darth"};
        String[] lastNames = {"face", "dude", "the fool", "boy", "stupid", "johnson", "bruhmoment"};
        
        System.out.println("First Name\t\tLastName");
        for(int i = 0; i < 10; i++){
            int choose1 = (int)(Math.random() * 6 + .5);
            int choose2 = (int)(Math.random() * 6 + .5);
            System.out.println(firstNames[choose1] + " " + lastNames[choose2]);
            
        
        
        }

      
    }
    
}
