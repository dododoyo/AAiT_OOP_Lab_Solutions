public class StudentTest 
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Israel Kebede",2003);
        Undergrad student2 = new Undergrad("Dawit Abate", 2003);
        Intern student3 = new Intern("Chala Buluma", 2004, 1500, 10);
        ResearchAssistant student4 = new ResearchAssistant("Ermias Bulo", 60000);
        Grad student5 = new Grad("Getachew Belete");

        System.out.println("Name of student 1 is " + student1.getName()+" in year "+student1.getYear()+".");
        System.out.println("Student 2 " +student2.description());
        System.out.println("Student 3 " +student3.description());
        System.out.println("Student 4 " +student4.description());
        System.out.println("Student 5 " +student5.description());
    }
    
}
