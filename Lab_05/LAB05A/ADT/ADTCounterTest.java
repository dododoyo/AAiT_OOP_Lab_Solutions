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
