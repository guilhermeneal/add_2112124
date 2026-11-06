import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle sharedCircle = new Circle(new Point(1.0, 2.0), 3.0);
        Rectangle rectangle = new Rectangle(new Point(4.0, 5.0), 2.0, 6.0);
        Triangle triangle = new Triangle(
                new Point(0.0, 0.0),
                new Point(4.0, 0.0),
                new Point(0.0, 3.0));

        ArrayList<Labelled> labels = new ArrayList<>();
        labels.add(new Car(2020, "Toyota", "Corolla", 22000.0, "white", 4));
        labels.add(new Motorcycle(2022, "Honda", "CB500", 7000.0, "red", 2));
        labels.add(sharedCircle);
        labels.add(rectangle);

        ArrayList<Measurable> measurements = new ArrayList<>();
        measurements.add(sharedCircle);
        measurements.add(triangle);
        measurements.add(rectangle);

        ArrayList<Drawable> drawings = new ArrayList<>();
        drawings.add(sharedCircle);
        drawings.add(rectangle);
        drawings.add(new Circle(new Point(0.0, 0.0), 1.5));
        drawings.add(new Rectangle(new Point(2.0, 3.0), 1.0, 4.0));

        printLabels(labels);
        printMeasurements(measurements);
        drawAll(drawings);

        System.out.println("\nO mesmo circulo em cada interface:");
        Measurable measurableCircle = sharedCircle;
        Labelled labelledCircle = sharedCircle;
        Drawable drawableCircle = sharedCircle;
        System.out.println("Area: " + measurableCircle.getArea());
        System.out.println("Perimetro: " + measurableCircle.getPerimeter());
        System.out.println("Etiqueta: " + labelledCircle.getLabel());
        drawableCircle.draw();

        // labelledCircle.getBrand(); // Nao compila: Labelled so declara getLabel().
    }

    public static void printLabels(ArrayList<Labelled> objects) {
        System.out.println("Etiquetas:");
        for (Labelled object : objects) {
            System.out.println(object.getLabel());
        }
    }

    public static void printMeasurements(ArrayList<Measurable> objects) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        System.out.println("\nMedidas:");
        for (Measurable object : objects) {
            double area = object.getArea();
            double perimeter = object.getPerimeter();
            System.out.println("Area: " + area + ", perimetro: " + perimeter);
            totalArea += area;
            totalPerimeter += perimeter;
        }

        System.out.println("Soma das areas: " + totalArea);
        System.out.println("Soma dos perimetros: " + totalPerimeter);
    }

    public static void drawAll(ArrayList<Drawable> objects) {
        System.out.println("\nDesenhos:");
        for (Drawable object : objects) {
            object.draw();
        }
    }
}
