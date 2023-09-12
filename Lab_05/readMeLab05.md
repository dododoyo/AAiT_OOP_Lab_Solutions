# Laboratory Exercises #5

[All Exercises](../README.md)

[<< Laboratory Exercise 04](../Lab_04/readMeLab04.md) | [Laboratory Exercise 06 >>](../Lab_06/readMeLab06.md)

## Objective

- Demonstrating the concepts of abstract classes, interfaces and polymorphism.
## Preparation Tasks
- Understanding/Revising the object oriented concepts that are covered in the previous laboratory sessions.
## Activities

#### a. Implementing Simple Counter Program for Demonstrating Abstract Data Types(ADT)
- Create a Java package called ADT
- In this package create a class named ADTCounter which have the following members:
1. One private field of type int named countValue
2. One default constructor that initializes the private field of the class to zero
3. Four public methods accessing the current value stored in the field of the class, for incrementing
the current value stored in the class by one, decrementing the current value stored in the class by one and
resetting the value of the field to the default (Starting) value.
4. The implementation shall be user friendly and handle all erroneous results which can be at runtime
of the program.

[Solution File for ADTCounter](./LAB05A/ADT/ADTCounter.java)
> Solution Code 
```Java
package ADT;
public class ADTCounter
{
    private int countValue;
    public ADTCounter()
    {
        countValue = 0;
    }

    public int getCount()
    {
        return countValue;
    }

    public void incrementValue()
    {
        countValue++;
    }

    public void decrementValue()
    {
        countValue--;
    }

    public void resetValue()
    {
        countValue = 0;
    }
}
```
5. Finally create another class called ADTCounterTest class in the same package and create a main method inside this class. Instantiate your previous class (ADTCounter) in the main method test the all the expected functionality of your program by feeding hypothetical data and/or calling appropriate method in the class.

[Solution File for ADTCounterTest](./LAB05A/ADT/ADTCounterTest.java)
> Solution Code 
```Java
package ADT;

public class ADTCounterTest 
{
    public static void main(String[] args)
    {
        ADTCounter firstCounter = new ADTCounter();

        System.out.println("Counter is "+firstCounter.getCount());
        

        System.out.println();
        System.out.println("Incrementing value. . .");
        firstCounter.incrementValue();
        System.out.println("Counter is "+firstCounter.getCount());

        System.out.println();
        System.out.println("Incrementing again. . .");
        firstCounter.incrementValue();
        System.out.println("Counter is "+firstCounter.getCount());

        System.out.println();
        System.out.println("Incrementing again. . .");
        firstCounter.incrementValue();
        System.out.println("Counter is "+firstCounter.getCount());

        System.out.println();
        System.out.println("Decrementing value. . .");
        firstCounter.decrementValue();
        System.out.println("Counter is "+firstCounter.getCount());

        System.out.println();
        System.out.println("Reseting value.");
        firstCounter.resetValue();
        System.out.println("Counter is "+firstCounter.getCount());
    }
}
```

#### b. Implementing Fraction Class for Demonstrating Abstract Data Types(ADT)
- Within the ADT package create a class named **Fraction** which is intended implement all features and visual representation of a real number system in fraction form. The class shall have the following members:
> Two private fields
> 
> > numerator. . .*int*
> >
> > denominator. . .*int*

> Two constructors:
>> One Default constructor that initializes the numerator to 0 and denominator to 1
>>
>> One parametrized constructor that initialized the private fields of a class based on the argument passed during class instantiation.

- Appropriate accessor (getters) and setter methods for all private fields of the class.
- The following public methods to perform the respective functionalities described in front of each method. 
- *formString*. . .which is intended to represent a fraction as a string in the form of “numerator/denominator”
- *simplify*. . .takes fraction object as a parameter and converts to its simplest form provided that
5
the fraction can be simplified( 10
26 shall be converted to 13 ) but if the fraction cannot be simplified it returns
the original fraction.

> Note: In this case, the appropriate error handling mechanism shall be applied during initialization. For instance, if the user enters 1 as numerator and 0 as denominator the program shall prompt appropriate error message and shall automatically exit.

- The class shall also include methods to perform the four arithmetic operations on fraction. These
functions shall take two fraction objects as an argument and returns the result as a fraction object
- The class shall also have a method to check the equality of two fractions. This function shall take two
fraction object as an argument and returns true if they are equal and false if the are not equal.

> Note: The details of the methods in the class is presented in the following table.

<center>

|Function|Parameter|Return Type|
| ------ | ------- | --------- |
| formString | int numerator, int denominator | String |
| setNumerator | int numerator | void |
| getNumerator | - | int |
| setDenominator | int denominator | void |
| getDenominator | - | int |
| simplify | One Fraction Object | Fraction Object |
| addFraction | Two Fraction Objects | Fraction Object |
| subFraction | Two Fraction Objects | Fraction Object |
| mulFraction | Two Fraction Objects | Fraction Object |
| divFraction | Two Fraction Objects | Fraction Object |
| areEqual | Two Fraction Objects | boolean |
||

</center>

[Solution File for Fraction](./LAB05B/Fraction.java)

> Solution Code 
```Java
public class Fraction 
{
    private int numerator;
    private int denominator;

    public Fraction()
    {
        numerator = 0 ;
        denominator = 1;
    }
    public Fraction(int theNumerator, int theDenominator)
    {
        if (theDenominator == 0)
        {
            System.out.println("Can't intialize with denominator value '0'.");
            System.out.println("Please restart the program");
            System.exit(0);
        }
        else
        {
            numerator = theNumerator;
            denominator = theDenominator;
        }
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator)
    {
        if (denominator == 0)
        {
            System.out.println("Can't intialize with denominator value '0'.");
            System.out.println("Please restart the program");
            System.exit(0);
        }
        else
        {
            this.denominator = denominator;
        }  
    }

    public String formString()
    {
        return (""+numerator+"/"+denominator);
    }

    public Fraction simplify(Fraction fractionToBeSimplified) //uses recursion
    {
        int numeratorOfFraction = fractionToBeSimplified.getNumerator();
        int denominatorOfFraction = fractionToBeSimplified.getDenominator();

        int min = Math.min(numeratorOfFraction,denominatorOfFraction);

        if(isPrime(numeratorOfFraction) && isPrime(denominatorOfFraction))
        return fractionToBeSimplified;

        else 
        {
            int divider = 1;

            for(int i = 2 ; i <= min ;i++)
            {
                if(numeratorOfFraction%i == 0 && denominatorOfFraction%i == 0)
                {
                    divider = i;
                    break;
                }
            }

            if (divider == 1)
            {
                return fractionToBeSimplified;
            }
            else
            {
                return simplify(fractionToBeSimplified);
            }
        }
    }

    public boolean isPrime(int theNumber)
    {
        int counter = 0;
        for(int i = 2 ;i < theNumber ; i++)
        {
            if(theNumber%i == 0)
            counter++;
        }

        if (counter == 0)
        return true;

        else 
        return false;
    }

    public Fraction addFraction(Fraction fraction1, Fraction fraction2)
    {
        int newDenominator = fraction2.denominator*fraction1.getDenominator();
        int newNumerator = fraction2.numerator*fraction1.getDenominator() + fraction2.denominator*fraction1.getNumerator();
        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction subFraction(Fraction fraction1,Fraction fraction2)
    {
        int newDenominator = fraction2.denominator*fraction1.getDenominator();
        int newNumerator = fraction2.numerator*fraction1.getDenominator() - fraction2.denominator*fraction1.getNumerator();
        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction multFraction(Fraction fraction1,Fraction fraction2)
    {
        int newDenominator = fraction2.denominator*fraction1.getDenominator();
        int newNumerator = fraction2.numerator*fraction1.getNumerator();
        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction divFraction(Fraction fraction1,Fraction fraction2)
    {
        int newDenominator = fraction2.denominator*fraction1.getNumerator();
        int newNumerator = fraction2.numerator*fraction1.getDenominator();
        return new Fraction(newNumerator,newDenominator);
    }

    public boolean isEqualWith(Fraction fraction1, Fraction fraction2)
    {
        if((fraction2.denominator == fraction1.getDenominator()) && (fraction2.numerator == fraction1.getNumerator()))
        return true;
        else 
        return false;
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