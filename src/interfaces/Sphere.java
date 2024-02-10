package interfaces;

public class Sphere extends Figure implements Volume, Area {
    private final double rad;

    public Sphere(double rad) {
        this.rad = rad;
    }

    @Override
    public double printVolume() {
        return (4 / 3 * rad * rad * rad * Math.PI);
    }

    @Override
    public double printArea() {
        return (4 * rad * rad * Math.PI);
    }
}
