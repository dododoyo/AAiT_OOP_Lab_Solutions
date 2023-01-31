public class InvalidGenderException extends Exception
{
    public InvalidGenderException(){}
    
    public InvalidGenderException(char theGenderChar){super(theGenderChar+" is not a valid gender character.");}
}
