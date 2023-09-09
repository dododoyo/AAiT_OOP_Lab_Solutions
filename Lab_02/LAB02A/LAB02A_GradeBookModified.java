import java.util.*;


public class LAB02A_GradeBookModified 
{

    public static void main(String[] args)
    {
        double[] theGrades = getGrades();
        showMenu(theGrades);
    }

    public static double[] getGrades()
    {
        Scanner kb = new Scanner(System.in);
        int numOfStudents = 0;
        //code that asks user the number of students he has
        System.out.print("Please enter the number of students: ");
        numOfStudents = kb.nextInt(); 
        System.out.println();

        double[] studentsGrades = new double[numOfStudents];
        for (int i = 0; i < numOfStudents ; i++){
            System.out.print("Please enter the grade for student "+(i+1)+": ");
            double eachGrade = kb.nextDouble();
            studentsGrades[i] = eachGrade;
        }
        System.out.println();
        return studentsGrades;
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
            System.out.println();
        }while(choice !=1 && choice != 2);
        
        switch(choice) {
            case 1:
                System.out.println("All of the student's grades are: ");
                printGrades(theGrades);
                break;
            case 2:
                double average = averageGrade(theGrades);
                System.out.println("The average mark is " + average);
                System.out.println("The grade from the average mark is " + markToGrade(average));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        kb.close();
    }    

    public static void printGrades(double[] grade)
    {
        for(double val : grade)
        System.out.print(val+" ");
        System.out.println();
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
