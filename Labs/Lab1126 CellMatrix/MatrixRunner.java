
/**
 * 
 * 
 * @author (Nick Gonzales) 
 * @version (11-26-18)
 */
public class MatrixRunner{
    
    public static void main(){
      CellMatrix cm = new CellMatrix(8, 11);  
      cm.loadMatrix();
      cm.loadCellNeighbors();
      cm.printMatrix();
      System.out.println("\n\n Largest neighbor value = " + cm.getGreatestNeighbors());
    }
}
