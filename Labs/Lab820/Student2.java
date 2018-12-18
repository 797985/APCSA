
/**
 * Write a description of class Student2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student2
{
    private int stuNumber;
    private boolean stuActive;
    private double stuGPA;
    private String stuName;
    //Student Number
    public Student2()
    {
        stuNumber = 797985;
        stuActive = true;
        stuGPA = (4+4+4+4+3+4+4+3+4+3+3+4+4+5+5+4+4+4)/18;
        stuName = "Nick";
    }
    
    public void setStuNumber(int sn)       
    {
        stuNumber = sn;
    }
    
    public int getStuNumber()      
    {
        return stuNumber;
    }
    
    public void setStuActive(boolean Status)       
    {
        stuActive = true;
    }
    
    public boolean getStuActive()      
    {
        return stuActive;
    }
    public void setStuGPA(){
        stuGPA = (4+4+4+4+3+4+4+3+4+3+3+4+4+5+5+4+4+4)/18;
    }
    public double getStuGPA(){
        return stuGPA;
    }
    
}