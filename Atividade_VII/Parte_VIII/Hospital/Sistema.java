import java.time.LocalDate;

public class Sistema {
    public static void main(String[] args) {
        System.out.println("         SISTEMA DE GESTÃO HOSPITALAR");
        System.out.println("-------------------------------------------------\n");

        Prontuario prontuario = new Prontuario("99", "Dor no peito", "O+", "Dipirona", "300mg", "Nenhum");
        Paciente paciente = new Paciente("P01", "Pedro Silva", "444.555.666-77", "(75) 98877-0000", "pedro@email.com", prontuario);
        Medico medico = new Medico("M01", "Dr. Carlos Oliveira", "123.456.789-00", "(75) 99999-1111", "carlos@hospital.com", "123456", "Cardiologia");
        Enfermeiro enfermeiro = new Enfermeiro("E01", "Ana Costa", "987.654.321-11", "(75) 98888-4535", "ana@hospital.com", "555555", "Pronto Socorro");


        System.out.println("\n>>> 1. CADASTROS NO SISTEMA <<<");
        medico.exibirPerfil();
        enfermeiro.exibirPerfil();
        paciente.exibirPerfil();


        System.out.println(">>> 2. AGENDAMENTOS DE CONSULTAS <<<\n");

        Consulta c1 = new Consulta(medico, paciente);
        c1.agendarConsulta();
        System.out.println("Agendamento 1: Concluído com Sucesso.");
        c1.exibirDadosConsulta();

        Consulta c2 = new Consulta(medico, paciente);
        c2.agendarConsulta(LocalDate.now().plusDays(2));
        System.out.println("Agendamento 2: Concluído com Sucesso.");
        c2.exibirDadosConsulta();

        Consulta c3 = new Consulta(medico, paciente);
        c3.agendarConsulta(LocalDate.now().plusDays(7), "Trazer exames de sangue atualizados.");
        System.out.println("Agendamento 3: Concluído com Sucesso.");
        c3.exibirDadosConsulta();

        System.out.println("\n                FIM DA EXECUÇÃO");
        System.out.println("-------------------------------------------------");
    }
}