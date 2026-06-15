public class Professor extends Pessoa {
    String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.println("Professor(a)");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Disciplina: " + this.disciplina);
    }
}