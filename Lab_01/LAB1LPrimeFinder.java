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
