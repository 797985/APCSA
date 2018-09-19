
/**
 * Write a description of class BallRunner here.
 *
 * @author (Nick)
 * @version (9/19/18)
 */
public class BallRunner
{
    public static void run(){
        BallWorld ballWorld = new BallWorld(250, 250);
        TGPoint tgPoint = new TGPoint (0, 0);
        BallBot ballBot = new BallBot(ballWorld, tgPoint, 0, 10);
        
        
    }
    
}
