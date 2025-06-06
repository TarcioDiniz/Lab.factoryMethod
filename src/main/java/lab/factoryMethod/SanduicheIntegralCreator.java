package lab.factoryMethod;

public class SanduicheIntegralCreator extends SanduicheCreator {
    @Override
    public Sanduiche criarSanduiche() {
        Sanduiche sanduiche = new SanduicheIntegral();
        sanduiche.preparar();
        return sanduiche;
    }
}
