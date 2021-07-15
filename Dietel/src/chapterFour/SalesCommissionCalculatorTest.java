package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionCalculatorTest {
    SalesCommissionCalculator salaryCommissionCalculator = new SalesCommissionCalculator();

    @Test
    void salaryCommissionCalculatorExists(){
    assertNotNull(salaryCommissionCalculator);
    }

    @Test
    void canCalculateItemValues(){
        salaryCommissionCalculator.calculateTotalItems(239.99, 99.95,129.75, 350.89);
//        salaryCommissionCalculator.calculateTotalItems(129.75);
//        salaryCommissionCalculator.calculateTotalItems(99.95);
//        salaryCommissionCalculator.calculateTotalItems(350.89);
        assertEquals(820.5799999999999, salaryCommissionCalculator.getTotal());
    }
    @Test
    void getGrossSalesCommission(){
        salaryCommissionCalculator.setGrossSalesCommission(820.5799999999999);
      assertEquals(73.8522, salaryCommissionCalculator.getGrossSalesCommission());
    }
    @Test
    void can_calculateTotalSalesEarnings(){
        salaryCommissionCalculator.setGrossSalesCommission(820.5799999999999);
        assertEquals(273.8522, salaryCommissionCalculator.getSalesEarnings());
    }
}
