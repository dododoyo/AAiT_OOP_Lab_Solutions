public class CommissionedEmployee extends Employee
{
    private double grossSale;
    private double commissionRate;

    public void setGrossSale(double theSale){grossSale = theSale;}

    public void setCommissionRate(double theRate){commissionRate = theRate;}

    public double getGrossSale(){return grossSale;}

    public double getCommissionRate(){return commissionRate;}

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
