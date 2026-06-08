public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public Pessoa(String nome, String cpf, String email){
        this(nome, cpf, "sem telefone", email);
    }

    public Pessoa(String nome, String cpf){
        this(nome, cpf, "sem telefone", "sem email");
    }

    public Pessoa() {
        this("sem nome", "sem cpf", "sem telefone", "sem email");
    }

//-------------------------------------------------------------

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return this.telefone;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

}