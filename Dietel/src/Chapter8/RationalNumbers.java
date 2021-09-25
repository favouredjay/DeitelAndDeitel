package Chapter8;

//(Rational Numbers) Create a class called Rational for performing arithmetic with fractions.
//        Write a program to test your class. Use integer variables to represent the private instance variables
//        of the class—the numerator and the denominator. Provide a constructor that enables an object of
//        this class to be initialized when it’s declared. The constructor should store the fraction in reduced
//        form. The fraction
//        2/4
//        is equivalent to 1/2 and would be stored in the object as 1 in the numerator and 2 in the denominator. Provide a no-argument constructor with default values in case no initializers are provided. Provide public methods that perform each of the following operations:
//        a) Add two Rational numbers: The result of the addition should be stored in reduced
//        form. Implement this as a static method.
//        b) Subtract two Rational numbers: The result of the subtraction should be stored in reduced form. Implement this as a static method.
//        c) Multiply two Rational numbers: The result of the multiplication should be stored in
//        reduced form. Implement this as a static method.
//        d) Divide two Rational numbers: The result of the division should be stored in reduced
//        form. Implement this as a static method.
//        e) Return a String representation of a Rational number in the form a/b, where a is the
//        numerator and b is the denominator.
//        f) Return a String representation of a Rational number in floating-point format. (Consider providing formatting capabilities that enable the user of the class to specify the
//        number of digits of precision to the right of the decimal point.)

public class RationalNumbers {
    int numerator;
    int denominator;

    public RationalNumbers() {
        numerator = 0;
        denominator = 0;
    }

    public RationalNumbers(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }



    public static RationalNumbers add(RationalNumbers r1, RationalNumbers r2){
        int rational = r1.numerator/r1.denominator + r2.numerator/r2.denominator;
        int multiple = r1.denominator*r2.denominator;

        return new RationalNumbers((r2.denominator * r1.numerator) + (r1.denominator * r2.numerator), multiple);
    }

    public static RationalNumbers subtract(RationalNumbers r1, RationalNumbers r2){
        int rationalNumbers = r1.numerator/r1.denominator - r2.numerator/r2.denominator;
        int multiple = r1.denominator*r2.denominator;

        return new RationalNumbers((r2.denominator * r1.numerator) - (r1.denominator * r2.numerator), multiple);
    }
    public static RationalNumbers multiply(RationalNumbers r1, RationalNumbers r2){
        int rationalNumbers = (r1.numerator/r1.denominator) * (r2.numerator/r2.denominator);


        return new RationalNumbers(r1.numerator *r2.numerator ,  r1.denominator * r2.denominator);
    }

    public static RationalNumbers divide(RationalNumbers r1, RationalNumbers r2){
//       int rationalNumbers = (r1.numerator/r1.denominator) /(r2.numerator/r2.denominator);

        return new RationalNumbers (r2.denominator * r1.numerator, r1.denominator * r2.numerator);
    }
    public String toString(){
        return "(" + numerator + "/" + denominator + ")";
    }

    public static void main(String[] args) {
        RationalNumbers number1 = new RationalNumbers(2, 5);
        RationalNumbers number2 = new RationalNumbers(1, 5);
        RationalNumbers temp = add(number1, number2);
        RationalNumbers temp2 = subtract(number1, number2);
        RationalNumbers temp3 = divide(number1, number2);
        RationalNumbers temp4 = multiply(number1, number2);
        System.out.println("add " + temp);
        System.out.println("subtract " + temp2);
        System.out.println("divide " + temp3);
        System.out.println("multiply " + temp4);


    }
}
