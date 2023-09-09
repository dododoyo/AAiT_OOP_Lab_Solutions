import java.util.*;

public class LAB02F_RPSGame 
{
    public static void main(String[] args)
    {
            int compChoice = computerChoice();
            int userChoice = userChoice();
            System.out.println();
            showComputerChoice(compChoice);
            showWinner(userChoice, compChoice);
    }
    public static int computerChoice()
    {
        int computerChoice = (int)(Math.random()*2);
        return computerChoice;
    }

    public static int userChoice()
    {
        Scanner kb = new Scanner(System.in);
        String userChoice;
        do
        {
            System.out.println("Your choices are:");
            System.out.println("Rock");
            System.out.println("Paper");
            System.out.println("Scissor");
            System.out.print("Please enter your choice here: ");
            userChoice = kb.nextLine();
        }while(!isCorrectInput(userChoice));
        kb.close();
        return intValueOf(userChoice);
    }
    public static int intValueOf(String playerChoice)
    {
        int value;

        if(playerChoice.equalsIgnoreCase("rock"))
        value = 0;
        else if(playerChoice.equalsIgnoreCase("paper"))
        value = 1;
        else 
        value = 2;

        return value;  
    }

    public static String stringValueOf(int theNumber)
    {
        String value;
        if(theNumber == 0)
        value = "rock";
        else if(theNumber == 1)
        value = "paper";
        else 
        value = "scissor";

        return value;
    }
    public static boolean isCorrectInput(String choice)
    {
        if(choice.equalsIgnoreCase("rock")||choice.equalsIgnoreCase("paper")||choice.equalsIgnoreCase("scissor"))
        return true;
        else 
        return false;
    }
    public static void showWinner(int playerChoice, int computerChoice)
    {
        final String loseMessage = "You Lost !";
        final String winMessage = "You Won !";
        if (playerChoice==0 && computerChoice==1)
        {
            System.out.println("Paper wraps rock");
            System.out.println(loseMessage);
        }
        else if (playerChoice==0 && computerChoice==2)
        {
            System.out.println("Rock destroys Scissor");
            System.out.println(winMessage);
        }
        else if (playerChoice==1 && computerChoice==0)
        {
            System.out.println("Paper wraps Rock");
            System.out.println(winMessage);
        }
        else if (playerChoice==2 && computerChoice==0)
        {
            System.out.println("Rock destroys Scissor");
            System.out.println(loseMessage);
        }
        else if (playerChoice==1 && computerChoice==2)
        {
            System.out.println("Scissor cuts Paper");
            System.out.println(loseMessage);
        }
        else if (playerChoice==2 && computerChoice==1)
        {
            System.out.println("Scissor cuts Paper");
            System.out.println(winMessage);
        }
        else 
        {
            System.out.println("The game was a draw");
            System.out.println("Nobody won.");
        }

    }
    public static void showComputerChoice(int compChoice)
    {
        if(compChoice == 0)
        System.out.println("The computer's choice was ROCK.");
        else if(compChoice == 1)
        System.out.println("The computer's choice was PAPER.");
        else 
        System.out.println("The computer's choice was SCISSOR.");
    }
}
