package lab.factoryMethod;

public class SanduicheFrancesCreator extends SanduicheCreator {
    @Override
    public Sanduiche criarSanduiche() {
        Sanduiche sanduiche = new SanduicheFrances();
        sanduiche.preparar();
        return sanduiche;
    }
}
