public abstract class Shape {
    private Point position;

    public Shape() {
        this.position = new Point();
    }

    public Shape(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}