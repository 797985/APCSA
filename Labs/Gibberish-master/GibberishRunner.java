
/**
 * Write a description of class Runner here.
 *
 * @author (Nick Gonzales)
 * @version (10/11/18)
 */
public class gibberishRunner
{
    //The Gibberish Runner is so we can run the program
    public static void run(){
        WordList5000 wordList5000 = new WordList5000(); //defines wordList5000
        Gibberish gibberish = new Gibberish();

        String answer;
        answer = gibberish.makeGibberish(wordList5000);
        System.out.println(answer); //prints answer
    }
}
