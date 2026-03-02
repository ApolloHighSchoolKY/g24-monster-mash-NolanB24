/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{
    private double milkProduced;
    public Cow(){
        super("Moo");
        milkProduced = 0;
    }
    public String speak()
     	{
     		return "The cow saws moooooo";
     	}
		public String eat(){
			super.eat();
			milkProduced+=10;
			return "The cow ate and produced milk.";
		}
		public String produceMilk(int x){
			milkProduced += x;
			return "The cow produced" + x + " more milk.";
		}
    public String toString()
     	{
			if(super.isAlive())
			{
				return "The cow is " + super.getAge() + " years old";
			}
     		return "The animal lived to be age" + super.getAge() + " years old. And produced" + milkProduced;
   

}