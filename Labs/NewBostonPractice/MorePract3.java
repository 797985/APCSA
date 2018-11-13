
/**
 * Write a description of class MorePract3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MorePract3
{
    private String friendName;
    //Have to use class name in consructor
    
    public MorePract3(String name){ 
        //A Constructorallows u to initialize variables as an object is created
        friendName=name;
    }
    
    public void setName(String name){
        friendName = name;
    }
    public String getName(){
        return friendName;
    }
    public void saying(){
        System.out.printf("Your first friend was %s", getName());
    }
}
