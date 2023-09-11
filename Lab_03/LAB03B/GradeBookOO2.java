class GradeBookOO2 
{
    private double[] grade;

    public GradeBookOO2(int arrayLength)
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

    public void deleteGrade(double gradeToDelete)
    {
        int indexToDelete = -1;
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] == gradeToDelete) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete == -1) {
            System.out.println("Grade not found.");
            return;
        }
        double[] newGrade = new double[grade.length - 1];
        for (int i = 0, j = 0; i < grade.length; i++) {
            if (i != indexToDelete) {
                newGrade[j++] = grade[i];
            }
        }
        grade = newGrade;
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
