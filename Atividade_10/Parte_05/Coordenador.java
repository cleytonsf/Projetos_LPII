public class Coordenador extends Pessoa {

    public Coordenador(String nome, String matricula) {
        super(nome, matricula);
    }

    public void aprovarPlanoDeEnsino(String curso) {
        System.out.println("Coordenador " + getNome() + " aprovou o plano de ensino.");
        System.out.println(curso);
    }

    public void exibirDados() {
        System.out.println("COORDENADOR");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
    }
}