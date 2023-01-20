public class LAB03A_GradeBookOO 
{
    private double[] grade;

    public   LAB03A_GradeBookOO()
    {
        grade = new double[0];
    }

    public  LAB03A_GradeBookOO(double[] theInput)
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
