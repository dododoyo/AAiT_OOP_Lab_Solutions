public class printArray
{
    public static void main(String[] args)
    {
        int[] theIntArray = {1,2,3,4,5,6,7,8,9};

        // let's specify the condition of the for loop to be true
        try
        {
            for (int i = 0 ; true ;i++)
            {
                System.out.println("The element number "+ (i+1)+" is " +theIntArray[i]);

            }

        }

        catch(IndexOutOfBoundsException ioe)
        {
            System.out.println("\nThat would be all.");
            System.out.println("Looks like we reached the end of the array.");
        }
        
    }
}