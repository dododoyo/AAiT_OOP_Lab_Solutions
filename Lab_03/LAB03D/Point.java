class Point 
{
    public double x;
    public double y;
    public static final double Pi = Math.PI;

    public Point()
    {
        x = 0;
        y = 0;
    }
    public Point(double xValue, double yValue)
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

    
    public double distanceWith(Point thePoint)
    {
        double distance = Math.pow(Math.pow(thePoint.getX()-this.x,2)+Math.pow(thePoint.getY()-this.y,2),0.5);
        return distance;
    }


}