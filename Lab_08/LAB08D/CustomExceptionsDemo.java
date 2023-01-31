import java.util.Scanner;

public class CustomExceptionsDemo 
{
    public static void main(String args[])throws InvalidAgeException,InvalidGenderException
    {
        int age;
        String gndr;
        char gender;
        Scanner kb = new Scanner(System.in);

        System.out.print("Please enter your Age: ");
        age = kb.nextInt();
        kb.nextLine();
        if((age<0) || (age>130))
        throw new InvalidAgeException(age);


        System.out.print("Please enter your Gender: ");
        gndr = kb.nextLine();
        gndr = gndr.toLowerCase();
        gender = gndr.charAt(0);
        if(!(gender=='m' || gender=='f'))
        throw new InvalidGenderException(gender);

        System.out.println("Your age is "+age);
        
        if(gender=='m')
        System.out.println("You are a male.");
        else if(gender=='f')
        System.out.println("You are a female.");
    }
    
}
