import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bruh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bruh extends Actor
{
    private int speed;
    
    public bruh(){
        this.speed = 5;
    }
    
    public void act() 
    {
        move(this.speed);
        
        if (Greenfoot.isKeyDown("d")){
            turn(5);
        }
        if (Greenfoot.isKeyDown("a")){
            turn(-5);
        }
        if (Greenfoot.isKeyDown("w")){
            speed = 10;
        }
        else if (Greenfoot.isKeyDown("s")){
            speed = 3;
        }
    }    
}
