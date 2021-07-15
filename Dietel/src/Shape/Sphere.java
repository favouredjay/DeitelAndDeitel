package Shape;

public class Sphere extends ThreeDimensionalShapes{
    private double radius;
    private final double Pi = 3.142;

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }


    public void setRadius(){
        this.radius = radius;
    }
    public double getRadius(){return radius;}
    public double getArea(){
        return 4 * Pi * Math.pow(radius, 2);
    }
    public double getVolume(){
        return 4 * Pi * Math.pow(radius, 3)/3;
    }






}
