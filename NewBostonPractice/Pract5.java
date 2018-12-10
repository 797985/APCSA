
/**
 * else if statement practice
 *
  * @author (Nick Gonzales)
 * @version (11/22/18)
 */
public class Pract5
{
    public static void main(String args[]){
        int age = 45;
        if (age >= 60)
        System.out.println("You are a senior citizen");
        //else if statement goes in between the if and else statement
        else if (age >=50)
        System.out.println("You are in your fifties");
        else if (age >=40)
        System.out.println("You are in your fourties");
        else
        System.out.println("You are young");
        
    }
}
