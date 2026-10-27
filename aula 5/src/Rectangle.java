public class Rectangle {
    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle() {
        this(new Point(0.0, 0.0), 0.0, 0.0);
    }

    public Rectangle(Point topLeftPoint, double height, double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void alterarTopLeftPoint(Point novoTopLeftPoint) {
        this.topLeftPoint = novoTopLeftPoint;
    }

    public void alterarHeight(double novaAltura) {
        this.height = novaAltura;
    }

    public void alterarWidth(double novaLargura) {
        this.width = novaLargura;
    }

    public double calcularArea() {
        return height * width;
    }

    public double calcularPerimetro() {
        return 2.0 * (height + width);
    }

    public boolean contemPonto(Point ponto) {
        double left = topLeftPoint.getX();
        double right = left + width;
        double top = topLeftPoint.getY();
        double bottom = top - height;

        return ponto.getX() >= left
                && ponto.getX() <= right
                && ponto.getY() <= top
                && ponto.getY() >= bottom;
    }
}
