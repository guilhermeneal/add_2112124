public abstract class Shape implements Labelled, Measurable {
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

    @Override
    public String getLabel() {
        Point currentPosition = getPosition();
        return getClass().getSimpleName() + " at ("
                + currentPosition.getX() + ", " + currentPosition.getY() + ")";
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter();
}
