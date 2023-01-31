public class InvalidAgeException extends Exception
{
    public InvalidAgeException(){};

    public InvalidAgeException(int ageValue){super("Can't have ages below '0' or above '130'.");}
}