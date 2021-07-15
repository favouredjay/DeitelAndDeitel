package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
Rectangle rectangle = new Rectangle();

@Test
void testThatLengthIsValid(){
    rectangle.setLength(19.9);
    assertEquals(19.9, rectangle.getLength());
}

    @Test
    void testThatWidthIsValid(){
        rectangle.setWidth(19.9);
        assertEquals(19.9, rectangle.getWidth());
    }
@Test
    void areaCanBeCalculated(){
    rectangle.setLength(4.00);
    rectangle.setWidth(6.00);
    System.out.println(rectangle.area());
    assertEquals(24.0, rectangle.area());
}
@Test
    void perimeterCanBeCalculated(){
    rectangle.setWidth(4.0);
    rectangle.setLength(2.0);
    assertEquals(12.0, rectangle.perimeter());
}


}