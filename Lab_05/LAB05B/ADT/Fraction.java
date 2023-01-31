package ADT;

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

        Fraction simplifiedFraction = fractionToBeSimplified;
        

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
                simplifiedFraction(fractionToBeSimplified);
            }
        }

        //return simplifiedFraction;

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
