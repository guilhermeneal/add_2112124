import java.util.ArrayList;

public class Figure {
    private ArrayList<Shape> shapes;

    public Figure() {
        shapes = new ArrayList<>();
    }

    public Figure(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public double getTotalArea() {
        double totalArea = 0.0;
        for (int i = 0; i < shapes.size(); i++) {
            totalArea += shapes.get(i).getArea();
        }
        return totalArea;
    }
}
