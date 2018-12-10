
/**
 * Summing Elements of Arrays
 *
 * @author (Nick Gonzales)
 * @version (December 10, 2018)
 */
public class Pract17
{
    public static void main(String[] args){
        int nick[]={21,16,86,21,3};
        int sum=0;
        
        for(int counter=0; counter<nick.length;counter++)
        sum+=nick[counter];
        
        System.out.println("The sum of these numbers is" +sum);
    }
}
