
/**
 * Creating a random # generator
 *
 * @author (Nick Gonzales)
 * @version (11/24/18)
 */
import java.util.Random;
public class Pract8
{
    public static void main(String args[]){
        Random dice = new Random();
        int number;
        for (int counter =1; counter <= 10; counter++){
            //use 1+ in front of dice so that it is 1-6 instead of 0-5
            number = 1+dice.nextInt(6);
            System.out.println(number + " ");
        }
    }
    
}
