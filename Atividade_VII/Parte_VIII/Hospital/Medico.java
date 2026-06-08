public class Medico extends Pessoa {
    private String crm;
    private String especialidade;


    public Medico(String id, String nome, String cpf, String telefone, String email, String crm, String especialidade) {
        super(id, nome, cpf, telefone, email);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Medico(String id, String nome, String cpf) {
        super(id, nome, cpf);
        this.crm = "Não informado";
        this.especialidade = "Geral";
    }
   
   
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getCrm() {
        return this.crm;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return this.especialidade;
    }

    public void exibirPerfil() {
        System.out.println("--- Informações do Medico ---");
        System.out.println("ID: " + getId());
        System.out.println("Nome: "+ getNome());
        System.out.println("CRM: " + this.crm);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("E-mail: " + getEmail());
        System.out.println("--- --- --- --- --- --- --- ---\n");
    }

}