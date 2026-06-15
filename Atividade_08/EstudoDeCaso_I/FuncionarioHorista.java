public class FuncionarioHorista extends Funcionario {
    int horasTrabalhadas;
    float valorHora;

    public FuncionarioHorista(String nome, String cpf, int horasTrabalhadas, float valorHora) {
        super(nome, cpf); 
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public float calcularPagamento() {
        return this.horasTrabalhadas * this.valorHora;
    }
}