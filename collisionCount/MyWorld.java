import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        
        
        super(600, 400, 1); 
        
        Alligator a1 = new Alligator("bob", 100, 10);
        addObject(a1, 300, 200);
        Foot f1 = new Foot("Jeff", 20, 45);
        addObject(f1, 500, 300);
        f1.setRotation(45);
        Foot f2 = new Foot("Adam", 40, 45);
        addObject(f2, 400, 300);
        f2.setRotation(45);
        Foot f3 = new Foot("Bob", 60, 45);
        addObject(f3, 300, 300);
        f3.setRotation(45);
        
    }
}
