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

        for(int i = 0 ; i < lastElement;i++)
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
