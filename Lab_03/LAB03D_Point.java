class LAB03D_Point 
{
    public double x;
    public double y;
    public static final double Pi = Math.PI;

    public LAB03D_Point()
    {
        x = 0;
        y = 0;
    }
    public LAB03D_Point(double xValue, double yValue)
    {
        x = xValue;
        y = yValue;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    
    public double distanceWith(LAB03D_Point thePoint)
    {
        double distance = Math.pow(Math.pow(thePoint.getX()-this.x,2)+Math.pow(thePoint.getY()-this.y,2),0.5);
        return distance;
    }


}