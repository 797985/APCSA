
/**
 * continued pract13 and tables for multi arrays
 *
 * @author (Nick Gonzales)
 * @version (11/26/18)
 */
public class Pract14
{
    public static void main(String[] args){
        int firstarray[][]={{8,9,10,11},{12,13,14,15}}; 
        int secondarray[][]={{30,31,32,33},{43},{4,5,6}};
        
        System.out.println("This is the first array");
        display(firstarray);
        
        System.out.println("This is the second array");
        display(secondarray);
    }
    
    public static void display(int x[][]){
        //need to write 2 loops, 1 to loop through rows 1 to loop through columns, loop for columns will be inside loop for the rows
        for(int row=0; row<x.length;row++){ //row # then the column #
            for(int column=0; column<x[row].length;column++){ //syntax for inside loop
                System.out.print(x[row][column]+"\t"); //want to output the rows on screen
            
            }
            System.out.println(); //makes it move to a new line for a new row
        }
        
    }
}
