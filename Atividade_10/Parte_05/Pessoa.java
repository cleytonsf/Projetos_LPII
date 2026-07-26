public abstract class Pessoa implements Interface {
    protected String nome;
    protected String matricula;

    public Pessoa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract void exibirDados();


    public boolean autenticar(String login, String senha) {
        return this.matricula.equals(login) && "0000".equals(senha);
    }
}