
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
        double x;

        while (true){
            if (ballBot.canMoveForward(ballWorld)){
                ballBot.moveForward();
            }else{
                x = Math.random() *360;
                ballBot.setHeading(x);

            }

        }

    }

    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        int ballBotArray[];
        ballBotArray = new ballBotArray[10];
        TGPoint entrancePoint = new TGPoint(0,0);
        
        
        for (w = 0; w<ballBotArray.length; w++){
            
        }
        return
    }
}
