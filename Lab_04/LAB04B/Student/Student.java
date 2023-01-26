public class Student 
{
    private String studentName;
    private int studentYear;

    public Student(String theName, int theYear)
    {
        studentName = theName;
        studentYear = theYear;
    }

    public String getName()
    {
        return studentName;
    }

    public int getYear()
    {
        return studentYear;
    }
    
}
