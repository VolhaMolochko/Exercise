package interfaces;

public class Cube implements Volume, Area {
    private final double  a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public void printVolume() {
        System.out.println("Cube volume is:");
        System.out.println(a * a * a);
    }

    @Override
    public void printArea() {
        System.out.println("Cube area is:");
        System.out.println(a * a * 6);
    }
}
