
/**
 * Write a description of class dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dog
{
    //instance variables
    private String name;
    private String breed;
    private double weight;
    
    public dog(){
        name = null;
        breed = null;
        weight = 0;
    }
    
    public dog(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    
    }
    
    public double getWeight(){
        return this.weight;
    
    }
    
    public String toString(){
        return "Name: " + name + " Breed: " + breed + " Weight: " + weight;
    }
}
