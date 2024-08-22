package Lec.Ex3;

public class Program {
    
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        // Point2D a = new Point(0, 2)
        System.out.println(a.getInfo());

        Point2D b = new Point2D( 10);
        // Point2D b = new Point(0, 10)
        System.out.println(b.toString());
        System.out.println(distance(a, b));
    }
}
