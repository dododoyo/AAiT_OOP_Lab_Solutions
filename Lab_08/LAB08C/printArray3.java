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