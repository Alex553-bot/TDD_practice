
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestCalcudora
{
    private Calculadora casio;

    @BeforeEach
    public void setUp()
    {
        casio = new Calculadora(-100, 100);
    }

    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testsumarDosNum() {
        int resultado = casio.sumar(8,9);
        assertEquals(17, resultado);
    }

    @Test
    public void testRestarDosNum() {
        int resultado = casio.restar(9,6);
        assertEquals(3, resultado);
    }

    @Test
    public void testRestaNegativa() { 
        int resultado = casio.restar(6,9);
        assertEquals(-3, resultado);
    }

    @Test
    public void testVerificarLimites() {
        casio.setNuevosLimites(-10, 10);
        assertEquals(10, casio.getMáximo());
        assertEquals(-10, casio.getMínimo());
    }
    
    @Test
    public void testSumaLimiteSuperior() {
        try {
            casio.sumar(casio.getMáximo()+1,0);
            fail("Excede los limites");
        } catch(RuntimeException e) {
            //
        }
    }

    @Test
    public void testRestaLímiteMínimo() {
        try {
            int resultado =casio.restar(30,220);
            fail("Excede los limites >_<");
        } catch(Exception err) {
            //
        }
    }
    

    @Test
    public void testValidacionParametroInferior() {
        try {
            casio.validarParámetros(casio.getMáximo()+1,casio.getMínimo()-1);
            fail("Excede los limites");
        } catch(RuntimeException e) {
            //
        }
    }
    
}