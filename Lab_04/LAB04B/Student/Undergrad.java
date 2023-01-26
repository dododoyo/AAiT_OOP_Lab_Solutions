class Undergrad extends Student
{
    public Undergrad(String theName, int theYear)
    {
        super(theName,theYear);
    }
    String description()
    {
        return this.getName() + " U "+ this.getYear() ;
    }
    
}
