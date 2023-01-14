public class LAB02A_GradeBookDemo_1 
{
    // This is a modified version of orginal GradeBook
    public static void main(String[] args)
    {
        // double[] grades = {78.0,87.0,90,67,70};
        // LAB02C_GradeBook GradeBook = new LAB02C_GradeBook(grades);

        // GradeBook.printGrades();
        // System.out.println("\nThe average of the given grades is: " + GradeBook.averageGrade());
        
    }
    public void printGrades(double[] arr)
    {
        for(double val : arr)
        System.out.println(val);
    }
    public double averageGrade(double[] arr)
    {
        double sum = 0,numberOFStudents = 0;
        for(double val: arr)
        {
            sum += val;
            numberOFStudents++;
        }
        return sum/numberOFStudents;
    }
    
}
