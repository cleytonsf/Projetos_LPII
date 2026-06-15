public class FuncionarioMensalista extends Funcionario {
    float salarioFixo;

    public FuncionarioMensalista(String nome, String cpf, float salarioFixo) {
        super(nome, cpf);
        this.salarioFixo = salarioFixo;
    }

    public float calcularPagamento() {
        return this.salarioFixo;
    }
}