import java.util.*;

public class LAB02G_ESPGame 
{
    public static void main(String[] args)
    {
        int compNumber,userNumber,correctGuesses=0;
        String compColor;
        for(int i = 0 ; i < 5 ;i++)
        {
            compNumber = computerChoice ();
            userNumber = userChoice();
            compColor = numberToColor(compNumber);
            System.out.println("\nComputer's choice was "+compColor);
            correctGuesses += correctCounter(compNumber, userNumber);
        }
        System.out.println("\nThe number of correct guesses is: " +correctGuesses);
    }
    public static int computerChoice()
    {
        int compNum = (int)(Math.random()*5);
        return compNum;
    }
    public static int colorToNumber(String userColor)
    {
        userColor = userColor.toLowerCase();
        int userNum ;
        if(userColor.equals("red"))
        userNum = 0;
        else if(userColor.equals("green"))
        userNum = 1;
        else if(userColor.equals("blue"))
        userNum = 2;
        else if(userColor.equals("orange"))
        userNum = 3;
        else 
        userNum = 4;

        return userNum;
    }
    public static int userChoice()
    {
        String choice;
        Scanner kb = new Scanner(System.in);
        do
        {
            System.out.println("\nHere are the list of colors available.");
            System.out.println("Red, Green, Blue, Orange, Yellow.");
            System.out.print("Please enter your choice here: ");
            choice = kb.nextLine();
        }while(!validEntry(choice));

        return colorToNumber(choice);
    }
    public static boolean validEntry(String userChoice)
    {
        userChoice = userChoice.toLowerCase();

        if(userChoice.equals("red")||userChoice.equals("green")||userChoice.equals("blue")||userChoice.equals("orange")||userChoice.equals("yellow"))
        return true;
        else
        return false;
    }
    public static String numberToColor(int theNumber)
    {
        String choice;
        if (theNumber == 0)
        choice = "Red";
        else if(theNumber == 1)
        choice = "Green";
        else if(theNumber == 2)
        choice = "Blue";
        else if (theNumber == 3)
        choice = "Orange";
        else 
        choice = "Yellow";
        return choice;
    }
    public static int correctCounter(int compChoice, int userChoice)
    {
        int correct ;
        if(compChoice == userChoice)
        correct = 1;
        else 
        correct = 0;

        return correct;
    }
    
}
