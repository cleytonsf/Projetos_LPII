import java.time.LocalDate;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String status;
    private String observacoes;
    private LocalDate data;


    public Consulta(Medico medico, Paciente paciente,String observacoes, LocalDate data) {
        this.medico = medico;
        this.paciente = paciente;
        this.status = "Agendada";
        this.observacoes = observacoes;
        this.data = data;
    }

    public Consulta(Medico medico, Paciente paciente, LocalDate data) {
        this(medico, paciente, "", data);
    }

    public Consulta(Medico medico, Paciente paciente) {
        this(medico, paciente,"Nenhuma observação", null);
    }

    public Consulta() {
        
    }


    public void agendarConsulta() {
    this.status = "Agendada";
    }

    public void agendarConsulta(LocalDate data) {
        this.data = data;
        this.status = "Agendada";
    }

    public void agendarConsulta(LocalDate data, String observacoes) {
        this.data = data;
        this.observacoes = observacoes;
        this.status = "Agendada";
    }


    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Medico getMedico() {
        return medico;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Paciente getPaciente() {
        return paciente;
    }


    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }


    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public String getObservacoes() {
        return observacoes;
    }


    public void exibirDadosConsulta() {
        System.out.println("----- Dados da Consulta -----");
        System.out.println("Data: " + this.data);   
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico Responsável: " + medico.getNome());
        System.out.println("Status: " + this.status);
        System.out.println("Observações: " + this.observacoes);
        System.out.println("------------------------------\n");
    }

}