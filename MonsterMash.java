public class MonsterMash{
  public static void main(String[] args){
    //Monster monster = new Monster(); //NOT ALLOWED
    //Because monster has a modifued constructur but not
    //a default constructor, monster does not inheritr a 
    //default constructor
    Monster dracula = new Monster("Dracula");

    System.out.println(dracula);
    System.out.println(dracula.kill());

    Monster sally = new Witch("sally");


    System.out.println(sally);

     System.out.println(sally.kill());
     System.out.println(((Witch)sally).fly());

     //Declare a monster
     //Declare your Type of Monster
     //Bonus Challenge: Add an instance field
     Monster drogon = new Dragon("drogon");
     System.out.println(drogon);
     System.out.println(drogon.kill());
     System.out.println(((Dragon)drogon).pillage());

     
  }
}
