
import javax.swing.JOptionPane;

public class inputoutput
{
    public static void main(){
        int A = Integer.parseInt(JOptionPane.showInputDialog("Enter A"));
        if(A == 0){
            System.out.println("A cannot be zero because then it's not a quadratic. Also, the quadratic \nequation wouldn't work.");
            System.exit(0);
        }
        
        int B = Integer.parseInt(JOptionPane.showInputDialog("Enter B"));
        
        int C = Integer.parseInt(JOptionPane.showInputDialog("Enter C"));
        
        int D = B * B;
        
        int E = 4 * A * C;
        
        int F = D - E;
        if(F < 0){
            System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now…”");
            System.exit(0);
        }
        System.out.println("b^2 is " + D);
        System.out.println("4*a*c is " + E);
        double G = Math.sqrt(F);
        System.out.println("Your discriminant is " + G);
        

        System.out.println("Your equation is " + A + "x^2 + " + B + "x + " + C);
        
        System.out.print("The roots are " + (0 - B + G)/(2 * A) + " and " + (0 - B - G)/(2 * A));

        
        /*
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        
        if(age >= 15){
            System.out.println("you are older than 15 " + name);
        }
        else{
            System.out.println("u yung " + name + "yboi");
        }*/
    }
}

