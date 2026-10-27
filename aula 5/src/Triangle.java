public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        this.a = new Point(0, 0);
        this.b = new Point(0, 0);
        this.c = new Point(0, 0);
    }

    public Triangle(Point a, Point b, Point c) {
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
        return this.b.CalcularDistancia(this.c);
    }

    public double calcularAltura() {
        // Assume a distância do ponto 'a' ao 'b' (ex: cateto vertical)
        return this.a.CalcularDistancia(this.b);
    }

    public double calcularArea() {
        double baseTriangulo = calcularBase();
        double alturaTriangulo = calcularAltura();
        return (baseTriangulo * alturaTriangulo) / 2.0;
    }
}
