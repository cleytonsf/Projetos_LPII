public class ContaCorrente {
    private double saldo = 0.0; 

    public void executarOperacao(Operacao opr) {
        this.saldo += opr.operar();
    }

    public double getSaldo() {
        return this.saldo; 
    }
}