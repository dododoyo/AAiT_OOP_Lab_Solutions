public class LAB02A_GradeBookOOP 
{
public static void main(String[] args)
    {
        double[] theGrades = new double[args.length];

        for(int i = 0 ; i < args.length ; i++)
        {
            theGrades[i] = Double.parseDouble(args[i]);
        }

        printGrades(theGrades);
        
        averageGrade(theGrades);
    }

    public static void printGrades(double[] grade)
    {
        for(double val : grade)
        System.out.print(val+" ");
        System.out.println();
    }

    public static double averageGrade(double[] grade)
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
