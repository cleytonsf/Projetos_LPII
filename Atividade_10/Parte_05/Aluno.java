public class Aluno extends Pessoa {

    public Aluno(String nome, String matricula) {
        super(nome, matricula);
    }

    public void realizarMatricula(String matricula) {
        if(this.matricula.equals(matricula)){
            System.out.println("Aluno " + getNome() + " realizou matrícula na disciplina.");
        }
    }

    public void exibirDados() {
        System.out.println("ALUNO"); 
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
    }
}