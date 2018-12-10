
/**
 * Array Tables
 *
 * Nick Gonzales
 * @version (November 26, 2018)
 */
public class Pract15
{
    public static void main(String[] args){
        // \t creates spaces between values, it = tab
        System.out.println("Index\tValue"); //header
        int nick[]={32,12,18,54,2}; //array initializer
        for(int counter=0; counter<nick.length;counter++){  //name of array.length is the length of your array, how long it goes for
            System.out.println(counter + "\t" + nick[counter]);  //counter has exact same value of index
            //counter was the index and nick[] is the array Value
        }
        //shows index and value so what row and the value in the row
    }
}
