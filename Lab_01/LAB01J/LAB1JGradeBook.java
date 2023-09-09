public class LAB1JGradeBook {
    public static void main(String[] args)
    {
        double[] studentGrades = {89.0,12,45.7,90};
        long numberOfStudents=0;
        for(double val:studentGrades)
        {
            System.out.println(val);
            numberOfStudents++;
        }
        double sum= 0;
        for (double val:studentGrades)
        sum += val;
        double average = sum/numberOfStudents;
        System.out.println("The average mark is " + average);
        System.out.println("The grade from the average mark is " + markToGrade(average));
        
    }

    public static char markToGrade(double theGrade)
    {
        char grade = 'F';
        if (theGrade >= 90 )
        grade = 'A';
        else if (theGrade >= 80 )
        grade = 'B';
        else if (theGrade >= 70 )
        grade = 'C';
        else if (theGrade >= 60 )
        grade = 'D';
        else 
        grade = 'F';

        return grade;
    }
    
}
