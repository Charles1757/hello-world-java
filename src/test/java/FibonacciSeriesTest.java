import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FibonacciSeriesTest {

    @Test
    public void testFibonacciSeries() {
        int[] expected = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, FibonacciSeries.generateFibonacciSeries(10));
    }
}