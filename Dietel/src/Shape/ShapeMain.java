package Shape;


public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(6.0, 4.0);
        shapes[1] = new Square(7.0);
        shapes[2] = new Sphere(5.0);
        shapes[3] = new Cylinder(5.0, 6.0);

        for(Shape element : shapes){
            System.out.println(element);

            if( element instanceof TwoDimensionalShapes) {
                TwoDimensionalShapes twoDimensionalShapes = (TwoDimensionalShapes) element;
                System.out.println("The Area of the " + twoDimensionalShapes + " is: " + twoDimensionalShapes.getArea());
            }
            if(element instanceof  ThreeDimensionalShapes){
                ThreeDimensionalShapes threeDimensionalShapes = (ThreeDimensionalShapes) element;
                System.out.println("The Area of the " + threeDimensionalShapes + " is: " + threeDimensionalShapes.getArea() + "\nThe Volume of the " + threeDimensionalShapes + " is: " + threeDimensionalShapes.getVolume() );


            }
        }



    }
}