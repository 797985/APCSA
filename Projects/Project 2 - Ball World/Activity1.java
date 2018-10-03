
/**
 * Write a description of class Activty1 here.
 *
 * @author (Nick)
 * @version (9/19/18)
 */
public class Activity1
{
    public static void run(){
        //initializes/declares BallWorld, TGPoint, and BallBot
        BallWorld ballWorld = new BallWorld(250, 250);
        TGPoint tgPoint = new TGPoint (0, 0);
        BallBot ballBot = new BallBot(ballWorld, tgPoint, 0, 10);
        //x is a instance variable
        double x;
        
        while (true){
            if (ballBot.canMoveForward(ballWorld)){
                //tells the ballBot to move forward if it can
                ballBot.moveForward();
            }else{
                //tells the ballbot to turn if it can not move forward
                x = Math.random() *360;
                ballBot.setHeading(x);

            }

        }

    }

    
}
