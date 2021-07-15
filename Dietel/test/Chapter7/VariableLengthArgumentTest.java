package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariableLengthArgumentTest {
    VariableLengthArgumentProduct vargLengthProduct = new VariableLengthArgumentProduct();

    @Test
    void testCanCalculateVariableLengthArgumentProduct() {
        int i1 = 2;
        int i2 = 3;
        int i3 = 1;
        int i4 = 2;
        System.out.println("The Product is:" + vargLengthProduct.arrayProduct(i1, i2, i3, i4) );

        assertEquals(12, vargLengthProduct.arrayProduct(i1, i2, i3, i4));
    }
}
