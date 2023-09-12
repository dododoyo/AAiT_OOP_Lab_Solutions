# Laboratory Exercises #8

[All Exercises](../README.md)

[<< Laboratory Exercise 07](../Lab_07/readMeLab07.md) | [Laboratory Exercise 09 >>](../Lab_09/readMeLab09.md)

## Objective
- Familiarizing about the concept of exception handling using Java programming language.

## Preparation Tasks
- Understanding/Revising the concepts of exception handling which is dealt in the lecture class.

## Activities

#### a. Create a Java program prints the contents of an initialized array to the console screen using for loop. The program shall handle the exception if the iteration moves beyond the array size. The exception shall be handled using try catch blocks.


[Solution file for first Instruction](./LAB08A/printArray.java)
> Solution Code
```Java
public class printArray
{
    public static void main(String[] args)
    {
        int[] theIntArray = {1,2,3,4,5,6,7,8,9};

        // let's specify the condition of the for loop to be true
        try
        {
            for (int i = 0 ; true ;i++)
            {
                System.out.println("The element number "+ (i+1)+" is " +theIntArray[i]);

            }

        }

        catch(IndexOutOfBoundsException ioe)
        {
            System.out.println("\nThat would be all.");
            System.out.println("Looks like we reached the end of the array.");
        }
        
    }
}
```

#### b. Create a Java program that prints the contents of an initialized array to the console screen using for loop. The program shall handle the exception if the iteration moves beyond the array size. The exception shall be handled using throw statements.

[Solution file for second Instruction](./LAB08B/printArray2.java)
> Solution Code
```Java
public class printArray2
{
    public static void main(String[] args)throws IndexOutOfBoundsException
    {
        int[] theIntArray = {1,2,3,4,5,6,7,8,9};

        // let's specify the condition of the for loop to be true
        try
        {
            for (int i = 0 ; true ;i++)
            {
                // printing custom exception
                if(i > (theIntArray.length -1))
                throw new IndexOutOfBoundsException("\nThat would be all\nLooks like we reached the end of the array.");

                //if not
                System.out.println("The element number "+ (i+1)+" is " +theIntArray[i]);
            }

        }

        catch(IndexOutOfBoundsException ioe)
        {
            System.out.println("\nThat would be all.");
            System.out.println("Looks like we reached the end of the array.");
        }
    }
}
```

#### c. Take array of string from the user and convert to the corresponding array of integers and calculates the average. While implementing your code you are expected to catch related exceptions which include: ArrayIndexOutOfBounds, IllegalArgumentException, ArithemeticException and finally include Exception block to handle the general exception. In addition, at the end, try to include finally block and implement anything you need with the program.

[Solution file for third Instruction](./LAB08C/printArray3.java)
> Solution Code
```Java
import java.util.*;

class printArray3
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        String stringNum = "";
        int arrayLength;
        double averageN = 0;

        
        System.out.print("Please enter the number of elements in the array: ");
        arrayLength = kb.nextInt();
        kb.nextLine();

        int[] arr = new int[arrayLength];
        

        try
        {
            averageN = average(arr);
            //used to check if divided by zero 
            //before entering the loop to throw exception
            for(int i = 0 ; i <= arrayLength ; i++)
            {
                //Testing if index is still valid
                arr[i] = 0;
                System.out.print("Please enter data for element "+(i+1)+" :");
                stringNum = kb.nextLine();
                arr[i] = Integer.parseInt(stringNum);
                
            }
    
            averageN = average(arr);
        }
        catch(IllegalArgumentException iae)
        {
            System.out.println("\nIllegal argument detected, enter only integers.");
        }

        catch(ArithmeticException ae)
        {
            System.out.println("\nA math error occured. may be division by '0'.");
        }

        catch(ArrayIndexOutOfBoundsException aeio)
        {
            System.out.println("\nMaximum size of array was reached");
            System.out.println("The average value of the elements is: " + averageN);
        }
        
        catch(Exception e)
        {
            System.out.println("\nUnknown exception occured.");
        }
        finally
        {
            System.out.println("\nThank you for using my program.");
        }

    }
    
    public static int average(int[] a) 
    {
        int total = 0;
        for(int i = 0; i < a.length; i++) 
        {
           total += a[i];
        }
        return total / a.length;
    }
        
}
```

#### d. Create and test your own custom exception named InvalidAgeValueException and InvalidGenderValueException based on the following rule. The first exception is thrown if the person inters the age of a person which is either less than 0 or greater than 130 and the second exception is thrown if the person inters the character value other than ’M’ or ’F’ for gender filed of your console program.

> For this question you are expected to build a complete try. . .catch. . .finally block.

[Solution file for InvalidAgeValueException](./LAB08D/InvalidAgeException.java)
> Solution Code
```Java
public class InvalidAgeException extends Exception
{
    public InvalidAgeException(){};

    public InvalidAgeException(int ageValue){super("Can't have ages below '0' or above '130'.");}
}
```

[Solution file for InvalidGenderValueException](./LAB08D/InvalidGenderException.java)
> Solution Code
```Java
public class InvalidGenderException extends Exception
{
    public InvalidGenderException(){}
    
    public InvalidGenderException(char theGenderChar){super(theGenderChar+" is not a valid gender character.");}
}
```
[Solution file for Testing custom Exceptions](./LAB08D/CustomExceptionsDemo.java)
> Solution Code
```Java
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
```

---

<center>

### Feel free to report any typos or bugs on [dododoyo](https://github.com/dododoyo)

<img alt='Happy-Coding' src="https://readme-typing-svg.herokuapp.com?font=Architects+Daughter&amp;color=red&amp;size=20&amp;lines=Happy+Coding+!+🧑‍💻+ 👨‍💻" style="width: 100%;margin-left:25%"></img>

## Made With 🖤 By  [🐬](https://github.com/dododoyo)

</center>

---