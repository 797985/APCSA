
/**
 * Using methods with parameters
 *
* @author (Nick Gonzales)
 * @version (11/15/18)
 */
import java.util.Scanner;
public class Pract2
{
  
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Pract2Continued tunaObject = new Pract2Continued();
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        tunaObject.simpleMessage(name);
        
    }
    
}
