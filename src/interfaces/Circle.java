package interfaces;

public class Circle extends Figure2D implements Perimeter, Area {
    private final double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public double printPerimeter() {
        return (2 * rad * Math.PI);
    }

    @Override
    public double printArea() {
        return (rad * rad * Math.PI);
    }


}
