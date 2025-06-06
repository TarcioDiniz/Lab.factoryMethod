package lab.factoryMethod;

public class SanduicheFrances extends Sanduiche {
    @Override
    public void preparar() {
        pao = "Pão Francês";
        queijo = "Queijo Mussarela";
        presunto = "Presunto de Peru";
        ovo = "Ovo de Granja";
        tomate = "Tomate";
    }
}
