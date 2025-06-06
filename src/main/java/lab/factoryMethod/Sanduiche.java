package lab.factoryMethod;

public abstract class Sanduiche {
    public String pao;
    public String queijo;
    public String presunto;
    public String ovo;
    public String tomate;

    public abstract void preparar();

    public void exibirIngredientes() {
        System.out.println("Pão: " + pao);
        System.out.println("Queijo: " + queijo);
        System.out.println("Presunto: " + presunto);
        System.out.println("Ovo: " + ovo);
        System.out.println("Tomate: " + tomate);
        System.out.println("-----------------------------");
    }
}
