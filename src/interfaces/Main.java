package interfaces;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(7);
        Sphere sphere = new Sphere(8);
        Cube cube = new Cube(4);


        System.out.println(circle.printArea());
        System.out.println(circle.printPerimeter());

        System.out.println(" ");

        System.out.println(square.printArea());
        System.out.println(square.printPerimeter());

        System.out.println(" ");

        System.out.println(sphere.printArea());
        System.out.println(sphere.printVolume());

        System.out.println(" ");

        System.out.println(cube.printArea());
        System.out.println(cube.printVolume());
    }
}
