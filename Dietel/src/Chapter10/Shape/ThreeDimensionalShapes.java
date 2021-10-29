package Shape;

public abstract class ThreeDimensionalShapes extends Shape{
    private int dimension1;
    private int dimension2;
    private int dimension3;

    public void setDimension1(int firstDimension){
        this.dimension1 = firstDimension;
    }
    public int getDimension1(){
        return dimension1;
    }

    public void setDimension2(int secondDimension){
        this.dimension2 = secondDimension;
    }
    public int getDimension2(){
        return dimension2;
    }
    public void setDimension3(int thirdDimension){
        this.dimension3 = thirdDimension;
    }
    public int getDimension3(){
        return dimension3;
    }
    public abstract double getArea();

    public abstract double getVolume();






}
