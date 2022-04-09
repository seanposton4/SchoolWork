import java.awt.Point;

public class Square extends Rectangle {
    public Square(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    public double getArea() {
        return Math.pow(Math.abs(super.point3.x - super.point4.x), 2);
    }
}
