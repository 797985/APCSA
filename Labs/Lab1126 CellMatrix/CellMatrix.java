
/**
 * 
 * CellMatrix
 * @author (Nick Gonzales) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * 
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
        for(int r=0; r<cells.length; r++){
            for(int c=0; c<cells[r].length; c++){
                //nested for loop
                System.out.print("\t" + cells[r][c].getInt());
            }
            System.out.print("\n"); // \n = new line
        }
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for(int r=0; r<cells.length; r++){
            for(int c=0; c<cells[r].length; c++){
                cells[r][c] = new Cell((int)(Math.random()*10)+1);
            }

        }
    }

    /**
     * ++++++++++++++  methods
     */

    //  Load neighbor cells into the neighbors array
    public void loadCellNeighbors(){
        
        for(int r=0; r<cells.length; r++){
            for(int c=0; c<cells[r].length; c++){
                if(r > 0){ //get north
                    cells[r][c].getNeighbors()[0]=cells[r-1][c];
                }
                if(c>0){ //get west
                    cells[r][c].getNeighbors()[1]=cells[r][c-1];
                }
                if(c<cells[0].length-1){ //get east
                    cells[r][c].getNeighbors()[2]=cells[r][c+1];
                }
                if(r<cells.length-1){ //get south
                    cells[r][c].getNeighbors()[3]=cells[r+1][c];
                }
            }
        } 
    }
    //  Finds the sum of each of the neighbors and returns the greatest 
    // neighbor value
    
    public int getGreatestNeighbors(){
        int largest = 0;
        for(int r=0; r < cells.length; r++){
            for(int c=0; c < cells[r].length; c++){
                int temp = cells[r][c].getNeighborSum();
                if(largest < temp){
                    largest =  temp;
                }
            }
            
        }
        return largest;
    }

}
