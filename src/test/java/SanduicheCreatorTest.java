import lab.factoryMethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SanduicheCreatorTest {

    @Test
    public void testSanduicheIntegralCreator() {
        SanduicheCreator creator = new SanduicheIntegralCreator();
        Sanduiche s = creator.criarSanduiche();
        assertInstanceOf(SanduicheIntegral.class, s);
    }

    @Test
    public void testSanduicheFrancesCreator() {
        SanduicheCreator creator = new SanduicheFrancesCreator();
        Sanduiche s = creator.criarSanduiche();
        assertInstanceOf(SanduicheFrances.class, s);
    }

    @Test
    public void testSanduicheBolaCreator() {
        SanduicheCreator creator = new SanduicheBolaCreator();
        Sanduiche s = creator.criarSanduiche();
        assertInstanceOf(SanduicheBola.class, s);
    }
}
