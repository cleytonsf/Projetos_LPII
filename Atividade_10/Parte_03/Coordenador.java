public class Coordenador extends Funcionario {
    private double bonusFixo;

    public Coordenador(String matricula, String nome, double salario, double bonusFixo) {
        super.matricula = matricula;
        super.nome = nome;
        super.salario = salario;
        this.bonusFixo = bonusFixo;
    }

    public double calcularSalario() {
        return getSalario() + bonusFixo;
    }
}