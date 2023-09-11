import java.util.ArrayList;
class GradeBookOO3 
{
    private ArrayList<Double>  grade;

    public   GradeBookOO3()
    {
        grade = new ArrayList<>();
    }

    public  GradeBookOO3(ArrayList<Double> theInput)
    {
        grade = theInput;
    }

    public void addGrades(double theValue)
    {
        grade.add(theValue);
        System.out.println(theValue + " was added sucessfully.");
    }
    
    public void deleteGrade(double theGrade) {
    if (grade.contains(theGrade)) {
        grade.remove(theGrade);
        System.out.println(theGrade + " was removed successfully.");
    } else {
        System.out.println("The specified grade doesn't exist.");
    }
}

    public void printGrades()
    {
        for(double val : grade)
        System.out.println(val);
    }
    
    public double averageGrade()
    {
        double sum = 0;
        int numberOFStudents = grade.size();

        for(double val: grade)
        {
            sum += val;
        }
        return sum/numberOFStudents;
    }
    
}

    
