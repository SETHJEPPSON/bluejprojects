import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private String name;
    private int speed;
   
    
    public Car()
    {    
        speed = 0;
        name = null;
    }
    

    public Car(String name, int speed){
        this.speed = speed;
        this.name = name;
    }
    
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    
        public void act() 
    {
        move(speed);
        if(isAtEdge()){
            turn(getRandomNumber(1,90));
        }
        getWorld().showText(toString(), (getWorld().getHeight())/2, (getWorld().getWidth())/2);
    }
    
    public String toString(){
        return this.speed + "\n" + this.name + "\n" + getX() + "\n" + getY();
    }
}
