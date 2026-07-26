public class Main {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA BANCÁRIO ---\n");

        ContaCorrente corrente = new ContaCorrente("2018", "Mario", 1000.0);
        ContaPoupanca poupanca = new ContaPoupanca("2022", "Tintin", 500.0);
        ContaInvestimento investimento = new ContaInvestimento("2026", "Gabriela", 2000.0);

        System.out.println("--- Conta Corrente ---");
        corrente.consultarSaldo();
        corrente.depositar(250.0);
        corrente.sacar(100.0);
        corrente.consultarSaldo();

        System.out.println("%n--- Conta Poupança ---");
        poupanca.consultarSaldo();
        poupanca.sacar(600.0); 
        poupanca.depositar(150.0);

        System.out.println("%n--- Conta Investimento ---");
        investimento.consultarSaldo();
        investimento.renderJuros(5.0); 
        investimento.consultarSaldo();
    }
}