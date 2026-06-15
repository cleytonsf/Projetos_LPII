public class App {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("Alice", null, "Bob", null, "Charlie", null);

        System.out.println("--- Saldo Inicial ---");
        exibirSaldos(meuBanco, "Alice", "Bob", "Charlie");

        System.out.println("\n--- Realizando Depósitos ---");
        meuBanco.creditar("Alice", 1000.00);
        meuBanco.creditar("Bob", 500.00);
        exibirSaldos(meuBanco, "Alice", "Bob", "Charlie");

        System.out.println("\n--- Realizando Débitos ---");
        meuBanco.debitar("Alice", 200.00);
        meuBanco.debitar("Charlie", 50.00); 
        exibirSaldos(meuBanco, "Alice", "Bob", "Charlie");

        System.out.println("\n--- Transferindo R$ 300,00 de Alice para Bob ---");
        meuBanco.transferir("Alice", "Bob", 300.00);
        exibirSaldos(meuBanco, "Alice", "Bob", "Charlie");
    }


    private static void exibirSaldos(Banco banco, String c1, String c2, String c3) {
        System.out.printf("Saldo de %s: R$ %.2f%n", c1, banco.getSaldo(c1));
        System.out.printf("Saldo de %s: R$ %.2f%n", c2, banco.getSaldo(c2));
        System.out.printf("Saldo de %s: R$ %.2f%n", c3, banco.getSaldo(c3));
    }
}