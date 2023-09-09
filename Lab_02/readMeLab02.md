# Laboratory Exercises #2

[<< Laboratory Exercise 01](../Lab_01/readMeLab01.md) | [Laboratory Exercise 03 >>](../Lab_03/readMeLab03.md)

## Objective

-  Enabling students to develop modularize code using Java methods.
-  Introducing method overloading(Compile time polymorphism).

## Preparation Tasks

-  No preliminary preparation required for this laboratory session

## Activities

#### a. Grade Book program: Continued from the previous lab. [Solution Files](./LAB02A)

-  Add a method to **Gradebook** called printGrades that accepts an array of doubles as an argument and prints out all the grades in the array. Replace the loop in the main method that prints out all the grades with printGrades method.
-  Add a method to **Gradebook** called averageGrade that takes an array of doubles as an argument and returns the average grade. Replace the loop and calculations in the main method that determines the average grade with a call to the averageGrade method. Your main method should still print out the user’s average grade and the letter grade the user earned.
-  Change the main method of **Gradebook** so that it converts its String arguments into doubles and
  initializes the grades in the array to those numbers. Use the method Double.parseDouble to convert a String containing a double to an actual double. Compile and run and provide arguments at the command line like this:

> ```java Gradebook 82.4 72.5 90 96.8 86.1```

[Solution File for first challenge](./LAB02A/LAB02A_GradeBookOOP.java)

> Solution Code
```Java
import java.util.*;

public class GradeBook
{
    public static void main(String[] args)
    {
        double[] theGrades = new double[args.length];

        for(int i = 0 ; i < args.length ; i++)
        {
            theGrades[i] = Double.parseDouble(args[i]);
        }

        printGrades(theGrades);
        
        averageGrade(theGrades);
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
}
```

-  Try to modify your code so that instead of just taking the array of grades from the main method, the program asks the user to enter the grades.

-  Change the main method so that after asking the user to enter the grades, it prints out a menu of two options for them.

  > 1: Print out all the grades

  > 2: Find the average grade

-  It should ask the user to enter the number of his choice and do what the user chooses. (Note: This feature is required to be implemented using switch statements)

[Solution File for second challenge](./LAB02A/LAB02A_GradeBookModified.java)

> Solution Code

```Java
import java.util.*;

// Modified GradeBook
public class GradeBook
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
```


#### b. Create a class called MethodsOverloading and create the following methods inside the class: [Solution File](./LAB02B/LAB02B_MethodsOverloading.java)

- calcArea :   return type > **double** parameters: **double** [to calculate the area of circle]
- calcArea :   return type > **double** parameters: **(double, double)** [to calculate the area of rectangle]
- calcArea : return type > **double** parameters:  **(double, double)** [to calculate the area of trapezium]
- calcArea : return type > **double** > parameters: **(int ,int)** to [to calculate the area of a triangle ]
- Finally include a main method to your class and test all the methods that you created before by passing appropriate data as an argument.

> Solution Code
```Java
public class MethodsOverloading
{
    public static double calcArea(double radius)
    {
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }

    public static double calcArea(double height,double width)
    {
        double Area = height*width;
        return Area;
    }

    public static double calcArea(int base, int height)
    {
        double Area = 0.5*base*height;
        return Area;
    }
    
    public static void main(String[] args)
    {
        System.out.println(calcArea(5.5));
        System.out.println(calcArea(2.0,4.0));
        System.out.println(calcArea(2,3));
    }
}
```

#### c. Write a Java program that that calculates the value of ex from its Taylor series expansion as shown below: [Solution File](./LAB02C/LAB02C_TaylorExp.java)

> e^x = 1/0! + x/1! + x^2/2! + x^3/3! + x^4/4! ... + 
- The program shall be organized using methods and the size of the series and the value of x shall be
determined by the user. In addition, the program shall have a method to check the accuracy of the result for
a certain size of a series selected by the user given that the value of e=2.71828182846

> Solution Code

```Java
import java.util.*;
public class TaylorExp
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("This program calculates the value of 'e^x' using taylor series");
        System.out.print("Please enter the size of the series: ");
        int size = kb.nextInt();
        System.out.print("Please enter the value of x: "); 
        double x = kb.nextDouble();    
        showResults(x, size); 
        kb.close();  
    }
    public static long factorial(int x)
    {
        long num = 1;
        for (int i = 1 ; i<= x ; i++)
        {
            num*= i;
        }
        return num;
    }
    public static double accuracyOf(double num)
    {
        final double e = 2.71828182846;
        double accuracy = e - num;
        double percent = (1-accuracy)*100;
        return percent;
    }
    public static double expE(int elements, double value)
    {
        double e = 0;
        for (int i = 0 ; i < elements ; i++)
        {
            e += (Math.pow(value, i))/factorial(i);
        }
        return e;
    }
    public static void showResults(double x,int elements)
    {
        double value = expE(elements, x);
        double accur = accuracyOf(value);
        System.out.println("The value of e^x for given x is: "+value);
        System.out.println("With an accuracy of: " + accur+"percent");
    }
}
```


#### d. Write a Java method called sortArray which is intended to perform sorting of a given array. The size of the array and the elements of the array shall be determined by the user of the program. Taking of the appropriate data from the user shall be implemented using a method named **readArray** that take an array of double and integer as argument. [Solution File](./LAB02D/LAB02D_SortArray.java)

> Solution Code

```Java
import java.util.*;
public class LAB02D_SortArray 
{
    public static void main(String[] args)
    {
        double[] arr = readArray();
        sortArray(arr);
        showArray(arr);
    }
    public static double[] readArray()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = kb.nextInt();
        double[] theArray = new double[size];
        for( int i = 0 ; i < size; i++)
        {
            System.out.print("Please enter value of array at index "+(i+1)+" :");
            theArray[i] = kb.nextDouble();
        }
        kb.close();
        return theArray;

    }
    public static void sortArray(double[] arr)
    {
      // This method will sort a given array using Selection sort algorithm
        for( int i = 0 ; i < arr.length-1 ;i++)
        {
            int minIndex = getMinIndex(arr, i);
            if(minIndex!= i)
            {
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            }
        }

        // Instead of writing your own code you can use the built-in Arrays.sort() method 
        // uncomment the code bellow to use the built in method
        
        /*
        Arrays.sort(arr);
        */
    }
    public static int getMinIndex(double[] theArray, int startPosition)
    {
        double min = theArray[startPosition];
        int minIndex = startPosition;
        for( int i = startPosition+1 ; i < theArray.length ; i++)
        {
            if ( theArray[i] < min)
            {
                min = theArray[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void showArray(double[] theArray)
    {
        for(double val: theArray)
        System.out.print(val+" ");
        System.out.println();
    }
}

```

#### e. Write a Java program that calculates the Fibonacci series up to a given number n which is determined by the user. The program shall be implemented using recursive and non-recursive Java methods. [Solution File](./LAB02E/LAB02E_FibonacciSeries.java)

> Solution Code 

```Java
import java.util.*;

public class LAB02E_FibonacciSeries 
{
    public static void main(String[] args)
    {
        showFibonacciOf(userInput());
    }

    //This is a non recursive method
    public static void showFibonacciOf(int lastElement)
    {
        int n = 0 ; 
        int nplus1 = 1;
        // Initial values of the fibonacci series
        
        int temp; // Temporary variable to store value of nplus1 while copying

        for(int i = 0 ; i < lastElement+1;i++)
        {
            System.out.print(n+" + ");
            temp = nplus1;     // store the value of nplus1 in a variable
            // according to rules of the fibonacci series the current element is the sum of the previous two elements
            nplus1 = n + nplus1; // make the new nplus1 to summation of the two previous numbers
            n = temp;      // store old value of nplus1 into n
        }  
        System.out.println(". . .");      
    }

    public static int userInput()
    {
        int last;
        do
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Please enter the number of elements of the Fibonacci Series ");
            System.out.print("You would like to see: ");
            last = kb.nextInt();
        }while(last <1);
        return last;
    }
}
```

#### f. ROCK, PAPER AND SCISSORS GAME. [Solution File](./LAB02F/LAB02F_RPSGame.java)
- Write a program that lets the user play the game of Rock, Paper, Scissors, against the computer. The program should work as follows. 
- When the program begins, a random number in the range of 1 through 3 is generated. If the number is 1, then the computer has chosen rock. If the number is 2, then the computer has chosen paper. If the number is 3, then the computer has chosen scissors. (Don’t display the computer’s choice yet.)
  
- The user enters his or her choice of “rock”, “paper”, or “scissors” at the keyboard. (You can use a
menu if you prefer.)
- The computer’s choice is displayed.
A winner is selected according to the following rules:
- If one player chooses rock and the other player chooses scissors, then rock wins, (The rock smashes
the scissors.)
- If one player chooses scissors and the other player chooses paper, then scissors wins (Scissors cuts
paper.)
- If one player chooses paper and the other player chooses rock, then paper wins. (Paper wraps rock.)
- If both players make the same choice, the game must be played again to determine the winner.
Be sure to divide the program into methods that perform each major task.

> Solution Code 

```Java
import java.util.*;

public class RPSGame 
{
    public static void main(String[] args)
    {
            int compChoice = computerChoice();
            int userChoice = userChoice();
            System.out.println();
            showComputerChoice(compChoice);
            showWinner(userChoice, compChoice);
    }
    public static int computerChoice()
    {
        int computerChoice = (int)(Math.random()*2);
        return computerChoice;
    }

    public static int userChoice()
    {
        Scanner kb = new Scanner(System.in);
        String userChoice;
        do
        {
            System.out.println("Your choices are:");
            System.out.println("Rock");
            System.out.println("Paper");
            System.out.println("Scissor");
            System.out.print("Please enter your choice here: ");
            userChoice = kb.nextLine();
        }while(!isCorrectInput(userChoice));
        kb.close();
        return intValueOf(userChoice);
    }
    public static int intValueOf(String playerChoice)
    {
        int value;

        if(playerChoice.equalsIgnoreCase("rock"))
        value = 0;
        else if(playerChoice.equalsIgnoreCase("paper"))
        value = 1;
        else 
        value = 2;

        return value;  
    }

    public static String stringValueOf(int theNumber)
    {
        String value;
        if(theNumber == 0)
        value = "rock";
        else if(theNumber == 1)
        value = "paper";
        else 
        value = "scissor";

        return value;
    }
    public static boolean isCorrectInput(String choice)
    {
        if(choice.equalsIgnoreCase("rock")||choice.equalsIgnoreCase("paper")||choice.equalsIgnoreCase("scissor"))
        return true;
        else 
        return false;
    }
    public static void showWinner(int playerChoice, int computerChoice)
    {
        final String loseMessage = "You Lost !";
        final String winMessage = "You Won !";
        if (playerChoice==0 && computerChoice==1)
        {
            System.out.println("Paper wraps rock");
            System.out.println(loseMessage);
        }
        else if (playerChoice==0 && computerChoice==2)
        {
            System.out.println("Rock destroys Scissor");
            System.out.println(winMessage);
        }
        else if (playerChoice==1 && computerChoice==0)
        {
            System.out.println("Paper wraps Rock");
            System.out.println(winMessage);
        }
        else if (playerChoice==2 && computerChoice==0)
        {
            System.out.println("Rock destroys Scissor");
            System.out.println(loseMessage);
        }
        else if (playerChoice==1 && computerChoice==2)
        {
            System.out.println("Scissor cuts Paper");
            System.out.println(loseMessage);
        }
        else if (playerChoice==2 && computerChoice==1)
        {
            System.out.println("Scissor cuts Paper");
            System.out.println(winMessage);
        }
        else 
        {
            System.out.println("The game was a draw");
            System.out.println("Nobody won.");
        }

    }
    public static void showComputerChoice(int compChoice)
    {
        if(compChoice == 0)
        System.out.println("The computer's choice was ROCK.");
        else if(compChoice == 1)
        System.out.println("The computer's choice was PAPER.");
        else 
        System.out.println("The computer's choice was SCISSOR.");
    }
}
```

#### g. ESP GAME [Solution File](./LAB02G/LAB02G_ESPGame.java)

- Write a program that tests your ESP (extrasensory- perception!) The program should randomly select the name of a color from the following list of words:
> Red, Green, Blue, Orange, Yellow
- To select a word, the program can generate a random number. For example, if the number is 0, the selected word is Red; if the number is l the selected word is Green; and so forth. Next, the program should ask the user to enter the color that the computer has selected. After the user has entered his or her guess, the program should display the name of the randomly selected color. The program should repeat this 10 times and then display the number of times the user correctly guessed the selected color.
- **Be sure to modularize the program into methods that perform each major task.**

> Solution Code 
```Java
import java.util.*;

public class ESPGame 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the ESP Game!");
        System.out.println("You will be asked to guess the color that the computer has chosen.");
        System.out.println("You will be asked to guess 5 times.");
        System.out.println("For each correct guess, you will be awarded 1 point.");
        System.out.println("Let's begin!");

        
        int compNumber,userNumber,correctGuesses=0;
        String compColor;
        for(int i = 0 ; i < 5 ;i++)
        {
            compNumber = computerChoice ();
            userNumber = userChoice();
            compColor = numberToColor(compNumber);
            System.out.println("\nComputer's choice was "+compColor);
            correctGuesses += correctCounter(compNumber, userNumber);
        }
        System.out.println("\nThe number of correct guesses is: " +correctGuesses);
    }
    public static int computerChoice()
    {
        int compNum = (int)(Math.random()*5);
        return compNum;
    }
    public static int colorToNumber(String userColor)
    {
        userColor = userColor.toLowerCase();
        int userNum ;
        if(userColor.equals("red"))
        userNum = 0;
        else if(userColor.equals("green"))
        userNum = 1;
        else if(userColor.equals("blue"))
        userNum = 2;
        else if(userColor.equals("orange"))
        userNum = 3;
        else 
        userNum = 4;

        return userNum;
    }
    public static int userChoice()
    {
        String choice;
        Scanner kb = new Scanner(System.in);
        do
        {
            System.out.println("\nHere are the list of colors available.");
            System.out.println("Red, Green, Blue, Orange, Yellow.");
            System.out.print("Please enter your choice here: ");
            choice = kb.nextLine();
        }while(!validEntry(choice));

        return colorToNumber(choice);
    }
    public static boolean validEntry(String userChoice)
    {
        userChoice = userChoice.toLowerCase();

        if(userChoice.equals("red")||userChoice.equals("green")||userChoice.equals("blue")||userChoice.equals("orange")||userChoice.equals("yellow"))
        return true;
        else
        return false;
    }
    public static String numberToColor(int theNumber)
    {
        String choice;
        if (theNumber == 0)
        choice = "Red";
        else if(theNumber == 1)
        choice = "Green";
        else if(theNumber == 2)
        choice = "Blue";
        else if (theNumber == 3)
        choice = "Orange";
        else 
        choice = "Yellow";
        return choice;
    }
    public static int correctCounter(int compChoice, int userChoice)
    {
        int correct ;
        if(compChoice == userChoice)
        correct = 1;
        else 
        correct = 0;

        return correct;
    }
}
```
<center>

### Feel free to report any typos on [dododoyo](https://github.com/dododoyo)

### HAPPY CODING  
# 🧑‍💻 👨‍💻

### Made With 🖤 By  [🐬](https://github.com/dododoyo)

</center>
