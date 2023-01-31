public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public void setWeeklySalary(double theSalary)
    {
        weeklySalary = theSalary;
    }

    public double getWeeklySalary()
    {
        return weeklySalary;
    }

    public double calculateEarnings()
    {
        // since there are approximately 4 weeks in a month
        return 4*this.getWeeklySalary();
    }

    public String toString()
    {
        return super.toString()+"\n"
                + "with a monthly salary of "+ this.calculateEarnings();
    }
    
}
