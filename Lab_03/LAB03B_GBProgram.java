import java.util.*;
public class LAB03B_GBProgram
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int response;
        
        LAB03B_GradeBookOO sampleGradebook = new LAB03B_GradeBookOO(6);

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