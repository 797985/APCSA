
/**
 * Write a description of class Student here.
 *
 * @author (Nick Gonzales)
 * @version (10/25/18)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Student
{
    Scanner sc = new Scanner(System.in);
    int Number;
    String Name;
    double Gpa;
    public Student(int x, double y, String z){
        Number=x;
        Gpa=y;
        Name=z;
    }

    public String addStudentName(){
        return sc.nextLine();
    }

    public int addStudentNumber(){
        return sc.nextInt();

    }

    public double addStudentGpa(){
        return sc.nextDouble();
    }

    public void set (double Gpa){
        Gpa = (3.3);
    }

    //public int getInt(){
        
    //}

    public void print(){
        System.out.println(Number);
    }

    public int getNumber(){
        return Number;
    }

}
