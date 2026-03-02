import java.util.ArrayList;

/**
 * @(#)Farm.java
 * Create an array list of animals
 * Populate it with various types of animals
 * Polymorphism - ta daa
 *
 * @author
 * @version 1.00 2023/3/8
 */


public class Farm {
    
    public Farm() {
        
    	
        
    }
    
public static void main(String[] args){
    ArrayList<Animal> animalFarm = new ArrayList<>();
    animalFarm.add(new Animal());
    animalFarm.add(new Animal("caw caw"));
    animalFarm.add(new Cow());
    for(Animal a: animalFarm)
    {
        System.out.println(a.speak());
        System.out.println(a.eat());
        if(a instanceof Cow)
        System.out.println(((Cow)a).produceMilk(10));
        
    }

}
}