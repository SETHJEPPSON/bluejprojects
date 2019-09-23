import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Foot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Foot extends Actor
{
    private String name;
    private int speed;
    private int rotation;
    private int x;
    private int y;
    private int collisionCount;
    
    public Foot(){
        name = null;
        speed = 10;
        rotation = 45;
    }
    public Foot(String name, int speed, int rotation){
        this.name = name;
        this.speed = speed;
        this.rotation = rotation;
        
    }
    public String toString(){
        return "Foot: " + name + "\nX: " + x + " Y: " + y; 
    }
    
    public void act() 
    {
        // Add your action code here.
        move(speed);
        
        if(isAtEdge()){
            turn(235);
            move(20);
        }
        if(isTouching(Alligator.class)){
            turn(180);
            collisionCount++;
            //System.out.println("Collision " + this.name + " " + collisionCount);
        }
    }    
}
