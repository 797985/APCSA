
/**
 * 
 * CellMatrix
 * @author (Nick Gonzales) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */
    
    private Cell[][] cells;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
       cells = new Cell[a][b];
       
    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
       System.out.println(loadMatrix());
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(int y[][]){
       for(int row=0; row<y.length; row++){
           for(int column=0; column<y[row].length;column++){
               System.out.print(y[row][column]+"\t");
            }
            System.out.println();
        }
    }
     /**
     * ++++++++++++++  methods
     */
    
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        
    }
    //  Finds the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
       
        return 0;
    }
   
    
}
