package interfaces;

public class Square implements Perimeter, Area {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public void printPerimeter() {
        System.out.println("Square perimeter is:");
        System.out.println(a * 4);
    }

    @Override
    public void printArea(){
        System.out.println("Square area is:");
        System.out.println(a * a);
    }
}
