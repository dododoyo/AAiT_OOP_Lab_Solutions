
public class LAB1GTempConverter {
    public static void main(String[] args)
    {
        double tempInCelsius = 50.0;
        double tempInfahrenheit = celsiusConverter(tempInCelsius);
        System.out.println("Temprature in fahrenheit is: "+tempInfahrenheit);
    }
    public static double celsiusConverter(double celsius)
    {
        return 1.8*celsius + 32;
    }
}
