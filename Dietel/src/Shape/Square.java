package Shape;

public class Square extends TwoDimensionalShapes{
    private double side;


    public Square(double side ) {
        super();
        this.side = side;

    }
    public void setSide(double side){
    this.side = side;}
    public double getSide(){
        return side;
    }



    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}


