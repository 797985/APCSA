
/**
 * Write a description of class StudList here.
 *
 * @author (Nick Gonzales)
 * @version (10/31/18)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudentList
{
    ArrayList<Student>StudentList;
    private int x;
    Scanner sc = new Scanner(System.in);
    public StudentList(){
        StudentList=new ArrayList<Student>();
        
    }
    public void addStudent(Student newStudent){
        StudentList.add(newStudent);
    }
    //public void printStudent(){
        //System.out.println(getNumber())
        //for(int i = 0; i<studentList.size(); i++){
            //System.out.println(student
        //}
    //}
}
