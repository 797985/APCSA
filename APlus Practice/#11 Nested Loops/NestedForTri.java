//A+ Computer Science
// www.apluscompsci.com

//nested for loop example

public class NestedForTri
{
   public static void main(String args[])
   {

    /*
        *
            **
            ***
            ****
            *****
            ******
            *******
            ********
            *********
        */

        int stop=9;
        //add in a for loop to print the rows   //rows
           //add in a for loop to print out the * on each row  //columns
           
           for(int b=1; b<=stop; b++){
               for(int n=1; n<=b; n++)
                    System.out.print("*");
               System.out.println();
           }
               
           //print out a new line


    }
}