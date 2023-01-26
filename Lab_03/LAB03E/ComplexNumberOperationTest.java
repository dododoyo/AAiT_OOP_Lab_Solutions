public class ComplexNumberOperationTest 
{
    public static void main(String[] args)
    {
        ComplexNumber number1 = new ComplexNumber();
        ComplexNumber number2 = new ComplexNumber(3,4);
        //LAB03E_ComplexNumber number3;//used to store values after operation


        // Setting the value of complex number 1 using setter methods
        number1.setImaginary(2);
        number1.setReal(5);

        System.out.println("\nThis is a demo for the class of ComplexNumber\n");
        // Testing the getter functions
        System.out.println("The real part of the first complex number is "+number1.getReal());
        System.out.println("The imaginary part of the first complex number is "+number1.getImaginary());
        System.out.println();
        System.out.println("The real part of the second complex number is "+number2.getReal());
        System.out.println("The imaginary part of the second complex number is "+number2.getImaginary());
        System.out.println();


        //Testing addition method 
        //number3 = number1.addComplex(number1, number2).showComplex();
        System.out.println("The addition of the two numbers equals "+ number1.addComplex(number1, number2).showComplex());
        System.out.println();
        //Testing subtraction method 
        //number3 = number1.subComplex(number1, number2);
        System.out.println("The subtraction of the two numbers equals "+ number1.subComplex(number1, number2).showComplex());
        System.out.println();

        //Testing multiplication method 
       
        System.out.println("The multiplication of the two numbers equals "+ number1.mulComplex(number1, number2).showComplex());
        System.out.println();

        //Testing division method 
        
        System.out.println("The division of the two numbers equals "+ number1.divComplex(number1, number2).showComplex());
        System.out.println();

        //Testing the modulus method of both numbers
        double mod1 = number1.modComplex(number1);
        System.out.println("The modulus of the first complex number equals "+ mod1);
       

        double mod2 = number2.modComplex(number2);
        System.out.println("The modulus of the second complex number equals "+ mod2);

        //Display how many objects are created of complex number
        System.out.println("\nThere are " + ComplexNumber.objectCount + " objects created of type complex number.");

    }   
}
