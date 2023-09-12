public class AnimalClassTest 
{
    public static void main(String args[])
    {
        Fish nimo = new Fish();
        Cat garfield = new Cat("Garfield");
        Animal a = new Fish();
        Spider spidy = new Spider();
        Pet p = new Cat();
        //Animal e = new();

        // Implementing fish methods
        nimo.setName("Nimo");
        System.out.println("The name of our pet fish is: " +nimo.getName());
        nimo.setName("Dory");
        System.out.println("Now the name of our pet fish is: " +nimo.getName());
        nimo.play();
        nimo.walk();
        nimo.eat();

        System.out.println();

        // Implementing cat methods
        System.out.println("The name of the cat is "+ garfield.getName());
        garfield.setName("Puss");
        garfield.play();
        garfield.eat();

        System.out.println();

        //Implementing spider methods
        spidy.eat();

        System.out.println();
        //Implementing animal methods
        a.eat();
        a.walk();
        //Using casting to implement fish's methods with it's super class
        ((Fish)a).setName("Nimo's Father");
        System.out.println("The name of the animal is "+((Fish)a).getName());
        
        //Can't call subclass's methods

        System.out.println();
        //Implementing cat's methods

        //Implementing interface methods with it's implementations
        p.play();
        System.out.println("The name of the pet is "+ p.getName());
        p.setName("Tom");
        System.out.println("The name of the pet now is "+ p.getName());
    }
}
