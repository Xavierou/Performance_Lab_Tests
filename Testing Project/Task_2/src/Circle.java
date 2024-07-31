public class Circle {
    private Point center;
    private int radius;

    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public double calculateDistance(Point point) {
        return Math.sqrt(Math.pow((point.getX() - center.getX()), 2) + Math.pow((point.getY() - center.getY()), 2));
    }
}
