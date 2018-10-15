
/**
 * Write a description of class Gibberish here.
 *
 * @author (Nick Gonzales)
 * @version (10/11/18)
 */
public class Gibberish
{
    private String sourceString;
    
    public Gibberish(){
        Template template = new Template();
        sourceString = template.getSourceString();
    }
    //make Gibberish is suppose to create random words that create a sentence
    public String makeGibberish(WordList5000 wordlist5000){
        int currentSourceIndex = 0;
        int nextBracket = 0;
        int firstIndex = 0;
        //type of speech is for different word types like verbs, nouns, adjectives, ect.
        String typeOfSpeech;
        String resultString = new String();
        while (currentSourceIndex < sourceString.length()){
            firstIndex = sourceString.indexOf("<"); // finds where this symbol is located
            if(firstIndex == -1){
                resultString += sourceString.substring(currentSourceIndex);
                currentSourceIndex = sourceString.length();
                
            }else{
                
                resultString += sourceString.substring(currentSourceIndex, firstIndex);
                //defining how next Bracket will work 
                nextBracket = sourceString.indexOf(">" , firstIndex + 1);
                //Defining how type of speech will work
                typeOfSpeech = sourceString.substring(currentSourceIndex, nextBracket);
                //this if statement is trying to create the random word generator
                if(wordlist5000.getRandomWordString(typeOfSpeech)!=null){
                    resultString += wordlist5000.getRandomWordString(typeOfSpeech);
                }
                currentSourceIndex = nextBracket + 1;
            }
            
        }
        return resultString;
    }
}
