public class Pessoa {
    private String id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    
    public Pessoa(String id, String nome, String cpf, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
    
    public Pessoa(String id, String nome, String cpf) {
        this(id, nome, cpf, "sem telefone", "sem email");
    }


    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }


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

    public void exibirPerfil() {
        System.out.println("--- Informações de Pessoa ---");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("E-mail: " + this.email);
        System.out.println("--- --- --- --- --- --- --- ---\n");
    }
}