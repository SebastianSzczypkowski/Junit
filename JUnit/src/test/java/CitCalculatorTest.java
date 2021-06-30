import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CitCalculatorTest {


    @BeforeClass
    public void prepareForAllTests()
    {
        System.out.println("prepareForAllTests");
    }
    @AfterClass
    public void cleanUpAllTests()
    {
        System.out.println("cleanUpAllTests");
    }
    public CitCalculator calcUnderTest;
    @Before
    public void prepare()
    {
        calcUnderTest=new CitCalculator();
        System.out.println("prepare");
    }
    @After
    public void clenUp()
    {
        System.out.println("clenUp");
    }
    @Test
    @Category(Complicated.class)
    public void shouldCalculateCit()
    {

        double tax =calcUnderTest.calculateTax(1000000d);
        assertEquals(190000d,tax,0.000001);
        System.out.println("shouldCalculateCit");

    }
    @Test
    @Category({Trivial.class,Easy.class})
    public void shouldBeZero()
    {
        double tax = calcUnderTest.calculateTax(0d);
        assertEquals(0d,tax,0.000001);
        System.out.println("shouldBeZero");
    }


}