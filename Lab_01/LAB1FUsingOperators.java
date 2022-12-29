public class LAB1FUsingOperators
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 3;

        
        int z = x + x*y - y;
        System.out.println( "The value of z is " + z );

        int w = ++x + y + y--;
        System.out.println( "The value of w is " + w );
        System.out.println( "The value of x is now " + x );
        System.out.println( "The value of y is now " + y );
        
        boolean a = true;
        boolean c = ((a && (!(x>y)) && (a || y >x)));
        System.out.println("\n c is : " + c);

    }
}