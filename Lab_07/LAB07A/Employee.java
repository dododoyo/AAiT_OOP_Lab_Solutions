public abstract class Employee 
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public abstract double calculateEarnings();

    public String getFirstName(){return firstName;}

    public String getLastName(){return lastName;}

    public String getSocSecNumber(){return socialSecurityNumber;}

    @Override
    public String toString()
    {
        return "The name of the employee is "+ firstName + " "+lastName
                                +"\n"+"with social security number "+socialSecurityNumber;

    }
}