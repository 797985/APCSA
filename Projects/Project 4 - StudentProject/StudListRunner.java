
/**
 * Write a description of class StudListRunner here.
 *
 * @author Nick Gonzales
 * @version October 25, 2018
 */
import java.util.Scanner;

public class StudListRunner
{
    public static void main(){

        Scanner sc = new Scanner(System.in);
        StudentList hi = new StudentList();
        int x=0;
        double y = 0.0;
        String z = " ";
        Student s1 = new Student(x, y, z);
        while (true){
            mainPrint();
            if(sc.nextInt()==1){
                System.out.println("Student Name");
                z=s1.addStudentName();
                System.out.println("Student Number");
                x=s1.addStudentNumber();
                System.out.println("Student Gpa");
                y=s1.addStudentGpa();
                System.out.println(\u000C);
                //}else if(sc.nextInt()==2){
                //  System.out.println(s1.print());
            }
        }
    }

    
    
    
    
    
    
    public static void mainPrint(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
