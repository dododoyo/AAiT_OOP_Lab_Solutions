import java.util.*;

public class GBProgram3
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int response;
        double addedValue;
        double removedValue;
        
        GradeBookOO3 sampleGradebook = new GradeBookOO3();

        sampleGradebook.addGrades(45.7);
        sampleGradebook.addGrades(97.0);
        sampleGradebook.addGrades(85.0);
        sampleGradebook.addGrades(77.9);
        sampleGradebook.addGrades(65.8);
        sampleGradebook.addGrades(59.4);
        
        do
        {
            System.out.println("\n1. Print out all the grades: ");
            System.out.println("2. Show the average of the grades: ");
            System.out.println("3. Added value to the existing gradebook: ");
            System.out.println("4. Remove a value from the gradebook.");
            System.out.print("Please select the task you want to perform: ");
            response = kb.nextInt();
        }while( !(response==1 || response == 2|| response==3 || response == 4));

        if (response == 1)
        sampleGradebook.printGrades();
        else if ( response == 2)
        System.out.printf("The average grade of the students is :%,.2f",sampleGradebook.averageGrade());
        else if(response == 3)
        {
            System.out.print("Enter the value to be added: ");
            addedValue = kb.nextDouble();
            sampleGradebook.addGrades(addedValue);
        }
        else 
        {
            System.out.print("Enter a value to be removed: ");
            removedValue = kb.nextDouble();
            sampleGradebook.deleteGrade(removedValue);
        }
        kb.close();

    }
}
    

