public class Tecnico extends Funcionario {
    private double adicionalInsalubridade;

    public Tecnico(String matricula, String nome, double salario, double adicionalInsalubridade) {
        super.matricula = matricula;
        super.nome = nome;
        super.salario = salario;
        this.adicionalInsalubridade = adicionalInsalubridade;
    }

    public double calcularSalario() {
        return getSalario() + adicionalInsalubridade;
    }
}