package interfaces;

public class Sphere implements Volume, Area{
    private final double rad;

    public Sphere (double rad){
        this.rad=rad;
    }

    @Override
    public void printVolume(){
        System.out.println("Sphere volume is:");
        System.out.println(4/3*rad*rad*rad*Math.PI);
    }

    @Override
    public void printArea(){
        System.out.println("Sphere area is:");
    System.out.println(4*rad*rad*Math.PI);
    }
}
