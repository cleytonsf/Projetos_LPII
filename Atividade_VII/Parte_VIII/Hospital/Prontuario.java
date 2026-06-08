public class Prontuario {
    private String idProntuario;
    private String problema;
    private String tipoSanguineo;
    private String alergias;
    private String medicamentosEmUso;
    private String historicoCirurgias;

    public Prontuario(String idProntuario, String problema, String tipoSanguineo, String alergias, String medicamentosEmUso, String historicoCirurgias) {
        this.idProntuario = idProntuario;
        this.problema = problema;
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
        this.medicamentosEmUso = medicamentosEmUso;
        this.historicoCirurgias = historicoCirurgias;
    }

    public Prontuario(String idProntuario, String problema) {
        this(idProntuario, problema, "Não informado", "Nenhuma", "Nenhum", "Nenhuma");
    }

    public void setIdProntuario(String idProntuario) {
        this.idProntuario = idProntuario;
    }
    public String getIdProntuario() {
        return this.idProntuario;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }
    public String getProblema() {
        return this.problema;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getAlergias() {
        return alergias;
    }
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentosEmUso() {
        return medicamentosEmUso;
    }
    public void setMedicamentosEmUso(String medicamentosEmUso) {
        this.medicamentosEmUso = medicamentosEmUso;
    }

    public String getHistoricoCirurgias() {
        return historicoCirurgias;
    }
    public void setHistoricoCirurgias(String historicoCirurgias) {
        this.historicoCirurgias = historicoCirurgias;
    }


    public void exibirProntuario() {
        System.out.println("---        PRONTUÁRIO        ---");
        System.out.println("ID Prontuário: " + this.idProntuario);
        System.out.println("Tipo Sanguíneo: " + this.tipoSanguineo);
        System.out.println("Diagnóstico Atual: " + this.problema);
        System.out.println("Alergias Relatadas: " + this.alergias);
        System.out.println("Medicamentos Contínuos: " + this.medicamentosEmUso);
        System.out.println("Histórico Cirúrgico: " + this.historicoCirurgias);
        System.out.println("---------------------------------\n");
    }
}