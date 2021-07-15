package chapter5;

import chapter5.TaxPlanAlternative;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxPlanAlternativeTest {

    TaxPlanAlternative alternative = new TaxPlanAlternative();

    @Test

    void testThatTaxPlanAlternativeCanBeCalculated(){
        alternative.setTotalAmount(10.00);
        assertEquals(2.3000000000000003, alternative.getTotalAmount());
    }


}
