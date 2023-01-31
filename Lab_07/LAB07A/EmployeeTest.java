public class EmployeeTest
{
    public static void empDescription(Employee e) 
    {
        System.out.println(e.toString());
    }
    public static void main(String args[ ])
    {
        SalariedEmployee se=new SalariedEmployee();
        se.setWeeklySalary(9000);

        HourlyEmployee he=new HourlyEmployee();
        he.setHour(89);
        he.setWage(1000);

        CommisionedEmployee ce = new CommisionedEmployee();
        ce.setComissionRate(0.19);
        ce.setGrossSale(20000);

        BaseSalariedCommisionedEmployee bsce = new BaseSalariedCommisionedEmployee();
        bsce.setBaseSalary(9000);
        bsce.setComissionRate(0.20);
        bsce.setGrossSale(100000);

        Employee e[]=new Employee[4];
        e[0]=se;
        e[1]=he;
        e[2]=ce;
        e[3]=bsce;

        for(Employee myEmp:e)
        {
            if(myEmp instanceof BaseSalariedCommisionedEmployee)
            {
                BaseSalariedCommisionedEmployee emp = (BaseSalariedCommisionedEmployee)myEmp;
                emp.setBaseSalary(4000);
                emp.setComissionRate(0.15);
                emp.setGrossSale(10000); 
                System.out.println(myEmp);
            }
            else if(myEmp instanceof CommisionedEmployee)
            {
                CommisionedEmployee emp = (CommisionedEmployee)myEmp;
                emp.setComissionRate(0.15);
                emp.setGrossSale(10000);
                System.out.println(myEmp);
            }
            else if(myEmp instanceof HourlyEmployee)
            {
                HourlyEmployee emp = (HourlyEmployee)myEmp;
                emp.setWage(1000); emp.setHour(50);
                System.out.println(myEmp);
            }
            else if(myEmp instanceof SalariedEmployee)
            {
                SalariedEmployee emp = (SalariedEmployee)myEmp;
                emp.setWeeklySalary(5000);
                System.out.println(myEmp);
            }
        }  

        /*
        Calling the empDiscription method with instance of SalariedEmployee class
        */
        System.out.println("\n \n The result of polymorphic method call");
        System.out.println("\n \nCalling the empDiscription method using instance of SalariedEmployee class as an arguement");
        empDescription(se);
        /*
        Calling the empDiscription method with instance of HourlyEmployee class
        */
        System.out.println("\n Calling the empDiscription method using instance of HourlyEmployee class as an arguement");
        empDescription(he);
        /*
        Calling the empDiscription method with instance of CommisionedEmployee class
        */
        System.out.println("\nCalling the empDiscription method using instance of CommisionedEmployee class as an arguement");
        empDescription(ce);
        /*
        Calling the empDiscription method with instance of BaseSalariedCommisionedEmployee class
        */
        System.out.println("\n Calling the empDiscription method using instance of BaseSalariedCommisionedEmployee class as an arguement");
        empDescription(bsce);
    }
}
