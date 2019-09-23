
/**
 * Write a description of class panda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class panda
{
    private String country;
    private double weight;
    
    public panda()
    {
        this.country = null;
        this.weight = 0;
    }

    public panda(String country, Double weight){
        this.country = country;
        this.weight = weight;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }
    
    public double getWeight(){
        return this.weight;
    }

    public String toString()
    {
        return "Country: " + this.country + " Weight: " + this.weight;
    }
}
