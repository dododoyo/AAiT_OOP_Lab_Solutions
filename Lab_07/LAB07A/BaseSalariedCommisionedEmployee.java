public class BaseSalariedCommisionedEmployee extends CommisionedEmployee
{
    private double baseSallary;
    
    public double getBaseSalary(){return baseSallary;}

    public void setBaseSalary(double theSallary){ baseSallary = theSallary;}

    public double calculateEarnings()
    {
        return super.calculateEarnings() + baseSallary;
    }
    public String toString()
    {
        return super.toString()+"\n"
        +"With a salary of "+this.calculateEarnings();
    } 
}
