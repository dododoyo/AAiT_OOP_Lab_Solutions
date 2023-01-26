public class PointTest 
{
    public static void main(String[] args)
    {
        Point p1 = new Point(); //Intialized with the values of zero.
        Point p2 = new Point(4,6);// Initialized with the Xvalue of 4 and Yvalue of 6

        System.out.println("The 'x' value of point 1 is: "+p1.getX());
        System.out.println("The 'y' value of point 1 is: "+p1.getY());

        System.out.println("\nThe 'x' value of point 2 is: "+p2.getX());
        System.out.println("The 'y' value of point 2 is: "+p2.getY());

        System.out.printf("\nThe distance between the two points is: %,.3f", p1.distanceWith(p2));
    }
}
