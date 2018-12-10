
/**
 * Compound Interest Program
 *
 * Nick Gonzales
 * @version (December 10, 2018)
 */
public class Pract16
{
    //arg = argument
    public static void main(String[] args){
        //A=P(1+R)^n  //formula for compound interest: a = amount, p = principal, r = rate, n = number of years
        double amount;
        double principal = 10000; //current "Subscribers"
        double rate = .01; //gaining "subscribers" 1% per day
        
        for (int day=1; day<=20; day++){ //info from day 1 to day 20
            amount = principal*Math.pow(1 + rate, day);
            System.out.println(day + "   "+ amount);
        }
    }
}
