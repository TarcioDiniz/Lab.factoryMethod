import lab.factoryMethod.Sanduiche;
import lab.factoryMethod.SanduicheBola;
import lab.factoryMethod.SanduicheFrances;
import lab.factoryMethod.SanduicheIntegral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SanduicheTest {

    @Test

    public void testSanduicheIntegralIngredientes() {
        Sanduiche s = new SanduicheIntegral();

        s.preparar();

        assertEquals("Pão Integral", s.pao);
        assertEquals("Queijo Light", s.queijo);
        assertEquals("Presunto de Frango", s.presunto);
        assertEquals("Ovo de Caipira", s.ovo);
        assertEquals("Tomate", s.tomate);
    }

    @Test

    public void testSanduicheFrancesIngredientes() {
        Sanduiche s = new SanduicheFrances();

        s.preparar();

        assertEquals("Pão Francês", s.pao);
        assertEquals("Queijo Mussarela", s.queijo);
        assertEquals("Presunto de Peru", s.presunto);
        assertEquals("Ovo de Granja", s.ovo);
        assertEquals("Tomate", s.tomate);
    }

    @Test
    public void testSanduicheBolaIngredientes() {
        Sanduiche s = new SanduicheBola();
        s.preparar();
        assertEquals("Pão Bola", s.pao);
        assertEquals("Queijo Cheddar", s.queijo);
        assertEquals("Presunto de Peru", s.presunto);
        assertEquals("Ovo de Capoeira", s.ovo);
        assertEquals("Tomate", s.tomate);
    }
}
