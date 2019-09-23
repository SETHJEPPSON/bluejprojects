import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Actor
{
    private String name;
    private int speed;
    private int turnAmount;
    private int x;
    private int y;
    private int rotation;
    public Alligator(){
        name = null;
        speed = 0;
        turnAmount = 0;
    }
    public Alligator(String name, int speed, int turnAmount){
        this.name = name;
        this.speed = speed;
        this.turnAmount = turnAmount;
        
    }
    public String toString(){
        return "Alligator: " + name + ", Speed: " + speed + "km/hr, " + "Turn Amount: " + turnAmount + " degrees\nX: " + x + " Y: " + y + "\n" + rotation; 
    }
    public void act() 
    {
        // Add your action code here.
        x = getX();
        y = getY();
        rotation = getRotation();
        move(speed);
        turn(turnAmount);
        getWorld().showText(toString(), 300, 200);
        if(isAtEdge()){
            setRotation(rotation + 25);
        }
    }    
}
