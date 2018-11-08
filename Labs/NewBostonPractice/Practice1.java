
/**
 * Write a description of class Game here.
 *
 * @author (Nick Gonzales)
 * @version (11/08)
 */

public class Practice1
{
    //Switch Statement from new Boston
    
    public static void main(String args[]){
        int age;
        age = 0;
        //I added a while loop to play around
        while (age < 5){
        switch (age){
            case 1:
            System.out.println("You can crawl");
            break;
            case 2:
            System.out.println("You can talk");
            break;
            case 3:
            System.out.println("You can get in trouble");
            break;
            default:
            System.out.println("I don't know how old you are");
            break;
        }
        age++;
        
    }
    }
}
