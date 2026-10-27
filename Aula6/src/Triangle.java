public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        super();
        this.a = new Point(0, 0);
        this.b = new Point(0, 0);
        this.c = new Point(0, 0);
    }

    public Triangle(Point a, Point b, Point c) {
        super(a);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void alterarA(Point novoA) {
        this.a = novoA;
    }

    public void alterarB(Point novoB) {
        this.b = novoB;
    }

    public void alterarC(Point novoC) {
        this.c = novoC;
    }

    public void alterarTodos(Point novoA, Point novoB, Point novoC) {
        this.a = novoA;
        this.b = novoB;
        this.c = novoC;
    }

    public double calcularBase() {
        return b.CalcularDistancia(c);
    }

    public double calcularAltura() {
        return a.CalcularDistancia(b);
    }

    public double calcularArea() {
        return getArea();
    }

    @Override
    public double getArea() {
        double areaDupla = (b.getX() - a.getX()) * (c.getY() - a.getY())
                - (b.getY() - a.getY()) * (c.getX() - a.getX());
        return Math.abs(areaDupla) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return a.CalcularDistancia(b)
                + b.CalcularDistancia(c)
                + c.CalcularDistancia(a);
    }
}
