public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure();
        figure.getShapes().add(new Circle(new Point(0, 0), 2));
        figure.getShapes().add(new Triangle(
                new Point(0, 3),
                new Point(0, 0),
                new Point(4, 0)));
        figure.getShapes().add(new Rectangle(new Point(0, 4), 3, 5));

        for (Shape shape : figure.getShapes()) {
            System.out.println(shape.getClass().getSimpleName());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }

        System.out.println("Total area: " + figure.getTotalArea());
    }
}
