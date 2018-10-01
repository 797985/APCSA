
/**
 * Write a description of class Activity2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity3
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
        for (int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray[i]==null) return i;
        }
        return ballBotArray.length;
    }
    
    public double distanceBetweenPoints(TGPoint point1, TGPoint point2){
        
        return Math.sqrt((Math.pow(point1.x-point2.x,2)) + (Math.pow(point1.y-point2.y,2)));
        
    }
    public boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint){
        BallRunner ballRunner = new BallRunner();
        boolean tf = true;
        for (int e = 0; e < ballBotArray.length; e++){
            if (!(ballBotArray[e] == null)){
                if (ballBot.getPoint() > 2 * ballBot.getRadius()){
                    return false;
                }else{
                    return true;
                }
            }
        }
    }
    public static void a3(){
        Activity3 thisClass = new Activity3();
        int freeBallBotArray[];
        int freeBallBotIndex;
        BallBot[] ballBotArray = new BallBot[10];
        TGPoint findFreeBallBotIndex = new TGPoint();
        BallWorld ballWorld = new BallWorld(250, 250);
        TGPoint tgPoint = new TGPoint (0, 0);
        double x = 0;
        BallBot currBallBot;
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