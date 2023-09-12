# Laboratory Exercises #3

[All Exercises](../README.md)

[<< Laboratory Exercise 02](../Lab_02/readMeLab02.md) | [Laboratory Exercise 04 >>](../Lab_04/readMeLab04.md)

## Objective

-  Enabling students to develop modularize code using Java methods.
-  Introducing method overloading(Compile time polymorphism).

## Preparation Tasks

-  No preliminary preparation required for this laboratory session

## Activities

#### a. Grade Book Program: Continued from the Previous laboratory exercises (OOP implementation) [Solution Files](./LAB03A)
- Create a new class called GradebookOO. The class should have a single field which is an array of doubles called grades. This class will have no main method. Compile. Why can’t you run this class?

> You won't be able to run (execute) the code because in Java, the `main` method is the entry point of a program. When you run a Java program, the Java Virtual Machine (JVM) looks for the `main` method in the specified class and executes it. If a Java file does not have a `main` method, the JVM does not know where to start executing the program and will throw an error.
>However, it is still possible to compile a Java class without a `main` method and use it in another Java program that does have a `main` method. For example, you could create a separate Java file with a `main` method that creates an instance of the class and calls its methods. This way, the class can be used as a component in a larger program.
```Java
class GradeBookOO
{
    // Compiling this code will work just fine i.e(javac GradeBookOO);

    // But executing it i.e(java GradeBookOO) will show the following error in the terminal(cmd)
    
        /*"Error: Main method not found in class GradeBookOO1, please define the main method as:
        public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application" */
    private double[] grade;   

    // the main goal of this question to check your understanding of the difference between compiling and executing java code 
}
```
- Write two constructors for GradebookOO. The first should take no arguments and initialize the grades field to an array of size zero. The second should take an argument that is an array of doubles and assign that array to the field. Compile.
```Java
class GradeBookOO
{
    // Compiling this code will work just fine i.e(javac GradeBookOO);

    // But executing it i.e(java GradeBookOO) will show the following error in the terminal(cmd)
    
        /*"Error: Main method not found in class GradeBookOO1, please define the main method as:
        public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application" */
    private double[] grade;

    public   GradeBookOO()
    {
        grade = new double[0];
    }
    public  GradeBookOO(double[] theInput)
    {
        grade = theInput;
    }
}
```
- Add a method to GradebookOO named printGrades that takes no arguments and prints out all the grades in the grades field. Compile.
- Add a method to GradebookOO named averageGrade that takes no arguments and returns the average grade in the grades field. Compile.

[Solution for the first Instruction](./LAB03A/GradeBookOO1.java)
```Java
class GradeBookOO
{
    // Compiling this code will work just fine i.e(javac GradeBookOO);

    // But executing it i.e(java GradeBookOO) will show the following error in the terminal(cmd)
    
        /*"Error: Main method not found in class GradeBookOO1, please define the main method as:
        public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application" */
    private double[] grade;

    public   GradeBookOO()
    {
        grade = new double[0];
    }
    public  GradeBookOO(double[] theInput)
    {
        grade = theInput;
    }

    public void printGrades()
    {
        for(double val : grade)
        System.out.println(val);
    }
    
    public double averageGrade()
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
- Create a new class called GBProgram. Add a main method to GBProgram which instantiates a Gradebook with an array of grades, prints out all the grades with a call to the printGrades method, and finds the average grade with the averageGrade method. Compile and run. 
- Print out a menu to the user, as described in the previous lab session that allows the user to select whether they would like to print out all the grades or find the average grade.

[Solution for the second Instruction](./LAB03A/GBProgram1.java)

```Java
import java.util.*;

// class name in the file and in code aren't the same 
class GBProgram
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        int response;
        double[] sampleGrades = {45.0,59.0,68.9,87.5,79.8};
        GradeBookOO sampleGradebook = new GradeBookOO(sampleGrades);
        
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
```
#### b. Grade Book Program: Continued from the Previous laboratory exercises (OOP implementation) . . . [Final Solution Files](./LAB03B)
- Add appropriate access modifiers to all your fields and methods in **GradebookOO** and **GBProgram**. then compile.

> Solution Code of GradeBookOO
```Java
class GradeBookOO
{
    //GradeBookOO  with access modifiers
    private double[] grade;

    public   GradeBookOO2(int arrayLength)
    {
        grade = new double[arrayLength];
    }

    public void printGrades()
    {
        for(double val : grade)
        System.out.println(val);
    }
    
    public double averageGrade()
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
> Solution Code of GBProgram
```Java
import java.util.*;
class GBProgram
{
    //GBProgram with access modifiers
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        private int response;
        private double[] sampleGrades = {45.0,59.0,68.9,87.5,79.8};
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
        System.out.println();
    }
}
```
-  Add a method to **GradebookOO** called *addGrade* which accepts a *double* argument and adds it to the array of grades.
- Delete the **GradebookOO** constructor that takes an array of doubles as an argument. And change the main method of GBProgram so that it instantiates an empty GradebookOO and adds the grades one-by-one to it with the *addGrade* method.
- Add a method *deleteGrade* to **GradebookOO** which accepts a grade as an argument and removes it from the array if it is there.
  
> Solution Code of GradeBookOO [Solution File](./LAB03B/GBProgram2.java)
```Java
class GradeBookOO
{
    private double[] grade;

    public GradeBookOO2(int arrayLength)
    {
        grade = new double[arrayLength];
    }

    public void addGrades(double valueAdded, int indexToBeAdded)
    {
        try
        {
            grade[indexToBeAdded] = valueAdded;
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Invalid index value.");
            System.out.println("Please restart the program, and try again.");
            System.exit(0);
        }
    }

    public void deleteGrade(double gradeToDelete)
    {
        int indexToDelete = -1;

        for (int i = 0; i < grade.length; i++) {
            if (grade[i] == gradeToDelete) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete == -1) {
            System.out.println("Grade not found.");
            return;
        }
        double[] newGrade = new double[grade.length - 1];
        for (int i = 0, j = 0; i < grade.length; i++) {
            if (i != indexToDelete) {
                newGrade[j++] = grade[i];
            }
        }
        grade = newGrade;
    }

    public void printGrades()
    {
        for(double val : grade)
        System.out.println(val);
    }

    public double averageGrade()
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
> Solution Code of GBProgram  [Solution File](./LAB03B/GBProgram2.java)
```Java
import java.util.*;
class GBProgram
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
        System.out.println();
    }
}
```

#### c. Grade Book Program: Continued from the Previous laboratory exercises (OOP implementation) . . . [Solution Files](./LAB03C)

- Change the field in the GradebookOO program from an array to an ArrayList.
- Rewrite all the methods to use the ArrayList instead of the array. Make sure you use an Iterator for all the iterations through the ArrayList.

Do you have to make any changes to GBProgram so that it will compile and run successfully? Why or
why not?

> Solution Code  :  [Solution File for first question](./LAB03C/GradeBookOO3.java)

```Java
import java.util.ArrayList;
class GradeBookOO3 
{
    private ArrayList<Double>  grade;

    public   GradeBookOO3()
    {
        grade = new ArrayList<>();
    }

    public  GradeBookOO3(ArrayList<Double> theInput)
    {
        grade = theInput;
    }

    public void addGrades(double theValue)
    {
        grade.add(theValue);
        System.out.println(theValue + " was added sucessfully.");
    }
    
    
    public void deleteGrade(double theGrade)
    {
        if(grade.contains(theGrade))
        {
            System.out.println(theGrade + " was removed sucessfully.");
        }
        else
        System.out.println("The specified grade doesn't exist.");
    }

    public void printGrades()
    {
        for(double val : grade)
        System.out.println(val);
    }
    
    public double averageGrade()
    {
        double sum = 0;
        int numberOFStudents = grade.size();

        for(double val: grade)
        {
            sum += val;
        }
        return sum/numberOFStudents;
    }
}
```
> *Changes to the GBProgram is not necessary but optional if we want to access the new methods.*

<br>

> Solution Code : [Solution File](/Lab_03/LAB03C/GBProgram3.java)

```Java
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
```

#### d. Develop a Java class called Point based on the following details. [Solution Files](./LAB03D)

- The class shall have two public fields [which are declared as a double and has a final modifier]
- One public field as double data type and static and final modifier [to hold the mathematical value of
pi]
- One default constructor which initializes the two fields of the class
- One parametrized constructor that initializes the two fields of the class
- The class shall comprise a methods to access the fields of the class;
- The class should also comprise a method that takes Point object as an argument and returns the
distance between the original point and the point object which passed as an argument to the point.
- It also comprise a method that calculates the volume of sphere that is generated by revolving an
object P to the origin.
> Solution Code  : [Solution File](./LAB03D/PointTest.java)

```Java
class Point 
{
    public double x;
    public double y;
    public static final double Pi = Math.PI;

    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point(double xValue, double yValue)
    {
        x = xValue;
        y = yValue;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double distanceWith(Point thePoint)
    {
        double distance = Math.pow(Math.pow(thePoint.getX()-this.x,2)+Math.pow(thePoint.getY()-this.y,2),0.5);
        return distance;
    }
}
```
- Finally create another class called PointTest that comprise a main method which is intended to
instantiate the class point and test the result by passing the appropriate argument to the methods and
constructors of the class.

> Solution Code : [Solution File](./LAB03D/PointTest.java)

```Java
public class PointTest 
{
    public static void main(String[] args)
    {
        Point p1 = new Point(); //Intialized with the values of zero.
        Point p2 = new Point(4,6);// Initialized with the Xvalue of 4 and Yvalue of 6

        System.out.println("The 'x' value of point 1 is: "+p1.getX());
        System.out.println("The 'y' value of point 1 is: "+p1.getY());

        System.out.println("\nThe 'x' value of point 2 is: "+p2.getX());
        System.out.println("The 'y' value of point 2 is: "+p2.getY());

        System.out.printf("\nThe distance between the two points is: %,.3f", p1.distanceWith(p2));
    }
}
```

#### e. Design a Java class called complexNumberOperation which is intended to perform all operations of complex number. The class shall have the following features:

- Two private attributes: realPart and imaginaryPart both as a double data type
- One public attribute: objectCreationCount which is static and int data type
- Two constructors: The one with two parameters as a double and the other with no parameters.
- The class shall also comprise the following methods(As per they are are shown in the following table:
  
<center>

| Function | <center> Parameters </center> | <center>Return Type</center>
| ----------- | ----------- | ----------- |
| addComplex | Two complexNumberOperation object | Complex number object |
| subComplex | Two complexNumberOperation object | Complex number object |
| mulComplex | Two complexNumberOperation object | Complex number object |
| divComplex | Two complexNumberOperation object | Complex number object |
| modComplex | One complexNumberOperation object | double |
| setReal |double | void |
| getReal |- | double |
| setComplex |double | void |
| getComplex | - | double |
||

</center>

- All the constructors and methods shall be implemented well to perform the intended functionality. In addition the third public attributes are used to count how many objects of (instances) are created form the class.
- All the constructors and methods shall be implemented well to perform the intended functionality. In addition the third public attribute is used to count how many objects of (instances of) complexNumberOperation are created. 
- After completing the implementation of the class create another class called complexNumberOperationTest in your current package and write a Java code to define a main method inside the class. - - Then implement all necessary functionality to test you previous class.

[Solution File for first instruction](./LAB03E/ComplexNumber.java)
> Solution Code 

```Java
public class ComplexNumber 
{
    private double real;
    private double imaginary;
    public static int objectCount = 0;

    public ComplexNumber()
    {
        real = 0;
        imaginary = 0;
        objectCount++;
    }

    public ComplexNumber(double realPart, double imaginaryPart)
    {
        real = realPart;
        imaginary = imaginaryPart;
        objectCount++;
    }

    public void setReal(double realValue)
    {
        real = realValue;
    }

    public void setImaginary(double imaginaryValue)
    {
        imaginary = imaginaryValue;
    }

    public double getReal()
    {
        return real;
    }

    public double getImaginary()
    {
        return imaginary;
    }
    
    public ComplexNumber addComplex(ComplexNumber complex1, ComplexNumber complex2)
    {
        double realSum = complex1.getReal() + complex2.getReal();
        double imaginarySum = complex1.getImaginary() + complex2.getImaginary();

        return new ComplexNumber(realSum,imaginarySum);
    }

    public ComplexNumber subComplex(ComplexNumber complex1, ComplexNumber complex2)
    {
        double realSub = complex1.getReal()-complex2.getReal();
        double imaginarySub = complex1.getImaginary() - complex2.getImaginary();

        return  new ComplexNumber(realSub,imaginarySub);
    }

    public ComplexNumber mulComplex(ComplexNumber complex1, ComplexNumber complex2)
    {
        // Multiplication of two complexes is given as (a+bj)(c+dj) = (ac - bd) + (ad + cb)j

        double real1 = complex1.getReal();
        double real2 = complex2.getReal();

        double imagin1 = complex1.getImaginary();
        double imagin2 = complex2.getImaginary();

        double mulReal = (real1*real2) - (imagin1*imagin2);
        double mulImagin = (real1*imagin2)+(real2*imagin1);
        
        return new ComplexNumber(mulReal,mulImagin);
    }

    public ComplexNumber divComplex(ComplexNumber complex1, ComplexNumber complex2)
    {
        // Division of two complex numbers is given as (a+bj)/(c+dj) = ((ac + bd) + (bc -ad)j)/(c^2 + d^2)
        if (complex2.getImaginary()== 0 && complex2.getReal()==0)
        {
            System.out.println("Can't perform operation, divider has modulus of zero.");
            System.out.println("Returning complex number with real part and imaginary part 0");
            return new ComplexNumber();
        }
        
        else
        {
            double real1 = complex1.getReal();
            double real2 = complex2.getReal();

            double imagin1 = complex1.getImaginary();
            double imagin2 = complex2.getImaginary();

            double mod = Math.pow(imagin2,2) + Math.pow(real2,2);

            double divReal = (real1*real2) + (imagin1*imagin2);
            divReal = divReal/mod;

            double divImagin = (real2*imagin1) - (real1*imagin2);
            divImagin = divImagin/mod;

            ComplexNumber theSub = new ComplexNumber(divReal,divImagin);
            return theSub;
        }
    }

    public double modComplex(ComplexNumber theNumber)
    {
        double realPart = theNumber.getReal();
        double imaginPart = theNumber.getImaginary();
        double modulus = Math.pow(realPart,2) + Math.pow(imaginPart,2);
        modulus = Math.pow(modulus,0.5);

        return modulus;
    }

    // Additional method to show the complex number

    public String showComplex()
    {
        String stringValue = Double.toString(real) + " + " + Double.toString(imaginary)+"j";
        return stringValue;
    }
}
```
- And finally test your class by creating instance of a class using default constructor, parameterized constructor, and by using the get and set methods. All the above steps shall be done in one step and your program shall have a mechanism to report how many objects of (instances) complexNumberOperation class are created.
  
[Solution file for second instruction](./LAB03E/ComplexNumberOperationTest.java)
> Solution Code

```Java
public class ComplexNumberOperationTest 
{
    public static void main(String[] args)
    {
        ComplexNumber number1 = new ComplexNumber();
        ComplexNumber number2 = new ComplexNumber(3,4);
        //LAB03E_ComplexNumber number3;//used to store values after operation

        // Setting the value of complex number 1 using setter methods
        number1.setImaginary(2);
        number1.setReal(5);

        System.out.println("\nThis is a demo for the class of ComplexNumber\n");

        // Testing the getter functions
        System.out.println("The real part of the first complex number is "+number1.getReal());
        System.out.println("The imaginary part of the first complex number is "+number1.getImaginary());
        System.out.println();
        System.out.println("The real part of the second complex number is "+number2.getReal());
        System.out.println("The imaginary part of the second complex number is "+number2.getImaginary());
        System.out.println();

        //Testing addition method 
        //number3 = number1.addComplex(number1, number2).showComplex();
        System.out.println("The addition of the two numbers equals "+ number1.addComplex(number1, number2).showComplex());
        System.out.println();

        //Testing subtraction method 
        //number3 = number1.subComplex(number1, number2);
        System.out.println("The subtraction of the two numbers equals "+ number1.subComplex(number1, number2).showComplex());
        System.out.println();

        //Testing multiplication method 
       
        System.out.println("The multiplication of the two numbers equals "+ number1.mulComplex(number1, number2).showComplex());
        System.out.println();

        //Testing division method 
        
        System.out.println("The division of the two numbers equals "+ number1.divComplex(number1, number2).showComplex());
        System.out.println();

        //Testing the modulus method of both numbers
        double mod1 = number1.modComplex(number1);
        System.out.println("The modulus of the first complex number equals "+ mod1);
       

        double mod2 = number2.modComplex(number2);
        System.out.println("The modulus of the second complex number equals "+ mod2);

        //Display how many objects are created of complex number
        System.out.println("\nThere are " + ComplexNumber.objectCount + " objects created of type complex number.");
    }   
}
```
---

<center>

### Feel free to report any typos on [dododoyo](https://github.com/dododoyo)

<img alt='Happy-Coding' src="https://readme-typing-svg.herokuapp.com?font=Architects+Daughter&amp;color=red&amp;size=20&amp;lines=Happy+Coding+!+🧑‍💻+ 👨‍💻" style="width: 100%;margin-left:25%"></img>

## Made With 🖤 By  [🐬](https://github.com/dododoyo)

</center>

---