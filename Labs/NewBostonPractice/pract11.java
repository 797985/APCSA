
/**
 * do while loops.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pract11
{
    public static void main(String args[]){
        int counter = 15;
        //it executes the do first so it would print out 15 and then it would realize that it cant do it anymore because it isn't less than or equal too 10.
        do{
            System.out.println(counter);
            counter++;
        }while(counter <=10);
    }
}
