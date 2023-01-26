import java.util.*;


public class LAB02A_GradeBookModified 
{

    public static void main(String[] args)
    {
        double[] theGrades = new double[args.length];
        for(int i = 0 ; i < args.length ; i++)
        {
            theGrades[i] = Double.parseDouble(args[i]);
        }
        
        
        
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
    public static void showMenu(double[] theGrades)
    {
        Scanner kb = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("Please select one of the two: ");
            System.out.println("1. Print out all the grades.");
            System.out.println("2. Find the average grade. ");
            System.out.print("Enter your choice here: ");
            choice = kb.nextInt();
        }while(!(choice==1 || choice==2));
        if (choice == 1)
        {
            System.out.println("All of the student's grades are: ");
            printGrades(theGrades);
        }
        else 
        {
            double average = averageGrade(theGrades);
            System.out.println("The average mark is " + average);
            System.out.println("The grade from the average mark is " + markToGrade(average));
        }

    }
    
}
