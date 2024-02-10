package interfaces;

public class Cube extends Figure3D implements Volume, Area {
    private final double  a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double printVolume() {
        return(a * a * a);
    }

    @Override
    public double printArea() {
        return(a * a * 6);
    }
}
