public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3.0, 4.0);

        System.out.println("P1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("P2: (" + p2.getX() + ", " + p2.getY() + ")");
        p1.setX(1.0);
        p1.setY(2.0);
        p1.setXY(0.0, 0.0);
        System.out.println("Distância: " + p1.CalcularDistancia(p2));

        Triangle t1 = new Triangle(
                new Point(0.0, 4.0),
                new Point(0.0, 0.0),
                new Point(3.0, 0.0)
        );
        System.out.println("Base do triângulo: " + t1.calcularBase());
        System.out.println("Altura do triângulo: " + t1.calcularAltura());
        System.out.println("Área do triângulo: " + t1.calcularArea());

        Triangle t2 = new Triangle();
        t2.alterarTodos(
                new Point(0.0, 6.0),
                new Point(0.0, 0.0),
                new Point(8.0, 0.0)
        );
        System.out.println("Área do segundo triângulo: " + t2.calcularArea());

        Rectangle r1 = new Rectangle(new Point(0.0, 6.0), 4.0, 5.0);
        System.out.println("Canto superior esquerdo: (" + r1.getTopLeftPoint().getX()
                + ", " + r1.getTopLeftPoint().getY() + ")");
        System.out.println("Altura: " + r1.getHeight());
        System.out.println("Largura: " + r1.getWidth());
        System.out.println("Área do retângulo: " + r1.calcularArea());
        System.out.println("Perímetro do retângulo: " + r1.calcularPerimetro());
        System.out.println("Contém o ponto (2, 4): " + r1.contemPonto(new Point(2.0, 4.0)));
        System.out.println("Contém o ponto (6, 4): " + r1.contemPonto(new Point(6.0, 4.0)));

        Rectangle r2 = new Rectangle();
        r2.alterarTopLeftPoint(new Point(1.0, 5.0));
        r2.alterarHeight(2.0);
        r2.alterarWidth(3.0);
        System.out.println("Canto superior esquerdo: (" + r2.getTopLeftPoint().getX()
                + ", " + r2.getTopLeftPoint().getY() + ")");
        System.out.println("Altura: " + r2.getHeight());
        System.out.println("Largura: " + r2.getWidth());
    }
}
