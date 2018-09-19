
/**
 * Write a description of class MazeWalker here.
 *
 * @author (Nick Gonzales)
 * @version (8/30)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }

    public void walkMaze(Maze maze, MazeBot mazeBot){
        for (int x=0; x<2; x+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        for (int x=0; x<3; x+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        for (int x=0; x<2; x+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        for (int x=0; x<4; x+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        for (int x=0; x<3; x+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        for (int x=0; x<2; x+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        for (int x=0; x<2; x+=1){
            mazeBot.moveForward();
        }
        if(mazeBot.didReachGoal()){
            mazeBot.signalSuccess();
        }
        else{
            mazeBot.signalError();

        }

    }
}

