public class Intern extends Undergrad
{
    private int wage;
    private int hoursWorked;

    public Intern(String theName, int theYear,int theWage, int theHours)
    {
        super(theName,theYear);
        wage = theWage;
        hoursWorked = theHours;
    }
    int getPay()
    {
        return wage*hoursWorked;
    }
    String description()
    {
        return super.description() + " "+ this.getPay();
    }
}