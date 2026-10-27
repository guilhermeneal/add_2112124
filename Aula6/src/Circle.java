public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(Point position, double radius) {
        super(position);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}
