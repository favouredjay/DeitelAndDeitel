package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    ComplexNumber complex = new ComplexNumber(0, 0);

    @Test
    void testForComplexNumber(){
        assertNotNull(complex);
    }

    @Test
    void testThatComplexNumberCanBeAdded(){
        double i = 0;
        ComplexNumber firstNumber = new ComplexNumber(2, 3);
        ComplexNumber secondNumber = new ComplexNumber(5, 4);
        ComplexNumber add = ComplexNumber.canAddComplexNumbers(firstNumber, secondNumber);

        assertEquals(add, ComplexNumber.canAddComplexNumbers(firstNumber,secondNumber));
        }
    }

