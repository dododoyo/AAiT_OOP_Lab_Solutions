public class LAB03D_PointTest 
{
    public static void main(String[] args)
    {
        LAB03D_Point p1 = new LAB03D_Point(); //Intialized with the values of zero.
        LAB03D_Point p2 = new LAB03D_Point(4,6);// Initialized with the Xvalue of 4 and Yvalue of 6

        System.out.println("The 'x' value of point 1 is: "+p1.getX());
        System.out.println("The 'y' value of point 1 is: "+p1.getY());

        System.out.println("\nThe 'x' value of point 2 is: "+p2.getX());
        System.out.println("The 'y' value of point 2 is: "+p2.getY());

        System.out.printf("\nThe distance between the two points is: %,.3f", p1.distanceWith(p2));
    }
}
