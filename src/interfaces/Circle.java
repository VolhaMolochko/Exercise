package interfaces;

public class Circle implements Perimeter, Area {
    private final double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Circle perimeter is:");
        System.out.println(2 * rad * Math.PI);
    }

    @Override
    public void printArea() {
        System.out.println("Circle area is:");
        System.out.println(rad * rad * Math.PI);
    }

}
