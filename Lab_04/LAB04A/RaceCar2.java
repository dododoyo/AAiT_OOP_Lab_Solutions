// → Instead of having a constant top speed for all RaceCar2s, change the RaceCar2 class so every car has its
// own top speed

import java.awt.*;

class RaceCar2 // →Create a new class called RaceCar2. 
{
        // Add two ﬁelds to RaceCar2: a ﬁeld of type String to store the name
        // of the car and a ﬁeld of type Color (from Java.awt.Color) to store the color of the car. Each car can have a
        // different name and color. Should the ﬁelds be static or non-static?
    
    private String carName;
    private Color carColor;
        // Answer: Since each instance must have it's own color and name they must be static.

        //     → Every one of our RaceCar2s will have the same top speed. Add a private constant of type double to the
        // RaceCar2 class to store the top speed and initialize it to any number you want. Should this ﬁeld be static or
        // non-static?
    private final int topSpeed = (int)(Math.random()*1000) + 2000; // in meters per second
    
        // → Add a constructor to RaceCar2 which accepts a name and 
        //  color argument and assigns the arguments
        // to the name and color ﬁelds of the class.
        
    public RaceCar2(String carName, Color carColor)
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
    public int getTopSpeed()
    {
        return topSpeed;
    }
        //     → Add a method to RaceCar2 called race which accepts two RaceCar2s as arguments, simulates a race
        // between the two, and returns the car that wins the race, or null if the race is a tie. The method should
        // calculate a random speed for each car between 0 and the top speed. The car with the higher speed wins
        // the race, but if they both have the same speed they tie. The method random in Java.lang.Math returns a
        // random double between 0 and 1. If you multiply this random number by the top speed, the product will be
        // a random number between 0 and the top speed. Should this method be static or non-static?

    public RaceCar2 raceWith(RaceCar2 racerCar)// not static anymore
    {
        int speedOfCar = (int)(Math.random()*topSpeed);
        int speedOfRacerCar = (int)(Math.random()*topSpeed);

        if (speedOfCar > speedOfRacerCar)
        return this;
        else if(speedOfCar < speedOfRacerCar)
        return racerCar;
        else 
        return null;
    }
            /*→ Add a main method to RaceCar2 which creates two RaceCar2s, races them against one another, and
        prints out the winner’s name. When instantiating the RaceCar2 objects, pass one of the static ﬁelds of the
        Color class (like RED or BLUE) as the color argument to the constructor. Should the main method be static
        or non-static?*/
    public static void main(String[] args)
    {
        RaceCar2 blueCar = new RaceCar2("Bughatti", Color.BLUE);
        RaceCar2 redCar = new RaceCar2("Ferarri", Color.RED);
        RaceCar2 winner = blueCar.raceWith(redCar);

        if(winner.equals(blueCar))
        System.out.println("The winner is Bughatti.");
        else if(winner.equals(redCar))
        System.out.println("The winner is ferrari");
        else 
        System.out.println("The race was a tie.");

        System.out.println("Top speed of this car was "+ blueCar.getTopSpeed());
        System.out.println("Top speed of racer car was "+ redCar.getTopSpeed());
    }


}