package Shape;

public abstract class TwoDimensionalShapes extends Shape {

    private int dimension1;
    private int dimension2;

    public void setDimension1(){
        this.dimension1 = dimension1;
    }
    public int getDimension1(){
        return dimension1;
    }
    public void setDimension2(){
        this.dimension2 = dimension2;
    }
    public int getDimension2(){
        return dimension2;
    }
    public abstract double getArea();
}
