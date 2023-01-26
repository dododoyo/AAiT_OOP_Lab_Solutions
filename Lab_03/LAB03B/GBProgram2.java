import java.util.*;
class GBProgram2
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int response;
        int length = 6;
        GradeBookOO2 sampleGradebook = new GradeBookOO2(length);

        sampleGradebook.addGrades(45.7, 0);
        sampleGradebook.addGrades(97.0, 1);
        sampleGradebook.addGrades(85.0, 2);
        sampleGradebook.addGrades(77.9, 3);
        sampleGradebook.addGrades(65.8, 4);
        sampleGradebook.addGrades(59.4, 5);
        
        do
        {
            System.out.println("\n1. Print out all the grades: ");
            System.out.println("2. Show the average of the grades: ");
            System.out.print("Please select the task you want to perform: ");
            response = kb.nextInt();
        }while( !(response==1 || response == 2));
        kb.close();

        if (response == 1)
        sampleGradebook.printGrades();
        else if ( response == 2)
        System.out.printf("The average grade of the students is :%,.2f",sampleGradebook.averageGrade());

    }
}