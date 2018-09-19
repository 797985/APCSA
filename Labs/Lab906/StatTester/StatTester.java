
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// imports go here
import java.util.Arrays;
public class StatTester{

    private int[] nums = new int[100];
    // Constructor
    public StatTester(){

    }

    //  Methods
    public void loadArray(){
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10 + 1);
        }
    }

    public void printArray(){
        //int[] intnums = (7, 9, 1, 3);
        System.out.println(Arrays.toString(nums));

    }

    public void getSum(){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }

    public double getMean() {
        double sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum / nums.length;
    }

    public double getMedian() {
        int middle = nums.length/2;
        if (nums.length%2 == 1) {
            return nums[middle];
        } else {
            return (nums[middle-1] + nums[middle]) / 2.0;
        }
    }

    public int getMode() {
        int maxValue, maxCount;

        for (int i = 0; i < nums.length; ++i) {
            int count = 0;
            for (int j = 0; j < nums.length; ++j) {
                if (nums[j] == nums[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = nums[i];
            }
        }

        return maxValue;
    }
}