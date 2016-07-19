import org.junit.*;
import static org.junit.Assert.*;

public class BowlingTest {
	@Test
    public void testPerfectGame() {
        int expected = 300;
        int actual = Bowling.answer("X|X|X|X|X|X|X|X|X|X||XX");
        assertEquals(expected, actual);
    }
}
