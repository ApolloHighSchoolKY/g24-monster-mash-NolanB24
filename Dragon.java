public class Dragon extends Monster {
    public Dragon(String name){
        super(name);
    }
    //Dragon gobbles up nights 
    public String kill(){
    return getName() + " killed a victim, an ear piercing roar being heard \n";

    }
    public String pillage(){
        return getName() + " pillaged and burned a village, all while flying high overhead\n";
    }
        
    
    
}
