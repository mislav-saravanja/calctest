import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    public void testAdd() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }
    @Test
    public void testSubtract() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiply() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }
   
}
