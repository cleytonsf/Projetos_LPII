public abstract class Funcionario{
    protected String matricula;
    protected String nome;
    protected double salario;

    public abstract double calcularSalario();

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}