
/**
 * Multidimensional array practice.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pract13
{
    public static void main(String[] args){
        //syntax is array type (ex. int) and the name of the array
        //multidimension array initializer
        int firstarray[][]={{8,9,10,11},{12,13,14,15}}; //first square bracket is for the row, the second one is for the column
        //anytime u want to go to a new row make more curly brackets in the other {{Numbers in row 1},{numbers in row 2}}
        //first row = 8,9,10,11 and 2nd row is 12,13,14,15
        //to call elements use firstarray[0][1] points to 9 because [0][0] is the first number so it is 8
        int secondarray[][]={{30,31,32,33},{43},{4,5,6}}; //different column lengths
        //secondarray[2][1] = 5;  secondarray[1][0] = 43; secondarray[0][3] = 33 
    }
}
