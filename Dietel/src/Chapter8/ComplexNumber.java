package Chapter8;
// (Complex Numbers) Create a class called Complex for performing arithmetic with complex
//        numbers. Complex numbers have the form
//        realPart + imaginaryPart * i
//        where i is
//        Write a program to test your class. Use floating-point variables to represent the private data of the
//class. Provide a constructor that enables an object of this class to be initialized when it’s declared.
//        Provide a no-argument constructor with default values in case no initializers are provided. Provide
//public methods that perform the following operations:
//        a) Add two Complex numbers: The real parts are added together and the imaginary parts
//        are added together.
//        b) Subtract two Complex numbers: The real part of the right operand is subtracted from
//        the real part of the left operand, and the imaginary part of the right operand is subtracted from the imaginary part of the left operand.
//        c) Print Complex numbers in the form (realPart, imaginaryPart).

public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;
    private double i;

    public ComplexNumber() {
        realPart = 0;
        imaginaryPart = 0;
        i = Math.sqrt(-1);
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;

    }

    public static ComplexNumber canAddComplexNumbers(ComplexNumber r, ComplexNumber i){
            ComplexNumber complex = new ComplexNumber(0, 0 );
            complex.realPart = r.realPart +i.realPart;
            complex.imaginaryPart = i.imaginaryPart  + r.imaginaryPart;

            return complex;
    }
    public  static  ComplexNumber canSubtractComplexNumbers(ComplexNumber r, ComplexNumber i){
        ComplexNumber complex = new ComplexNumber(0,0);
        complex.realPart = r.realPart - i.realPart;
        complex.imaginaryPart = r.imaginaryPart - r.realPart;
        return complex;
    }

    public static void main(String[] args) {
        ComplexNumber temp = new ComplexNumber(2, 4);
        ComplexNumber number = new ComplexNumber(5, 6);
       ComplexNumber complex = canAddComplexNumbers(temp, number);
       ComplexNumber complexNumber = canSubtractComplexNumbers(temp, number);
        System.out.println(complex.realPart + "+" + complex.imaginaryPart  + "i");
        System.out.println(complexNumber.realPart + "+" + complexNumber.imaginaryPart + "i");
    }
}
