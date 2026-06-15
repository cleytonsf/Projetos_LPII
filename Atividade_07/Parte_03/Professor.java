public class Professor extends Pessoa {
    private String matricula;

    public Professor(String nome, String cpf, String telefone, String email, String matricula) {
        super(nome, cpf, telefone, email); 
        this.matricula = matricula;
    }

    public Professor(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return this.matricula;
    }

}