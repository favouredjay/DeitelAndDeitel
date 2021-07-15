package Chapter9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    @Test
    void employeesCanBeTested(){
        Employee employee = new Employee("John", "Doe", "112232");
        assertEquals("John", employee.getFirstName());
        assertEquals("Doe", employee.getLastName());
        assertEquals("112232", employee.getSocialSecurityNumber());
    }

    @Test
    void commissionedEmployeesCanBeTested(){
        CommissionEmployee employee = new CommissionEmployee("John", "Doe", "112232",1000.00, 0.9);
        assertEquals(1000.00, employee.getGrossSales());
        assertEquals(0.9, employee.getCommissionRate());
    }
    @Test
    void basePlusCommissionEmployeesCanBeTested(){
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("John", "Doe", "112232", 1000.00, 0.9,10.00);
        assertEquals(10.00, employee.getBaseSalary());
    }

}