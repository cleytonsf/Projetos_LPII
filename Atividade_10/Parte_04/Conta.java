public abstract class Conta implements Operacoes{
    protected String numero;
    protected String titular;
    protected double saldo;

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso na conta " + numero);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }


    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta " + numero);
        } else {
            System.out.println("Saque não realizado: Saldo insuficiente " + numero);
        }
    }


    public void consultarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numero); 
        System.out.println("Saldo Atual: R$ " + saldo);
    }
}
}