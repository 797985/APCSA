
/**
 * Write a description of class Quest17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quest17
{
    String s = "Strings are friends, not food";
int x = s.indexOf("friends");
int y = s.indexOf("food");
String str = s.substring(0, x) + "g" + s.substring(y + 1);

}
