
/**
 * Write a description of class Activity2 here.
 *
 * @author (Nick Gonzales)
 * @version (September 27)
 */
public class Activity4
{
    public static void run(){
        BallWorld ballWorld = new BallWorld(250, 250);
        TGPoint tgPoint = new TGPoint (0, 0);
        BallBot ballBot = new BallBot(ballWorld, tgPoint, 0, 10);
        double x;
        //Tells ball Bot to move forward and turn if there is room
        while (true){
            if (ballBot.canMoveForward(ballWorld)){
                ballBot.moveForward();
            }else{
                //the Math.random tells the ballBot to turn in any direction in 360 degrees
                x = Math.random() *360;
                ballBot.setHeading(x);

            }

        }

    }

    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        //We created a loop of ballBotArray's and we created the length
        for (int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray[i]==null) return i;
        }
        return ballBotArray.length;
    }

    public double distanceBetweenPoints(TGPoint point1, TGPoint point2){

        return Math.sqrt((Math.pow(point1.x-point2.x,2)) + (Math.pow(point1.y-point2.y,2)));

    }
    //the code checks if the entrance is clear
    public boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint){

        boolean tf = true;
        for (int e = 0; e < ballBotArray.length; e++){
            if (!(ballBotArray[e] == null)){
                BallBot ballBot = ballBotArray[e];
                //if the the distance between points is less than 2 times the ballBot radius it won't create another ballBot until there is room
                if (distanceBetweenPoints(entrancePoint, ballBot.getPoint()) < 3 * ballBot.getRadius()){
                    return false;
                }

            }
        }
        return true;
    }
    public BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray){
        //The code is used to make the ball bots bounce off each other
        TGPoint point = ballBot.getPoint();
        TGPoint secondPoint = ballBot.forwardPoint();
        Activity4 thisClass = new Activity4();
        BallBot ret = null;
        for(int b=0; b<ballBotArray.length; b++){
            BallBot otherBallBot = ballBotArray[b];
            if (otherBallBot!=null&&otherBallBot!=ballBot){
                double currentDistance = distanceBetweenPoints(ballBot.getPoint(), otherBallBot.getPoint());
                if(currentDistance <= (ballBot.getRadius() + otherBallBot.getRadius())){
                    double nextDistance = distanceBetweenPoints(secondPoint, otherBallBot.getPoint());
                    if(nextDistance <= currentDistance){
                        ret = otherBallBot;
                    }
                }
            }
        }
        return ret;
    }
    //Our a3 code is creating multiple ballBots to bounce around the ballWorld
    public static void a4(){
        Activity4 thisClass = new Activity4();
        int freeBallBotArray[];
        int freeBallBotIndex;
        BallBot[] ballBotArray = new BallBot[10];
        TGPoint findFreeBallBotIndex = new TGPoint();
        BallWorld ballWorld = new BallWorld(250, 250);
        TGPoint tgPoint = new TGPoint (0, 0);
        double x = 0;
        BallBot currBallBot;
        //creates other BallBots
        while (true){
            if (thisClass.findFreeBallBotIndex(ballBotArray) < ballBotArray.length){
                if (thisClass.entranceClear(ballBotArray, tgPoint) == true){
                    ballBotArray[thisClass.findFreeBallBotIndex(ballBotArray)] = new BallBot(ballWorld, tgPoint, 0, 10);
                }
            }
            for (int b = 0; b < thisClass.findFreeBallBotIndex(ballBotArray); b++){
                currBallBot = ballBotArray[b];
                System.out.println(ballWorld);
                System.out.println("currBallBot: " + currBallBot);

                if (!(currBallBot == null)){
                    if (currBallBot.canMoveForward(ballWorld)){
                        //this if/else statement is calling the method
                        if (thisClass.ballBotToBounceOff(currBallBot, ballBotArray) == null){
                            currBallBot.moveForward();
                            
                        }else{
                            x = Math.random() *360;
                        currBallBot.setHeading(x);
                        }
                        
                    }else {
                        x = Math.random() *360;
                        currBallBot.setHeading(x);
                    }
                }
            }

        }
    }
}