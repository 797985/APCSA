
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
        while (age <= 21){
            //instead of typing multiple if statements it evaluates the value to see which one it is
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
            case 4:
            System.out.println("You can get toys");
            break;
            case 5:
            System.out.println("You can think");
            break;
            case 6:
            System.out.println("You can go to the bathroom");
            break;
            case 7:
            System.out.println("You can love non family members");
            break;
            case 8:
            System.out.println("You can do stuff");
            break;
            case 10:
            System.out.println("You're in double digits");
            break;
            case 13:
            System.out.println("You're a teen");
            break;
            case 14:
            System.out.println("You can start to do stuff without adult supervision");
            break;
            case 16:
            System.out.println("You can drive");
            break;
            case 18:
            System.out.println("You are now legally an adult");
            break;
            case 21:
            System.out.println("You can drink alcohol");
            break;
            default:
            System.out.println("I don't know how old you are");
            break;
        }
        age++;
        
    }
    }
}
