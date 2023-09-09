# Laboratory Exercises #1

[All Exercises](../README.md)

[Laboratory Exercise 02 >>](../Lab_02/readMeLab02.md)

## Objective
- Compiling and Running Simple Java Program From Windows Command Prompt(CMD) or Linux Terminal

## Preparation Tasks

- No preliminary preparation required for this laboratory session


## Activities

#### a. Procedures   [Solution File](./LAB01A/LAB1AHelloWorld.java)

- Create a folder on your preferred directory to store the work you will do in this class. The name of
the folder should have no spaces.

- Open note pad and type the following Java code


```Java
public class HelloWorld
  {
    public static void main( String[ ] args)
    {
    System.out.println(“Hello, World!”);
    }
  }
```

-  Save the file as **HelloWorld.java** in the directory which you created in the previous step.
- Open Windows CMD/Linux Terminal and change your current directory to the one which you saved the above Java code. To change the current directory to any directory you can use CD command.
- Compile the source code you wrote in Step 2 by now typing the following command below at the prompt  ``` javac HelloWorld.java ```
- and then press enter: 

- Now run your program by executing the following command at the command prompt ```java HelloWorld```
- and then press enter: 

#### b. Now change the HelloWorld code so that it prints out **Goodbye, World **. [Solution File](./LAB01B/LAB1BGoodbyeWorld.java)

> Solution Code 
  
```Java
public class HelloWorld
{
    public static void main( String[] args)
    {
        System.out.println("Goodbye, World!");
    }
    
}
```

#### c. The command ```System.out.println``` prints out its argument and then starts a new line. Change your program so it prints out **Hello, World** on one line and then prints out **Goodbye, World!** on the next line. [Solution File](./LAB01C/LAB1CHelloAndGoodbyeWorld.java)
> Solution Code 

```Java
public class HelloWorld 
{
    public static void main( String[] args)
    {
        System.out.println("Hello, World");
        System.out.println("Goodbye World!");
    }  
}
```

#### d. Add these lines to your main method and compile the code and run it. [Solution File](./LAB01D/LAB1DAddedString.java)
```Java
  String name = “Ethiopia”;
  System.out.print(“Hello,”);
  System.out.println(name);
  System.out.println(“How are you today?”);
```
> Solution Code 

```Java
public class HelloWorld 
{
    public static void main( String[] args)
    {
        System.out.println("Hello, World");
        System.out.println("Goodbye World!");

        String name = “Ethiopia”;
        System.out.print(“Hello,”);
        System.out.println(name);
        System.out.println(“How are you today?”);
    }  
}
```

#### e. Without doing any programming, what do you think the following main method prints to the screen?

```Java
public static void main(String[ ] args) {
  int x = 5;
  int y = 3;
  int z = x + x * y - y;
  System.out.println( ”The value of z is ” + z );
  int w = ++x + y + y−−;
  System.out.println( “The value of w is ” + w );
  System.out.println( “The value of x is now” + x );
  System.out.println( “The value of y is now ” + y );
  boolean a = true;
  boolean b == false;
  boolean c == (( a && ( !( x > y ))) && (aky > x));
  System.out.println( “c is ”+ c );
}
```

#### f. Create a new Java file with a class called UsingOperators and copy the above main method into it. [Solution File](./LAB01F/LAB1FUsingOperators.java)

> Solution Code 
   
```Java
public class UsingOperators
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 3;

        
        int z = x + x*y - y;
        System.out.println( "The value of z is " + z );

        int w = ++x + y + y--;
        System.out.println( "The value of w is " + w );
        System.out.println( "The value of x is now " + x );
        System.out.println( "The value of y is now " + y );
        
        boolean a = true;
        boolean c = ((a && (!(x>y)) && (a || y >x)));
        System.out.println("\n c is : " + c);

    }
}

```

#### g. Create a new Java class called TempConverter. Add a main method to TempConverter that declares and initializes a variable to store the temperature in Celsius. In the main method, compute the temperature in Fahrenheit according to the following formula and print it to the screen. [Solution File](./LAB01G/LAB1GTempConverter.java)
<center>
 Fahrenheit = 1.8×Celsius  +  32
</center>


> Solution Code 
```Java
public class TempConverter {
    public static void main(String[] args)
    {
        double tempInCelsius = 50.0;
        double tempInfahrenheit = celsiusConverter(tempInCelsius);
        System.out.println("Temprature in fahrenheit is: "+tempInfahrenheit);
    }
    public static double celsiusConverter(double celsius)
    {
        return 1.8*celsius + 32;
    }
}
```

#### h. Create a new class called **UsingControlStructures** [Solution File](./LAB01H/LAB1HUsingControlStructures.java)

- Add a main method to the class, and in the main method declare and initialize a variable to represent a person’s age.
- In the main method, write an if-else construct to print out *“You are old enough to drive”* if the person is old enough to drive and *“You are not old enough to drive”*   if the person is too young.

> Solution Code  

```Java
public class UsingControlStructures {
    public static void main(String[] args)
    {
        int age = 18;
        //change the initial values of age to values above and below 18 see it's effect on the output
        if (age >= 18)
        System.out.println("You are old enough to drive. ");
        else
        System.out.println("You are not old enough to drive");
    }
    
}
```
#### i. Write a for loop and a while loop that prints out all the odd numbers from 100 to 0 in decreasing order.  [Solution File](./LAB01I/LAB1IOddUptoHuno.java)

> Solution Code 

```Java
public class OddUptoHuno 
{
    public static void main(String[] args)
    {
      // Using for loop

        for (int i = 100 ; i > 0 ; i--)
        {
            if (i%2 != 0)
            System.out.println(i);
        }
      
      // Using while loop (remove comment to run)

        /*
        int i = 100;
        while (i > 0)
        {
          if (i%2 != 0)
            {System.out.println(i);}
          i--;
        }*/ 
    }
    
}
```

#### j. Create a new class called Gradebook [Solution File](./LAB01J/LAB1JGradeBook.java)
- Add a main method to **Gradebook**. In the main method, declare and initialize an array of doubles to store the grades of a student.
- Write a loop to print out all the grades in the array. Make sure that your printout is readable with
spaces or new lines between each grade.
- Write a new loop to find the sum of all the grades in the array.
- Divide the sum by the number of grades in the array to find the student’s average.
- Print a message to the user showing the average grade. If the average grade is 99.9, the output should be “Your average grade is 99.9”
-The program shall be versatile and shall have the capacity to work for any number of grades that the user enters.
- Your program should work if there are 4 grades in the array or 400 grades in the array. That is, you should be able to change the number of grades in the initialized array and compile, and it should run without any problems. Try it out. If it does not, figure out how to rewrite your program so that it does work.
  
- Add code to print out the letter grade the student earned based on the average grade. An average in the 90’s is an **A**, in the 80’s a **B**, the 70’s a **C**, the 60’s a **D**, and anything lower is an **F**.

> Solution Code  
```Java
public class GradeBook {
    public static void main(String[] args)
    {
        // Sample student grades
        double[] studentGrades = {89.0,12,45.7,90};
        long numberOfStudents=0;
        for(double val:studentGrades)
        {
            System.out.println(val);
            numberOfStudents++;
        }
        double sum= 0;
        for (double val:studentGrades)
            {sum += val;}
        double average = sum/numberOfStudents;
        System.out.println("The average mark is " + average);
        System.out.println("The grade from the average mark is " + markToGrade(average));
    }

    public static char markToGrade(double theGrade)
    {
      // Its optional to have code inside brackets for if,while and for 
      // statements if only a single  statement is executed inside them

        char grade = '';

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
```


#### k. Write a Java program that computes the sum and product of two matrices. The size of the matrices shall be determined by the user of the program. [Solution File](./LAB01K/LAB1KMatrixOperations.java)
> Solution Code  
```Java
import java.util.*;
public class LAB1KMatrixOperations 
{
    public static void main(String[] args)
    {
        Scanner kb2 = new Scanner(System.in);
        int userChoice = 0;
        System.out.println("******************************");
        System.out.println(" The GRAND MATRIX MULTIPLIER");
        System.out.println("****************************** \n");

        System.out.println("1 = Add two matrices");
        System.out.println("2 = Multiply two matrices");
        System.out.println("3 = Add and Multiply two matrices\n");
        System.out.print("Please select the action you want to perform: ");
        userChoice = kb2.nextInt();
        kb2.close();
        if ( userChoice == 1 )
        {
            double[][] firstMatrix = getMatrix(1);
            double[][] secondMatrix = getMatrix(2);
            if(canAddMatrices(firstMatrix, secondMatrix))
            {
                showMatrix(addMatrices(firstMatrix, secondMatrix));
            }
            else
            {
                System.out.println("You can't add the entered Matrices.");
            }
        }
        else if ( userChoice == 2 )
        {
            double[][] firstMatrix = getMatrix(1);
            double[][] secondMatrix = getMatrix(2);
            if(canMultiplyMatrices(firstMatrix, secondMatrix))
            {
                showMatrix(multiplyMatrices(firstMatrix, secondMatrix));
            }
            else
            {
                System.out.println("You can't multiply the entered Matrices.");
            }
        }
        else if ( userChoice == 3 )
        {
            double[][] firstMatrix = getMatrix(1);
            double[][] secondMatrix = getMatrix(2);
            if(canAddMatrices(firstMatrix, secondMatrix) && canMultiplyMatrices(firstMatrix, secondMatrix))
            {
                System.out.println("The summation result of the two matrices is:");
                showMatrix(addMatrices(firstMatrix, secondMatrix));
                System.out.println("The multiplication result of the two matrices is:");
                showMatrix(multiplyMatrices(firstMatrix, secondMatrix));
            }
            else if(canMultiplyMatrices(firstMatrix, secondMatrix) )
            {
                if(!canAddMatrices(firstMatrix, secondMatrix))
                    {
                        System.out.println("The multiplication result of the two matrices is:");
                        showMatrix(multiplyMatrices(firstMatrix, secondMatrix));
                        System.out.println("The given matrices can't be Added.");
                    }
                
            }
            else 
            {
                System.out.println("The given matrices can't be multiplied or added.");  
            }
            
        }
        else 
        {
            System.out.println("User entered invalid choice exiting the program");
            System.exit(0);
        }
    }

    public static boolean canAddMatrices(double[][] Matrix1, double[][] Matrix2)
    {
        boolean canAdd = true;
        int rowOfMatrixOne = Matrix1.length;
        int rowOfMatrixTwo = Matrix2.length;
        int columnOfMatrixOne = 0;
        int columnOfMatrixTwo = 1;

        if(haveEqualColumns(Matrix1))
        columnOfMatrixOne = Matrix1[0].length;
        else
        return !canAdd;

        if(haveEqualColumns(Matrix2))
        columnOfMatrixTwo = Matrix2[0].length;
        else
        return !canAdd;

        if ((rowOfMatrixOne == rowOfMatrixTwo) && (columnOfMatrixOne == columnOfMatrixTwo))
        return canAdd;
        else
        return !canAdd;
        
    }


    public static boolean haveEqualColumns(double[][] Matrix)
    {
        boolean isequal = true;
        int rowOfMatrix = Matrix.length;
        int columnCounter = 0;
        int previousColumn = Matrix[0].length;
        for (int row = 0 ; row < rowOfMatrix;row++)
        {
            for (double val:Matrix[row])
            columnCounter++;
            if (columnCounter == previousColumn)
            previousColumn = columnCounter;
            else 
            return !isequal;
            columnCounter = 0;

        }return isequal;
    }
    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2)
    {
        int rowNumber = matrix1.length;
        int columnNumber = matrix1[0].length;
        double[][] newMatrix =  new double[rowNumber][columnNumber];
        for(int row = 0 ; row < rowNumber ; row++)
        {
            for (int column = 0 ; column < columnNumber ; column++)
            {
                newMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        } return newMatrix;
    }

    public static boolean canMultiplyMatrices(double[][] matrix1, double[][] matrix2)
    {
        boolean canMultilpy = true;
        int rowOfMatrixTwo = 0;
        int columnOfMatrixOne = 1;
        if (haveEqualColumns(matrix2) && haveEqualColumns(matrix1))
        {
            rowOfMatrixTwo = matrix2.length;
            columnOfMatrixOne = matrix1[0].length;
        }
        else
        return !canMultilpy;

        if(rowOfMatrixTwo == columnOfMatrixOne)
        return canMultilpy;
        else
        return !canMultilpy;
    }

    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2)
    {
        int rowOfMatrixOne = matrix1.length;
        int rowOfMatrixTwo = matrix2.length;
        int columnOfMatrixTwo = matrix2[0].length;
        
        double eachValue = 0;
        double[][] newMatrix =  new double[rowOfMatrixOne][columnOfMatrixTwo];
        for (int row = 0 ; row < rowOfMatrixOne ;  row++)
        {
            for (int column = 0 ; column < columnOfMatrixTwo; column++)
            {
                for( int k = 0 ; k < rowOfMatrixTwo; k++)
                {
                    eachValue += matrix1[row][k]*matrix2[k][column];
                }
                newMatrix[row][column] = eachValue;
                eachValue = 0;
            }
        }return newMatrix;
    }

    public static void showMatrix(double[][] theMatrix)
    {
        int row = theMatrix.length;
        int column = theMatrix[0].length;
        for(int i = 0 ; i < row;i++)
        {
            System.out.print("[ ");
            for (int j = 0; j < column ; j++)
            {
                System.out.print(theMatrix[i][j]+"  ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    public static double[][] getMatrix(int matrixNumber)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("\nPlease enter the number of rows of the matrix "+ matrixNumber+" : ");
        int rows = kb.nextInt();
        System.out.print("Please enter the number of columns of the matrix "+ matrixNumber+" : ");
        int columns = kb.nextInt();
        double[][] newMatrix  = new double[rows][columns];
        for (int i = 1 ; i < rows+1 ;i++)
        {
            for ( int j = 1 ; j < columns+1 ; j++)
            {
                System.out.println("\nPlease enter values of matrix " + matrixNumber);
                System.out.print("at row " + i + " and column " + j +" : ");
                newMatrix[i-1][j-1] = kb.nextDouble();
                System.out.println();
            }
        }
        kb.close();
        return newMatrix;
    }
}

```

#### l. Write a Java program that prints all prime numbers which are less than any number n. The number n shall be determined by the user.[Solution File](./LAB01L/LAB1LPrimeFinder.java)
> Solution Code  
```Java
import java.util.*;
public class LAB1LPrimeFinder 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int theNumber = kb.nextInt();
        ShowAllPrimesBelow(theNumber);
        kb.close();
    }
    public static boolean isPrime(int theNumber)
    {
        if (theNumber == 1)
        return false;
        else 
        {
            int divisors = 0;
            for(int numberBelow = theNumber - 1; numberBelow >= 2 ; numberBelow--)
            {
                if (theNumber%numberBelow == 0)
                divisors++;
            }

            if (divisors == 0)
            return true;
            else 
            return false;
        }   
    }
    public static void ShowAllPrimesBelow(int theNumber)
    {
        System.out.println("\nAll the prime numbers below "+ theNumber+" are :\n");
        for (int numberBelow = theNumber ; numberBelow > 0 ; numberBelow--)
        {
            if(isPrime(numberBelow))
            System.out.println(numberBelow);
        }
    }
}
```

<center>

### Feel free to report any typos on [dododoyo](https://github.com/dododoyo)

### HAPPY CODING  
# 🧑‍💻 👨‍💻

### Made With 🖤 By  [🐬](https://github.com/dododoyo)
</center>
