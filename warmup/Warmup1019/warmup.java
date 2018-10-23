
/**
 * Write a description of class warmup here.
 *
 * @author (Nick Gonzales)
 * @version (10/19)
 */
public class warmup
{
    public static void main(){
        String s1 = "e";
        String s2 = "This week is homecoming wEEk.";
        System.out.print(strOcurs(s1, s2));
    }

    public static int strOcurs(String a, String b){
        int returnVar = 0;
        b = b.toLowerCase();
        int i = 0;
        while (i < b.length()){
            int j = b.indexOf(a.toLowerCase(), i);
            if (j != -1) {
                returnVar += 1;
                i = j + 1;
            }
            else{
                i = b.length();
            }
        }
        return returnVar;   
    }
}
