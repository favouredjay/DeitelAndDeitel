package Shape;

public class Rectangle extends TwoDimensionalShapes{
    private double sideLength;
    private double sideWidth;


    public Rectangle (double sideLength, double sideWidth){
       super();
       this.sideWidth = sideWidth;
       this.sideLength = sideLength;
    }

    public  void setSideLength(){
        if(sideLength > 0.0)
            this.sideLength = sideLength;
        if(sideLength < 0.0)
            throw new IllegalArgumentException("Must be greater than 0");
    }
    public void setSideWidth(){
        if(sideWidth > 0.0)
            this.sideWidth = sideWidth;
        if(sideWidth < 0.0)
            throw new IllegalArgumentException("Must be greater than 0");
    }
    public double getSideLength(){
        return sideLength;
    }
    public double getSideWidth(){
        return sideWidth;
    }
    public double getArea(double sideLength, double sideWidth){
       return sideLength * sideWidth;
    }

    @Override
    public double getArea() {
        return sideLength * sideWidth;
    }
}
