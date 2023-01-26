public class Grad extends Student
{
    public Grad(String theName)
    {
        super(theName,5);
    }
    String description()
    {
        return this.getName() + " G" ;
    }
}
