import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{


    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        bruh b1 = new bruh();
        int x = 50;
        int y = 50;
        for (int i = 0; i < 30; i+=1){
            x = 100*i;
            y = i*300;
            addObject(new bruh(), x, y);
        }
    }
}

