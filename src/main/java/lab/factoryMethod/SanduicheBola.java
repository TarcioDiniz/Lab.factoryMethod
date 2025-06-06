package lab.factoryMethod;

public class SanduicheBola extends Sanduiche {
    @Override
    public void preparar() {
        pao = "Pão Bola";
        queijo = "Queijo Cheddar";
        presunto = "Presunto de Peru";
        ovo = "Ovo de Capoeira";
        tomate = "Tomate";
    }
}
