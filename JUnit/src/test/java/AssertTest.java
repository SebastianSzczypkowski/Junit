import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {
    @Test
    public void testAssertEquals(){
        String result = "wartosc";
        assertEquals("wartosc inna!","wartosc",result);
    }
    @Test
    public void testAssertSame()
    {
        Long v1 = Long.valueOf(123456);
        Long v2 = v1;
        assertNotSame(v1,Long.valueOf(123456),"Inny obiekt");
    }
    @Test
    public void testAssertTrue()
    {
        assertTrue(2>3, "Nieprawda");
    }
    @Test
    public void testAssertNotNull()
    {
        Long v1 =Long.valueOf(12345);
        assertNotNull(v1, "Nieprawda");
    }
    @Test
    public void testAssertArrayEquals()
    {
        int[] t1={1,2,3,4,5};
        int[] t2={1,2,3,4,5};
        assertArrayEquals(t1,t2);
    }

}
