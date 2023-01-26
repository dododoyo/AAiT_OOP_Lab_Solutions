import java.util.*;
class GBProgram1
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int response;
        double[] sampleGrades = {45.0,59.0,68.9,87.5,79.8};
        GradeBookOO1 sampleGradebook = new GradeBookOO1(sampleGrades);
        
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