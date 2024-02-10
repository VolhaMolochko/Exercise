package interfaces;

public class Square extends Figure2D implements Perimeter, Area {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double printPerimeter() {
        return (a * 4);
    }

    @Override
    public double printArea() {
        return (a * a);
    }
}
