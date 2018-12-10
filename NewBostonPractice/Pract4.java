
/**
 * Nested if Statements
 *
* @author (Nick Gonzales)
 * @version (11/22/18)
 */
public class Pract4
{
    public static void main(String args[]){
        int age = 60;
        if (age < 50){
            System.out.println("You are young");
        }else{
            System.out.println("You are old");
            if (age > 75){
                System.out.println("You are REALLY old!");
            }else{
                System.out.println("dont worry your arent really that olds");
            }
        }
    }
}
