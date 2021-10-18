
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Testiando_la_calcu.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestCalcu
{
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
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
    public void TestsumarDosNum(){
        Calculadorita casio = new Calculadorita(-100, 100);
        int resultado = casio.sumar(8,9);
        assertEquals(17, resultado);
    }

    @Test
    public void TestRestarDosNum(){
        Calculadorita casio = new Calculadorita(-100,100);
        int resultado = casio.restar(9,6);
        assertEquals(3, resultado);
    }

    @Test
    public void TestRestaNegativa(){
        Calculadorita casio = new Calculadorita(-100,100);//a priori: no tenía parámetros con límites
        int resultado = casio.restar(6,9);
        assertEquals(-3, resultado);
    }

    @Test
    public void TestRestaLímiteMínimo(){
        Calculadorita casio = new Calculadorita(-100,100);
        try{
            int resultado =casio.restar(30,220);
            fail("El resultado es demasiado negativo para los límites >_<");
        }catch(Exception err){
            //
        }
    }
}