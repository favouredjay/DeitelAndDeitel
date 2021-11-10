package Chapter10.Shape;

public class Cylinder extends ThreeDimensionalShapes{

    private final double Pi = 3.142;
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    public double radius(){
        if(radius > 0)
        this.radius = radius;
        else throw new IllegalArgumentException("Radius must be greater than 0");
        return radius;
    }

    public double height(){
        if(height > 0)
            this.height = height;
        else throw new IllegalArgumentException("Height must be > 0");
        return height;
    }


    @Override
    public double getArea() {
        return 2 * Pi * radius * height;
    }

    @Override
    public double getVolume() {
      return   Pi * height * Math.pow(radius, 2);
    }
}
