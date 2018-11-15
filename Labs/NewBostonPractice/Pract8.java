
/**
 * Creating a random # generator
 *
 * @author (your name)
 * @version (a version number or a date)
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
