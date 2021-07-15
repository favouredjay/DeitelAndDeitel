package Chapter7;

public class VariableLengthArgumentProduct {
    public double arrayProduct(int ... numbers){
    int product = 1;
     for(int i : numbers)
    product *= i;
    return product;
    }

    public static void main(String[] args) {
        VariableLengthArgumentProduct vargLengthProduct = new VariableLengthArgumentProduct();
        int i1 = 10;
        int i2 = 20;
        int i3 = 40;
        int i4 = 50;
        System.out.println(vargLengthProduct.arrayProduct(i1, 12, 13, 14));
    }
}
