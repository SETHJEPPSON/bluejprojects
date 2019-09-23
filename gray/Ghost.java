
/**
 * Write a description of class ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost
{
    //instance variables for the class ghost
    private String color;
    private int speed;
    private int level;
    
    //zero-argument constructor, makes default ghost
    public Ghost(){
        color = null;
        speed = 0;
        level = 1;
        System.out.println("a default ghost was made");
        
        
        
    }
    
    //two-argument constructor, can set the instance variables to anything desired
    public Ghost(String color, int speed, int level){
        this.color = color;
        this.speed = speed;
        this.level = level;
        System.out.println("A unique ghost was construced");
    }
    
    public void bumpSpeed(){
        
        this.speed++;
    
    }
    
    
    public void bumpSpeed(int bump){
        
        this.speed += bump;
    
    }
    
    public void doubleColor(){
        this.color = color + color;
    
    }
    
    public void levelUp(){
        this.level++;
    }
    
    public void levelUp(int lev){
        this.level += lev;
    }
    
    //public meanns other classes have acess to this method
    //string is the return type of this method
    //toString is the name of this method
    public String toString(){
        
        return "Color: " + this.color + " Speed: " + this.speed + " Level: " + this.level;
        
    }
    
    
}
