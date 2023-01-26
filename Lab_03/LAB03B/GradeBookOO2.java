class GradeBookOO2 
{
    private double[] grade;

    public   GradeBookOO2(int arrayLength)
    {
        grade = new double[arrayLength];
    }


    public void addGrades(double valueAdded, int indexToBeAdded)
    {
        try
        {
            grade[indexToBeAdded] = valueAdded;
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Invalid index value.");
            System.out.println("Please restart the program, and try again.");
            System.exit(0);
        }
    }
    
    // Can't remove according to instructions just changed the value into '0'.
    public void deleteGrade(double theGrade)
    {
        for (int i = 0 ; i < grade.length ; i++)
        {
            if (grade[i] == theGrade)
            {
                grade[i] = 0;
            }
        }
    }

    public void printGrades()
    {
        for(double val : grade)
        System.out.println(val);
    }
    
    public double averageGrade()
    {
        double sum = 0,numberOFStudents = 0;
        for(double val: grade)
        {
            sum += val;
            numberOFStudents++;
        }
        return sum/numberOFStudents;
    }
    
}

    
