public class LAB02A_GradeBookOOP 
{
    private double[] grade;

    public   LAB02A_GradeBookOOP()
    {
        grade = new double[0];
    }
    public  LAB02A_GradeBookOOP(double[] theInput)
    {
        grade = theInput;
    }
    public void printGrades()
    {
        for(double val : grade)
        System.out.println(val);
    }
    public double averageGrade()
    {
        double sum = 0,numberOFStudents = 0;
        for(double val: grade)
        {
            sum += val;
            numberOFStudents++;
        }
        return sum/numberOFStudents;
    }
    
}
