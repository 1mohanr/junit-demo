import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {
    @Test
    public void testHello() {
        String message = "Hello Jenkins";
        assertEquals("Hello Jenkins", message);
    }
}

