package ChapterNine;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void inheritanceTest(){
        Car car = new Car();
        car.drive();
        car.setNumberOfTires(3);
        System.out.println(car.getNumberOfTires());
    }
}
