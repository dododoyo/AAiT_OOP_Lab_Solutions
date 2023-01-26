public class LAB02B_MethodsOverloading
{
    public static double calcArea(double radius)
    {
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }

    public static double calcArea(double height,double width)
    {
        double Area = height*width;
        return Area;
    }

    public static double calcArea(int base, int height)
    {
        double Area = 0.5*base*height;
        return Area;
    }
    
    public static void main(String[] args)
    {
        System.out.println(calcArea(5.5));
        System.out.println(calcArea(2.0,4.0));
        System.out.println(calcArea(2,3));
    }
}