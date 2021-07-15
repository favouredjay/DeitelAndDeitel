package chapter5;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MobilePhoneTest {
    @BeforeEach
    void setUp(){
        MobilePhone mikePhone = new MobilePhone("mikeimei", PhoneManufacturer.APPLE);
        mikePhone.setModel("iphone xs max");
        mikePhone.makeCall(12322);
    }

}