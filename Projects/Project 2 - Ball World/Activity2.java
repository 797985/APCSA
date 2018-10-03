
/**
 * Write a description of class Activity2 here.
 *
 * @author (Nick Gonzales)
 * @version (September 23)
 */
public class Activity2
{
    //created the ballworld and BallBot
    public static void run(){
        BallWorld ballWorld = new BallWorld(250, 250);
        TGPoint tgPoint = new TGPoint (0, 0);
        BallBot ballBot = new BallBot(ballWorld, tgPoint, 0, 10);
        double x;
        //we made a while loop and a if/else statement to tell the BallBot that if there is space, move forward
        while (true){
            if (ballBot.canMoveForward(ballWorld)){
                ballBot.moveForward();
            }else{
                x = Math.random() *360;
                ballBot.setHeading(x);

            }

        }

    }
    //the length of the ballbot array
    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        for (int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray[i]==null) return i;
        }
        return ballBotArray.length;
    }

    public static void a2(){
        Activity2 thisClass = new Activity2();
        int freeBallBotArray[];
        int freeBallBotIndex;
        BallBot[] ballBotArray = new BallBot[10];
        TGPoint findFreeBallBotIndex = new TGPoint();
        BallWorld ballWorld = new BallWorld(250, 250);
        TGPoint tgPoint = new TGPoint (0, 0);
        double x = 0;
        BallBot currBallBot;
        //the loops and statements creates the other ballBots
        while (true){
            if (thisClass.findFreeBallBotIndex(ballBotArray) < ballBotArray.length){
                ballBotArray[thisClass.findFreeBallBotIndex(ballBotArray)] = new BallBot(ballWorld, tgPoint, 0, 10);
            }
            for (int b = 0; b < thisClass.findFreeBallBotIndex(ballBotArray); b++){
                currBallBot = ballBotArray[b];
                System.out.println(ballWorld);
                System.out.println("currBallBot: " + currBallBot);
                
                if (!(currBallBot == null)){
                    if (currBallBot.canMoveForward(ballWorld)){
                        currBallBot.moveForward();
                    }else {
                        x = Math.random() *360;
                        currBallBot.setHeading(x);
                    }
                }
            }
        }
    }
}