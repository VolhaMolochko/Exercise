package interfaces;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(7);
        Sphere sphere = new Sphere(8);
        Cube cube = new Cube(4);


        circle.printArea();
        circle.printPerimeter();

        System.out.println(" ");

        square.printArea();
        square.printPerimeter();

        System.out.println(" ");

        sphere.printArea();
        sphere.printVolume();

        System.out.println(" ");

        cube.printArea();
        cube.printVolume();
    }
}
