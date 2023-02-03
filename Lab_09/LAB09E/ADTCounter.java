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