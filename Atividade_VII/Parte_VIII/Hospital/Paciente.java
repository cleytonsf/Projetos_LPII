public class Paciente extends Pessoa {
    private Prontuario prontuario;

    public Paciente(String id, String nome, String cpf, String telefone, String email, Prontuario prontuario) {
        super(id, nome, cpf, telefone, email);
        this.prontuario = prontuario;
    }

    public Prontuario getProntuario() {
        return this.prontuario;
    }

    public void exibirPerfil() {
        System.out.println("--- Informações do Paciente ---");
        System.out.println("ID: " + getId());
        System.out.println("Nome: "+ getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("E-mail: " + getEmail());
        System.out.println("--- --- --- --- --- --- --- ---\n");
        prontuario.exibirProntuario();
    }

}