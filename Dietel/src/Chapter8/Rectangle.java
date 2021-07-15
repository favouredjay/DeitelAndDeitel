package Chapter8;

public class Rectangle {
    private double width = 1;
    private double length = 1;

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.00) {
            this.width = width;
        } else throw new IllegalArgumentException("width is invalid");
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {

        if (length > 0.0 && length < 20.00) {
            this.length = length;
        } else throw new IllegalArgumentException("length is invalid");
    }

    public double getLength() {
        return length;
    }

    public double area() {
        return getLength() * getWidth();
    }

    public double perimeter() {

        return 2 * (getLength() + getWidth());

    }






}
