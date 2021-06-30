import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
public class SolverTest {

    @Rule
    public ExpectedException exception=ExpectedException.none();
   /*@Test
    void test()
    {
        Solver solver = new Solver(-1,-7,12);
        double[] result=solver.solve();
        assertEquals(2,result.length);
        assertEquals(3,result[0],0.0000001);
        assertEquals(4,result[1],0.0000001);
    }
    @Test
    @org.junit.Test(expected=IllegalArgumentException.class)
      public void shouldThrowException()
    {
        Solver solver = new Solver(1,-7,12);
        double[] result=solver.solve();
    }*/
  /*  @Test
    public void shouldTrhowExeptioRule()
    {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("kwadratowe");
        Solver solver = new Solver(0,-7,12);
        double[] result = solver.solve();
    }
*/
    @Test
    public void shouldFindTwoResult()
    {
        Solver solver = new Solver(1 ,-7,12);
        double[] result= solver.solve();
        assertEquals(2,result.length);
        assertEquals(3,result[0],0.0000001);
        assertEquals(4,result[1],0.0000001);
    }



}