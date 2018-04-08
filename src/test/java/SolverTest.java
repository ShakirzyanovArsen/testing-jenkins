import org.junit.Assert;
import org.junit.Test;

public class SolverTest {

    @Test
    public void test() {
        Solver solver = new Solver();
        Assert.assertEquals(8, solver.solve(2, 4));
    }
}
