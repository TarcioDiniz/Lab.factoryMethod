package lab.factoryMethod;

public class SanduicheBolaCreator extends SanduicheCreator {
    @Override
    public Sanduiche criarSanduiche() {
        Sanduiche sanduiche = new SanduicheBola();
        sanduiche.preparar();
        return sanduiche;
    }
}
