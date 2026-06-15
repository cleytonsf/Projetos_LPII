public class Analista extends Funcionario {
    private String area;

    public Analista(String nome, double salario, String area) {
        super(nome, salario);
        this.area = area;
    }

    
    public void gerarRelatorio() {
        System.out.println("--- Relatório do Analista ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Área de trabalho: " + area);
        System.out.println("Salario: " + getSalario());
    }

}