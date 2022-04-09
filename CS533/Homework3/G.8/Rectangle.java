import java.awt.Point;
public class Rectangle extends Parallelogram {
    
    public Rectangle(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    public double getArea() {
        double length = Math.abs(super.point3.x - super.point4.x);
        double height = Math.abs(super.point2.y - super.point3.y);

        return length * height;
    }
}
