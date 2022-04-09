import java.awt.Point;
public class Parallelogram extends Quadrilateral {
    public Parallelogram (Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    public double getArea() {
        double base = super.point3.x - super.point4.x;

        double height = super.point1.y - super.point4.y;

        return base * height;
    }
}
