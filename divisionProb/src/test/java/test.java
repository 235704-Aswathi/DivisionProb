import org.junit.Test;
import static org.example.Main.divide;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class test {


    @Test
    public void testDivide() {
        assertEquals(1.0, divide(10, 10));
        assertEquals(0.5, divide(1, 2));
        assertEquals(-2.0,divide(-10, 5));
        assertEquals(-0.5, divide(1, -2));
        try {
            divide(10, 0);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
