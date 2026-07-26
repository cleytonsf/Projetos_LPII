public class Professor extends Pessoa {

    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    public void ministrarDisciplina(String disciplina) {
        System.out.println("Professor " + getNome() + " está ministrando a aula.");
        System.out.println(disciplina);
    }

    public void exibirDados() {
        System.out.println("PROFESSOR"); 
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
    }
}