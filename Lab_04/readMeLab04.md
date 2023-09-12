# Laboratory Exercises #4

[All Exercises](../README.md)

[<< Laboratory Exercise 03](../Lab_03/readMeLab03.md) | [Laboratory Exercise 05 >>](../Lab_05/readMeLab05.md)

## Objective

- Understanding the static and final modifiers through practical programming exercises.
- Writing reusable code by applying the concepts of inheritance.

## Preparation Tasks

- Revising/understanding the theoretical concepts which are dealt in the lecture session.

## Activities

#### a. Racecar Class OOP implementation

- Create a new class called **Racecar**. Add two fields to **Racecar**: a field of type String to store the name of the car and a field of type Color (from Java.awt.Color) to store the color of the car. Each car can have a different name and color. 
> Should the fields be static or non-static?
  
-  Every one of our race cars will have the same top speed. Add a private constant of type double to the **Racecar** class to store the top speed and initialize it to any number you want. 
> Should this field be static or non-static?
  
-  Add a constructor to Racecar which accepts a name and color argument and assigns the arguments to the name and color fields of the class.
-  Add a method called getName that returns the name of the car and a method called getColor that returns the color of the car. 
> Should these methods be static or non-static?
-  Add a method to Racecar called race which accepts two Racecars as arguments, simulates a race between the two, and returns the car that wins the race, or null if the race is a tie. The method should calculate a random speed for each car between 0 and the top speed. The car with the higher speed wins the race, but if they both have the same speed they tie. The method *random* in Java.lang.Math returns a random double between 0 and 1. If you multiply this random number by the top speed, the product will be a random number between 0 and the top speed. 
> Should this method be static or non-static?
-  Add a main method to Racecar which creates two Racecars, races them against one another, and
prints out the winner’s name. When instantiating the Racecar objects, pass one of the static fields of the Color class (like RED or BLUE) as the color argument to the constructor. 
> Should the main method be static or non-static?


[Solution file to first instruction](./LAB04A/RaceCar.java)
> Solution Code 
```Java
import java.awt.*;


class RaceCar // -Create a new class called Racecar. 
{
        // Add two fields to Racecar: a field of type String to store the name
        // of the car and a field of type Color (from Java.awt.Color) to store the color of the car. Each car can have a
        // different name and color. Should the fields be static or non-static?
    
    private String carName;
    private Color carColor;
        // Answer: Since each instance must have it's own color and name they must be static.

        // static
    private final static int topSpeed = 1000; // in meters per second
    
        
    public RaceCar(String carName, Color carColor)
    {
        this.carName = carName;
        this.carColor = carColor;
    }

    // non-static
    public String getName() 
    {
        return carName;
    }
    public Color getColor()
    {
        return carColor;
    }

    public static RaceCar race(RaceCar firstCar, RaceCar secondCar)
    // static
    {
        int speedOfFirstCar = (int)(Math.random()*topSpeed);
        int speedOfSecondCar = (int)(Math.random()*topSpeed);

        if (speedOfFirstCar > speedOfSecondCar)
        return firstCar;
        else if(speedOfFirstCar < speedOfSecondCar)
        return secondCar;
        else 
        return null;
    }
    
    // static
    public static void main(String[] args)
    {
        RaceCar blueCar = new RaceCar("Bughatti", Color.BLUE);
        RaceCar redCar = new RaceCar("Ferarri", Color.RED);
        RaceCar winner = RaceCar.race(blueCar,redCar);

        if(winner.equals(blueCar))
        System.out.println("The winner is Bughatti.");
        else if(winner.equals(redCar))
        System.out.println("Winner is ferrari");
        else 
        System.out.println("The race was a tie.");
    }
}
```
-  Instead of having a constant top speed for all race cars, change the Racecar class so every car has its own top speed.

[Solution file to Second instruction](./LAB04A/RaceCar2.java)
> Solution Code 
```Java
import java.awt.*;

class RaceCar
{

    private String carName;
    private Color carColor;

    // top speed is generated randomly for each car
    private final int topSpeed = (int)(Math.random()*1000) + 2000; // in meters per second
    
    public RaceCar2(String carName, Color carColor)
    {
        this.carName = carName;
        this.carColor = carColor;
    }
    public String getName() 
    {
        return carName;
    }
    public Color getColor()
    {
        return carColor;
    }
    public int getTopSpeed()
    {
        return topSpeed;
    }

    public RaceCar2 raceWith(RaceCar2 racerCar)// not static anymore
    {
        int speedOfCar = (int)(Math.random()*topSpeed);
        int speedOfRacerCar = (int)(Math.random()*topSpeed);

        if (speedOfCar > speedOfRacerCar)
        return this;
        else if(speedOfCar < speedOfRacerCar)
        return racerCar;
        else 
        return null;
    }
    public static void main(String[] args)
    {
        RaceCar2 blueCar = new RaceCar2("Bughatti", Color.BLUE);
        RaceCar2 redCar = new RaceCar2("Ferarri", Color.RED);
        RaceCar2 winner = blueCar.raceWith(redCar);

        if(winner.equals(blueCar))
        System.out.println("The winner is Bughatti.");
        else if(winner.equals(redCar))
        System.out.println("The winner is ferrari");
        else 
        System.out.println("The race was a tie.");

        System.out.println("Top speed of this car was "+ blueCar.getTopSpeed());
        System.out.println("Top speed of racer car was "+ redCar.getTopSpeed());
    }
}
```

#### b. Students Class OOP Implementation for demonstrating the Concept of inheritance
- Create a package called students. All the classes you create in this exercise will be created in this package.
- Create a class called Student, which should have two properties, a name and a year and methods to get the name and get the year of the student. Initialize these properties to arguments passed into the constructor.
  
[Solution file to Student](./LAB04B/Student/Student.java)
> Solution Code
```Java
public class Student 
{
    private String studentName;
    private int studentYear;

    public Student(String theName, int theYear)
    {
        studentName = theName;
        studentYear = theYear;
    }

    public String getName()
    {
        return studentName;
    }

    public int getYear()
    {
        return studentYear;
    }
}
```
- Create a subclass of Student called Undergrad. The Undergrad constructor should accept name and year arguments. Add a method to Undergrad called description which returns a String containing the name of the undergrad, then a space, then a capital ’U’, then a space, and then the year of the undergrad. For example, the description method of an Undergrad instance with the name ”Michael” and the year 2006, should return the String “Michael U 2006”.

[Solution file to Undergrad](./LAB04B/Student/Undergrad.java)
> Solution Code
```Java
class Undergrad extends Student
{
    public Undergrad(String theName, int theYear)
    {
        super(theName,theYear);
    }
    String description()
    {
        return this.getName() + " U "+ this.getYear() ;
    }
}
```
- Create a subclass of Student called Grad. The Grad constructor should accept only the name of the Grad as an argument, and it should always initialize the Grad’s year to 5. Add a description method to Grad which returns a String containing the name of the Grad, followed by a space and then the letter ’G’. The description method of a Grad named Jennifer should return the String sayJennifer G.
  
[Solution file to Grad](./LAB04B/Student/Grad.java)
> Solution Code
```Java
public class Grad extends Student
{
    public Grad(String theName)
    {
        super(theName,5);
    }
    String description()
    {
        return this.getName() + " G" ;
    }
}
```

- Create a subclass of Undergrad called Intern. In addition to the name and year properties, Intern should have a wage and a number of hours that are initialized in the constructor. Add a getPay method to Intern which returns the wage times the number of hours. Add a description method to Intern which returns a String containing the result of calling Undergrad’s description method followed by the return value of the getPay method. The description method of an Undergrad named Elizabeth” whose year is 2005 and worked 20 hours at $10.32/hour, should return the String “Elizabeth U 2005 206.4”.
  
[Solution file to Intern](./LAB04B/Student/Intern.java)
> Solution Code
```Java
public class Intern extends Undergrad
{
    private int wage;
    private int hoursWorked;

    public Intern(String theName, int theYear,int theWage, int theHours)
    {
        super(theName,theYear);
        wage = theWage;
        hoursWorked = theHours;
    }
    int getPay()
    {
        return wage*hoursWorked;
    }
    String description()
    {
        return super.description() + " "+ this.getPay();
    }
}
```
- Create a subclass of Grad called ResearchAssistant. ResearchAssistant has a salary that is initialized in the constructor and a getPay method that returns the salary. Add a description method to ResearchAssistant which returns a String containing the result of Grad’s description method, followed by the result of getPay. The description method of a ResearchAssistant with the name “Greg” and a $2000.00 salary would return the String “Greg G 2000.0”.
  
[Solution file to ReasearchAssistant](./LAB04B/Student/ResearchAssistant.java)
> Solution Code
```Java
public class ResearchAssistant extends Grad
{
    private int salary;
    
    public ResearchAssistant(String theName,int theSalary)
    {
        super(theName);
        salary = theSalary;
    }
    int getPay()
    {
        return salary;
    }
    String description()
    {
        return super.description() + " "+ this.salary;
    }
}
```
- Create a class called StudentTest that has a main method. Use the main method to test the class hierarchy you just built. Create some instances of Undergrad, Grad, Intern, and Research Assistant. Print out the result of their description methods. Compile and run.

[Solution file to StudentTest](./LAB04B/Student/StudentTest.java)
> Solution Code
```Java
public class StudentTest 
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Israel Kebede",2003);
        Undergrad student2 = new Undergrad("Dawit Abate", 2003);
        Intern student3 = new Intern("Chala Buluma", 2004, 1500, 10);
        ResearchAssistant student4 = new ResearchAssistant("Ermias Bulo", 60000);
        Grad student5 = new Grad("Getachew Belete");

        System.out.println("Student 1 is " + student1.getName()+" in year "+student1.getYear()+".");
        System.out.println("Student 2 " +student2.description());
        System.out.println("Student 3 " +student3.description());
        System.out.println("Student 4 " +student4.description());
        System.out.println("Student 5 " +student5.description());
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