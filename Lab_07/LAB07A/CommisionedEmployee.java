public class CommisionedEmployee extends Employee
{
    private double grossSale;
    private double commissionRate;

    public void setGrossSale(double theSale){grossSale = theSale;}

    public void setComissionRate(double theRate){commissionRate = theRate;}

    public double getGrossSale(){return grossSale;}

    public double getComissionRate(){return commissionRate;}

    public double calculateEarnings()
    {
        return grossSale*commissionRate;
    }
    public String toString()
    {
        return super.toString()+"\n"
        +"With a salary of "+this.calculateEarnings();
    }  
    
}
