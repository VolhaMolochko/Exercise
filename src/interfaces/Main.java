package interfaces;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Circle(5);
        figures[1] = new Square(7);
        figures[2] = new Sphere(8);
        figures[3] = new Cube(4);

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].printArea());
            System.out.println(figures[i].printPerimeter());
            System.out.println(figures[i].printVolume());
            System.out.println(" ");
        }
    }
}