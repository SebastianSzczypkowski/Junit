import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
@RunWith(value = Parameterized.class)
public class CurrencyRoundServiceTest {

    public CurrencyRoundServiceTest() {
    }

    @Parameterized.Parameters(name = "[index]: round({1})={2}")
    public static Iterable<Object[]> testData()
    {
        return Arrays.asList(new Object[][]{{2,BigDecimal.valueOf(123.456),BigDecimal.valueOf(123.46)}
        ,{0,BigDecimal.valueOf(123.456),BigDecimal.valueOf(123)},
                {1,BigDecimal.valueOf(123.111),BigDecimal.valueOf(123.1)}});
    }
    @Parameterized.Parameter(value = 0)
    public int roundPrecision;
    @Parameterized.Parameter(value = 1)
    public BigDecimal testedValue;
    @Parameterized.Parameter(value = 2)
    public BigDecimal expectedValue;

    @Test
    public void shouldRoundAmount()
    {
        CurrencyRoundService currencyRoundService = new CurrencyRoundService(roundPrecision);
        BigDecimal result = currencyRoundService.round(testedValue);
        assertThat(result,is(equalTo(expectedValue)));
    }
}