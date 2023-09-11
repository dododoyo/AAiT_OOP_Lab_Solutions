class GradeBookOO1 
{
    /* Compiling this code will show the following error in the terminal(cmd)
    
        Error: Main method not found in class GradeBookOO1, please define the main method as:
        public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application*/
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
