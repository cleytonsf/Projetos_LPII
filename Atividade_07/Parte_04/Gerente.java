public class Gerente extends Funcionario {
    private double extra;

    public Gerente(String nome, double salario, double extra) {
        super(nome, salario);
        this.extra = extra;
    }

    public void gerarRelatorio() {
        System.out.println("--- Relatório do Gerente ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Base: " + getSalario());
        System.out.println("Bônus: " + extra);
        System.out.println("Total: " + (getSalario() + extra));
    }

}