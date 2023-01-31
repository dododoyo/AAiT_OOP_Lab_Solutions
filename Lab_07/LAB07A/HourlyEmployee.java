public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;

    public void setWage(double theWage){wage = theWage;}

    public void setHour(double theHours){hours = theHours;}

    public double getWage(){return wage;}

    public double gethours(){return hours;}

    public double calculateEarnings()
    {
        if(hours <= 40)
        return wage*hours;

        else
        return wage*(40) +((hours-40)*1.5);

    }
    public String toString()
    {
        return super.toString()+"\n"
        +"With a salary of "+this.calculateEarnings();
    }    
}
