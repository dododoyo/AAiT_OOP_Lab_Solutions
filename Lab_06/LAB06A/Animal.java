public abstract class Animal 
{
    protected int leg;
    
    protected Animal(int legValue)
    {
        leg = legValue; // minimum leg an animal can have
    }

    public abstract void eat();

    public void walk ()
    {
        System.out.println("The animal walks with " + leg + "legs.");
    }
    
}
