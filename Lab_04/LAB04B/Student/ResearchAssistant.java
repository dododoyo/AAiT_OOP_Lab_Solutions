public class ResearchAssistant extends Grad
{
    private int salary;
    
    public ResearchAssistant(String theName,int theSalary)
    {
        super(theName);
        salary = theSalary;
    }
    int getPay()
    {
        return salary;
    }
    String description()
    {
        return super.description() + " "+ this.salary;
    }
}
