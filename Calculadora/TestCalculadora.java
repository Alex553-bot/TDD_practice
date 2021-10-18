

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestCalculadora.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestCalculadora
{
    private Calculadora calculadora;
    /**
     * Default constructor for test class TestCalculadora
     */
    public TestCalculadora() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void jerarquia() {
        char expresion = (char)calculadora.jerarquia("2 + 5 - 2");
        assertEquals('+', expresion);
    }
}
