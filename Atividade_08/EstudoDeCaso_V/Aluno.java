public class Aluno extends Pessoa {
    String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf); 
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Aluno(a)");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Matrícula: " + this.matricula);
    }
}