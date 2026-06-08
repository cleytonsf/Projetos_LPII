public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando produto1 ---");
        Produto p1 = new Produto();
        p1.exibirDados();

        System.out.println("\n--- Criando produto2 ---");
        Produto p2 = new Produto("Notebook", 3500.00);
        p2.exibirDados();

        System.out.println("\n--- Criando produto3 ---");
        Produto p3 = new Produto("Smartphone", 1234.90, 15);
        p3.exibirDados();
    }
}