public class ContaInvestimento extends ContaBancaria {
    private double rendimento

    public ContaInvestimento(String numero, String titular, double saldo) {
        super.numero = numero;
        super.titular = titular;
        super.saldo = saldo;
    }


    public void renderJuros(double taxaPercentual) {
        if (taxaPercentual > 0) {
            rendimento = saldo * (taxaPercentual / 100);
            saldo += rendimento;
            
            System.out.println("Rendimento de " + taxaPercentual + "% aplicado, Saldo aumentou em R$ " + rendimento);
        } else {
            System.out.println("Taxa de juros inválida.");
        }
    }
}