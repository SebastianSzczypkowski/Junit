import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertNull;

public class SolverNoResultTest {
    @Rule
    public ExpectedException exception=ExpectedException.none();

    @Test
    public void shouldBeNoResults()
    {
        Solver solver = new Solver(1,2,6);
        double[] result =solver.solve();
        assertNull(result);
    }

}
