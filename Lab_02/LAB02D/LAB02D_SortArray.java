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
      // This method will sort a given array using Selection sort algorithm
        for( int i = 0 ; i < arr.length-1 ;i++)
        {
            int minIndex = getMinIndex(arr, i);
            if(minIndex!= i)
            {
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            }
        }

        // Instead of writing your own code you can use the built-in Arrays.sort() method 
        // uncomment the code bellow to use the built in method
        
        /*
        Arrays.sort(arr);
        */
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
    public static void showArray(double[] theArray)
    {
        for(double val: theArray)
        System.out.print(val+" ");
        System.out.println();
    }
    
}
