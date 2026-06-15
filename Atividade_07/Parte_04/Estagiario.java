public class Estagiario extends Funcionario {
    private int horasSemanais;

    public Estagiario(String nome, double bolsaAuxilio, int horasSemanais) {
        super(nome, bolsaAuxilio);
        this.horasSemanais = horasSemanais;
    }

    
    public void gerarRelatorio() {
        System.out.println("--- Relatório do Estagiário ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Carga Horária: " + horasSemanais);
    }

}