public class LAB03E_ComplexNumber 
{
    private double real;
    private double imaginary;
    public static int objectCount;

    public LAB03E_ComplexNumber()
    {
        real = 0;
        imaginary = 0;
        objectCount++;
    }

    public LAB03E_ComplexNumber(double realPart, double imaginaryPart)
    {
        real = realPart;
        imaginary = imaginaryPart;
        objectCount++;
    }

    public void setReal(double realValue)
    {
        real = realValue;
    }

    public void setImaginary(double imaginaryValue)
    {
        imaginary = imaginaryValue;
    }

    public double getReal()
    {
        return real;
    }

    public double getImaginary()
    {
        return imaginary;
    }
    
    public LAB03E_ComplexNumber addComplex(LAB03E_ComplexNumber complex1, LAB03E_ComplexNumber complex2)
    {
        double realSum = complex1.getReal() + complex2.getReal();
        double imaginarySum = complex1.getImaginary() + complex2.getImaginary();

        LAB03E_ComplexNumber theSum = new LAB03E_ComplexNumber(realSum,imaginarySum);

        return theSum;
    }

    public LAB03E_ComplexNumber subComplex(LAB03E_ComplexNumber complex1, LAB03E_ComplexNumber complex2)
    {
        double realSub = complex1.getReal()-complex2.getReal();
        double imaginarySub = complex1.getImaginary() - complex2.getImaginary();

        LAB03E_ComplexNumber theSub = new LAB03E_ComplexNumber(realSub,imaginarySub);
        
        return theSub;
    }

    public LAB03E_ComplexNumber mulComplex(LAB03E_ComplexNumber complex1, LAB03E_ComplexNumber complex2)
    {
        // Multiplication of two complexes is given as (a+bj)(c+dj) = (ac - bd) + (ad + cb)j

        double real1 = complex1.getReal();
        double real2 = complex2.getReal();

        double imagin1 = complex1.getImaginary();
        double imagin2 = complex2.getImaginary();

        double mulReal = (real1*real2) - (imagin1*imagin2);
        double mulImagin = (real1*imagin2)+(real2*imagin1);

        LAB03E_ComplexNumber theSub = new LAB03E_ComplexNumber(mulReal,mulImagin);
        
        return theSub;
    }

    public LAB03E_ComplexNumber divComplex(LAB03E_ComplexNumber complex1, LAB03E_ComplexNumber complex2)
    {
        // Division of two complex numbers is given as (a+bj)/(c+dj) = ((ac + bd) + (bc -ad)j)/(c^2 + d^2)
        if (complex2.getImaginary()== 0 && complex2.getReal()==0)
        {
            System.out.println("Can't perform operation, divider has modulus of zero.");
            System.out.println("Returning complex number with real part and imaginary part 0");
            return new LAB03E_ComplexNumber();
        }
        
        else
        {
            double real1 = complex1.getReal();
            double real2 = complex2.getReal();

            double imagin1 = complex1.getImaginary();
            double imagin2 = complex2.getImaginary();

            double mod = Math.pow(imagin2,2) + Math.pow(real2,2);

            double divReal = (real1*real2) + (imagin1*imagin2);
            divReal = divReal/mod;

            double divImagin = (real2*imagin1) - (real1*imagin2);
            divImagin = divImagin/mod;

            LAB03E_ComplexNumber theSub = new LAB03E_ComplexNumber(divReal,divImagin);
            return theSub;
        }
    }

    public double modComplex(LAB03E_ComplexNumber theNumber)
    {
        double realPart = theNumber.getReal();
        double imaginPart = theNumber.getImaginary();
        double modulus = Math.pow(realPart,2) + Math.pow(imaginPart,2);
        modulus = Math.pow(modulus,0.5);

        return modulus;
    }

    // Additional method to show the complex number

    public String showComplex()
    {
        String stringValue = Double.toString(real) + " + " + Double.toString(imaginary)+"j";
        return stringValue;
        
    }
}
