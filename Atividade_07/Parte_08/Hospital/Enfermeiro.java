public class Enfermeiro extends Pessoa {
    private String coren;
    private String setor;


    public Enfermeiro(String id, String nome, String cpf, String telefone, String email, String coren, String setor) {
        super(id, nome, cpf, telefone, email);
        this.coren = coren;
        this.setor = setor;
    }

    public Enfermeiro(String id, String nome, String cpf) {
        super(id, nome, cpf);
        this.coren = "Nao informado";
        this.setor = "nao informado";
    }
    

    public void setCoren(String coren) {
        this.coren = coren;
    }
    public String getCoren() {
        return this.coren;
    }


    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return this.setor;
    }

    public void exibirPerfil() {
        System.out.println("--- Informações do Enfermeiro ---");
        System.out.println("ID: " + getId());
        System.out.println("Nome: "+ getNome());
        System.out.println("COREN: " + this.coren);
        System.out.println("Setor de Atuação: " + this.setor);
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("E-mail: " + getEmail());
        System.out.println("--- --- --- --- --- --- --- ---\n");
    }
    
}