package lab.factoryMethod;

public class Main {
    public static void main(String[] args) {
        SanduicheCreator integral = new SanduicheIntegralCreator();
        SanduicheCreator frances = new SanduicheFrancesCreator();
        SanduicheCreator bola = new SanduicheBolaCreator();

        Sanduiche s1 = integral.criarSanduiche();
        Sanduiche s2 = frances.criarSanduiche();
        Sanduiche s3 = bola.criarSanduiche();

        System.out.println("Sanduíche Integral:");
        s1.exibirIngredientes();

        System.out.println("Sanduíche Francês:");
        s2.exibirIngredientes();

        System.out.println("Sanduíche Bola:");
        s3.exibirIngredientes();
    }
}
