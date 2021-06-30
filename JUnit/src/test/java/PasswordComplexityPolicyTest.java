import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordComplexityPolicyTest {

    public static final String QWERT_123 = "qwert123";
    public static final String PASSWORD = "123zxcvb";

    @Test
    void shouldBeCorrectForVerifyOnPasswordWith3Digits() {
        PasswordComplexityPolicy policyTest = new PasswordComplexityPolicy();
        boolean result=policyTest.verify(QWERT_123);
        assertTrue(result, "wynik dla qwert123 ");
    }
    @Test
    void shouldBeCorrectForVerifyOnPasswordWith3DigitsOnBegining() {
        PasswordComplexityPolicy policyTest = new PasswordComplexityPolicy();
        boolean result=policyTest.verify(PASSWORD);
        assertTrue(result, "wynik dla 123zxcvb ");
    }
}