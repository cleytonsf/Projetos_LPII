public class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    
    public void setNome(String nome) { 
        this.nome = nome; 
    }
    public String getNome() { 
        return nome; 
    }

    public void setMatricula(String matricula) { 
        this.matricula = matricula; 
    }
    public String getMatricula() { 
        return matricula; 
    }

    
    public void exibirFuncionario() {
        System.out.println("Funcionário: " + nome + " \nMatrícula: " + matricula);
    }
    
}