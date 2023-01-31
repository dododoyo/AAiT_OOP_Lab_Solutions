public class Cat extends Animal implements Pet
{
    private String catName;
    
    public Cat()
    {
        super(4);
    }

    public Cat(String catName)
    {
        // No need to recieve the number of legs
        super(4);
        this.setName(catName);
    }

    public void setName(String theName)
    {
        catName = theName;
    }

    public String getName()
    {
        return catName;
    }

    public void play()
    {
        System.out.println("The cat is playing with it's ball.");
    }

    public void eat()
    {
        System.out.println("The cat is eating sushi");
    }
    
    
}
