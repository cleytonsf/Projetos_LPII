public class Professor extends Funcionario{
    private int horas;
    private double valorHora;
    private double salariofinal;

    public Professor(String matricula, String nome, double salario, int horas, double valorHora) {
        super.matricula = matricula;
        super.nome = nome;
        super.salario = salario;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
        salariofinal = getSalario() + (horas * valorHora);
        return salariofinal;
    }

}