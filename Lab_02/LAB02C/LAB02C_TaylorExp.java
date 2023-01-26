import java.util.*;
public class LAB02C_TaylorExp 
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
