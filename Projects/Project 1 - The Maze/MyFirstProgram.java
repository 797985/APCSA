
/**
 * Write a description of class MyFirstProgram here.
 * 
 * @author (Nick) 
 * @version (8/30)
 */
public class MyFirstProgram
{
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
    }
}
