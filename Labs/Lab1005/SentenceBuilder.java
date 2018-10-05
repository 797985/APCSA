
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (Nick Gonzales)
 * @version (10/05/18)
 */
public class SentenceBuilder
{
    String[] Nouns = {"puppy" , "pizza" , "man" , "TV" , "video games" , "football" , "car"};
    String[] Verbs = {"run" , "swim" , "jump" , "bounce" , "throw" , "hit" , "play"};
    String[] Adjectives = {"smart" , "cool" , "fun" , "fast" , "slow" , "boring" , "gnarly"};
    String[] Determiners = {"the" , "my" , "your" , "his" , "hers" , "our" , "their"};
    String[] Adverbs = {"quickly" , "happily" , "roughly" , "very" , "often" , "never"};
    String[] Prepositions = {"over" , "near" , "on top of" , "behind" , "next to" , "inside of" , "under"};

    public String getRandomNoun(){
        
        int x = (int)((Math.random()) *Nouns.length);
        return Nouns[x];
    }
    public String getRandomVerb(){
        
        int x = (int)((Math.random()) *Verbs.length);
        return Verbs[x];
    }
    public String getRandomAdjective(){
        
        int x = (int)((Math.random()) *Adjectives.length);
        return Adjectives[x];
        
    }
    public String getRandomDeterminer(){
        
        int x = (int)((Math.random()) *Determiners.length);
        return Determiners[x];
    }
    public String getRandomAdverb(){
        
        int x = (int)((Math.random()) *Adverbs.length);
        return Adverbs[x];
    }
    
}

