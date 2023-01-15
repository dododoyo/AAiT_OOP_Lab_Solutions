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
        // This method will sort a given array usign Selection sort algorithm
        for( int i = 0 ; i < arr.length-1 ;i++)
        {
            int minind = getMinIndex(arr, i);
            if(minind!= i)
            {
                double temp = arr[minind];
                arr[minind] = arr[i];
                arr[i] = temp;
            }
        }

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
    public static void showArray(double[] thearr)
    {
        for(double val: thearr)
        System.out.print(val+" ");
        System.out.println();
    }
    
}
