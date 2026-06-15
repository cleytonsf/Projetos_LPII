import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Professor("Cleber", "111.222.333-44", "Linguagem de Programação II"));
        pessoas.add(new Aluno("Mariana", "555.666.777-88", "2345"));
        pessoas.add(new Aluno("Rodrigo", "999.888.777-66", "1990"));

        System.out.println(" Cadastro de Pessoas ");
        System.out.println("---------------------------------------");

        for (Pessoa pessoa : pessoas) {
            pessoa.exibirDados();
            System.out.println("---------------------------------------");
        }
    }
}