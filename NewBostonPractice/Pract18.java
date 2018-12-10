
/**
 * Array Elements as counters and making a dice
 * Shows the frequency of how many times each number was rolled in 1 thousand rolls
 * @author (Nick Gonzales)
 * @version (December 10, 2018)
 */
import java.util.Random;
public class Pract18
{
    public static void main(String[] args){
        Random rand = new Random();
        int freq[]=new int[7]; //frequency array
        
        for(int roll=1;roll<1000; roll++){
            ++freq[1+rand.nextInt(6)]; //gives u 0 to 5, but the 1 makes it 1 through 6
        }
        System.out.println("Face\tFrequency");
        
        
        for(int face=1;face<freq.length;face++){
            System.out.println(face+"\t"+freq[face]);
        }
    }
}
