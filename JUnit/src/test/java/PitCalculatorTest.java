import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import static org.junit.jupiter.api.Assertions.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class PitCalculatorTest {

    @Test
    @Ignore
    @Category(Easy.class)
    void shouldBeHightTax()
    {
        PitCalculator calculator = new PitCalculator();
        double tax = calculator.calculateTax(3091);
        assertEquals(0d,tax,0.000001);
    }
    @Test
    @Category(Complicated.class)
    void shouldBeTaxFree(){
        PitCalculator calculator = new PitCalculator();
        double tax =calculator.calculateTax(100000);
        assertEquals(19470.06d,tax,0.000001);
    }
    @Test
    @Category(Complicated.class)
    public void shouldBeFirstThreshlod()
    {
        PitCalculator calc = new PitCalculator();
        double tax =calc.calculateTax(50000);
        assertEquals(8443.98d,tax,0.000001);
    }

}