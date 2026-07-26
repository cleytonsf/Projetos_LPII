public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Luiz", "LPII01");
        Professor professor = new Professor("Maria Eduarda", "LPII02");
        Coordenador coordenador = new Coordenador("Yoda", "LPII03");

        System.out.println("--- EXIBINDO DADOS ---");
        aluno.exibirDados();
        professor.exibirDados();
        coordenador.exibirDados();

        System.out.println("\n--- FUNÇÕES ---");
        aluno.realizarMatricula("LPII01");
        professor.ministrarDisciplina("Programação Orientada a Objetos");
        coordenador.aprovarPlanoDeEnsino("Ciência da Computação");

        System.out.println("\n--- TESTANDO AUTENTICAÇÃO ---");
        boolean login = aluno.autenticar("LPII01", "0000");

        System.out.println(login);
    }
}