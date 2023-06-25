import org.example.Addition;
import org.example.Calculator;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestCase {

    Calculator calculator = new Calculator();

    @Test
    public void AddTwoNumbers()
    {
        long expectedSum = 10;
        long actualSum = calculator.add(4,6);
        assertEquals(expectedSum, actualSum);

    }

    @Test
    public void AddTwoNumbersFail()
    {
        long expectedSum = 11;
        long actualSum = calculator.add(4,6);
        assertNotEquals(expectedSum, actualSum);

    }


}
