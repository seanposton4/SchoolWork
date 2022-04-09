//G.8 on page 684
import java.awt.Point;
public class G8 {
    public static void main (String[] args) {
        //Trapezoid Operations
        Point point4 = new Point(0, 0); //points 3&4 will remain the same for all shapes
        Point point3 = new Point(5, 0);
        Point point2 = new Point(4, 3);
        Point point1 = new Point(2, 3);

        Trapezoid trap = new Trapezoid(point1, point2, point3, point4);
        System.out.println("Trapezoid Area: " + trap.getArea());

        //Parallelogram Operations
        point2 = new Point(6, 3);
        point1 = new Point(1, 3);

        Parallelogram para = new Parallelogram(point1, point2, point3, point4);
        System.out.println("Parallelogram Area: " + para.getArea());

        //Rectangle Operations
        point2 = new Point(5, 3);
        point1 = new Point(0, 3);

        Rectangle rect = new Rectangle(point1, point2, point3, point4);
        System.out.println("Recntangle Area: " + rect.getArea());

        //Square Operations
        point2 = new Point(5, 5);
        point1 = new Point(0, 5);

        Square square = new Square(point1, point2, point3, point4);
        System.out.println("Square area: " + square.getArea());
    }
}