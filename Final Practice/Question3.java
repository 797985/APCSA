
/**
 * Write a description of class Question3 here.
 *
 * @author (Nick Gonzales)
 * @version (12/12/18)
 */
public class Question3
{
    public static void main(String args[]){
    int[] nums = {1,2,3,4,5};
    int sum = 0;
    for(int i = 0; i < nums.length; i++)
    if(sum < nums[i]) sum=nums[i];
}
}
