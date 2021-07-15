//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class HealthRecordTest {
//
//
//    @Test
//    @DisplayName("Health app can be created")
//    void heathAppCanBeCreated() {
//        HealthRecord healthRecord = new HealthRecord("Soy Sauce", "Male", 1.65, 60);
//        ;
//        assertNotNull(healthRecord);
//    }
//
//    @Test
//    void healthApp_canRegisterName() {
//        HealthRecord healthRecord = new HealthRecord("Soy Sauce", "Male", 1.65, 60);
//        ;
//        healthRecord.setName("Soy", "Sauce");
//
//    }
//
//    @Test
//    void patientCanRegisterDateOfBirth() {
//        HealthRecord healthRecord = new HealthRecord("Soy Sauce", "Male", 1.65, 60);
//        ;
//        healthRecord.setDateOfBirth(6, 29, 1998);
//        assertEquals(6, 29, 1998, healthRecord.getdateOfBirth());
//    }
//
//    @Test
//    void canRegisterHeight() {
//        HealthRecord healthRecord = new HealthRecord("Soy Sauce", "Male", 1.65, 60);
//    }
//
//    @Test
//    void patientCanRegisterAge() {
//        HealthRecord healthRecord = new HealthRecord("Soy Sauce", "Male", 1.65, 60);
//        assertEquals(23, healthRecord.getAge(1998));
//    }
//
//    @Test
//    void can_registerBMI() {
//        HealthRecord healthRecord = new HealthRecord("Soy Sauce", "Male", 1.65, 60);
//        assertEquals(23.507805325987146, healthRecord.getBMI(64, 1.65));
//    }
//
//    @Test
//    void calculateHeartRate() {
//        HealthRecord healthRecord = new HealthRecord("Soy Sauce", "Male", 1.65, 60);
//        healthRecord.getAge(1998);
//        assertEquals(197, healthRecord.calculateMaximumHeartRate(1998));
//    }
//}