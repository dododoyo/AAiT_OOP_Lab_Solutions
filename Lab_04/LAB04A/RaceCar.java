import java.awt.*;


class RaceCar // →Create a new class called Racecar. 
{
        // Add two ﬁelds to Racecar: a ﬁeld of type String to store the name
        // of the car and a ﬁeld of type Color (from Java.awt.Color) to store the color of the car. Each car can have a
        // different name and color. Should the ﬁelds be static or non-static?
    
    private String carName;
    private Color carColor;
        // Answer: Since each instance must have it's own color and name they must be static.

        //     → Every one of our racecars will have the same top speed. Add a private constant of type double to the
        // Racecar class to store the top speed and initialize it to any number you want. Should this ﬁeld be static or
        // non-static?
    private final static int topSpeed = 1000; // in meters per second
    
        // → Add a constructor to Racecar which accepts a name and 
        //  color argument and assigns the arguments
        // to the name and color ﬁelds of the class.
        
    public RaceCar(String carName, Color carColor)
    {
        this.carName = carName;
        this.carColor = carColor;
    }

        //     → Add a method called getName that returns the name of the car and a method called getColor that
        // returns the color of the car. Should these methods be static or non-static?
    public String getName() 
    {
        return carName;
    }
    public Color getColor()
    {
        return carColor;
    }
        //     → Add a method to Racecar called race which accepts two Racecars as arguments, simulates a race
        // between the two, and returns the car that wins the race, or null if the race is a tie. The method should
        // calculate a random speed for each car between 0 and the top speed. The car with the higher speed wins
        // the race, but if they both have the same speed they tie. The method random in Java.lang.Math returns a
        // random double between 0 and 1. If you multiply this random number by the top speed, the product will be
        // a random number between 0 and the top speed. Should this method be static or non-static?

    public static RaceCar race(RaceCar firstCar, RaceCar secondCar)// static
    {
        int speedOfFirstCar = (int)(Math.random()*topSpeed);
        int speedOfSecondCar = (int)(Math.random()*topSpeed);

        if (speedOfFirstCar > speedOfSecondCar)
        return firstCar;
        else if(speedOfFirstCar < speedOfSecondCar)
        return secondCar;
        else 
        return null;
    }
            /*→ Add a main method to Racecar which creates two Racecars, races them against one another, and
        prints out the winner’s name. When instantiating the Racecar objects, pass one of the static ﬁelds of the
        Color class (like RED or BLUE) as the color argument to the constructor. Should the main method be static
        or non-static?*/
    public static void main(String[] args)
    {
        RaceCar blueCar = new RaceCar("Bughatti", Color.BLUE);
        RaceCar redCar = new RaceCar("Ferarri", Color.RED);
        RaceCar winner = RaceCar.race(blueCar,redCar);

        if(winner.equals(blueCar))
        System.out.println("The winner is Bughatti.");
        else if(winner.equals(redCar))
        System.out.println("Winner is ferrari");
        else 
        System.out.println("The race was a tie.");
    }


}