import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {
    private final int sum = 1_500_000;
    private final double rate = 10.4;
    private final int period = 12;

    CreditCalculator calculator = new CreditCalculator();

    @Test
    void testSumPerMonth() {
        int expected = 132_153;
        int actual = calculator.sumPerMonth(sum, rate, period);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testFullSumReturn() {
        int expected = 1_585_836;
        int actual = calculator.fullSumReturn(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverPaySum() {
        int expected = 85_836;
        int actual = calculator.overPaySum(sum, rate, period);
        Assertions.assertEquals(expected, actual);
    }
}