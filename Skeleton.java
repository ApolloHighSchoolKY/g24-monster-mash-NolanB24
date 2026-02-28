public class Skeleton extends Monster{
    private double speed;
    
    public Skeleton(){
        speed = 100;
    }

    public Skeleton(String name){
        //If you are going to use a constructor that access a parent class constructor you need to do it first,
        //it can not be after anything.
        super(name);
        speed = 100; 

    }
    public Skeleton(String name, double speed){
        super(name);
        this.speed=speed;
    }

    public String toString(){
        return super.toString() + "Speed : :" + speed;
    }
    
}
