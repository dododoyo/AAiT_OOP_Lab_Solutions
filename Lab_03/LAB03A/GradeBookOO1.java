class GradeBookOO1 
{
    private double[] grade;

    public   GradeBookOO1()
    {
        grade = new double[0];
    }

    public  GradeBookOO1(double[] theInput)
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
