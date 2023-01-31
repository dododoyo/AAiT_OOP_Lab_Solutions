public class Fish extends Animal implements Pet
{
    String fishName;

    public Fish()
    {
        super(0);
    }

    public void setName(String fishName)
    {
        this.fishName = fishName;
    }
    
    public String getName()
    {
        return fishName;
    }

    @Override
    public void walk()
    {
        System.out.println("A fish don't have legs it's swimming.");
    }

    @Override
    public void play()
    {
        System.out.println("The fish is playing with water.");
    }

    @Override
    public void eat()
    {
        System.out.println("The fish is eating another fish.");
    }
    
}
