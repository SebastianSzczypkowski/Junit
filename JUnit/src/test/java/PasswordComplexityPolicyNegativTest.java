import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordComplexityPolicyNegativTest {


    @Rule
    public ExpectedException expectedException=ExpectedException.none();

    @Before
    public void prepare()
    {
        expectedException.expect(IllegalArgumentException.class);
    }

    public static final String QWERT_123 = "q123";
    public static final String PASSWORD = "zxcvbzwj";


    @Test
    void shouldThrowExeptionForTooShort() {
        PasswordComplexityPolicy policyTest = new PasswordComplexityPolicy();
        boolean result=policyTest.verify(QWERT_123);

    }
    @Test
    void shouldThrowExeptionForNoDigits() {
        PasswordComplexityPolicy policyTest = new PasswordComplexityPolicy();
        boolean result=policyTest.verify(PASSWORD);

    }
}