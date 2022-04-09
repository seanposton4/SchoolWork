import java.awt.Point;
//import java.lang.Math;
public class Trapezoid extends Quadrilateral{

    public Trapezoid (Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }
    
    public double getArea () {
        //This area is assuming the Trapezoid is upright always (calculating the height would be a nightmare otherwise)
        double height = Math.abs(this.point1.y - this.point4.y);

        double a = Math.abs(super.point2.x - super.point1.x);
        double b = Math.abs(super.point3.x - super.point4.x);

        return ((a + b) / 2) * height;
    }
}