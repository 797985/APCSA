
/**
 * Averaging Program, using math
 *
 * @author (Nick Gonzales)
 * @version (11/24/18)
 */
import java.util.Scanner;
public class Pract7
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); //System.in is the input (Whatever you type) from the keyboard
        int total = 0;
        int grade;
        int average;
        int counter = 0;
        
        while (counter < 10){
            //allows whatever # inputted to be stored in variable grade
            grade = input.nextInt();
            total = total + grade; //takes the grade and adds it to the total of whatever it was before
            counter++; //adds counter to go through the loop
            
        }
        average = total/10;
        System.out.println("your average is " + average);
    }
}
