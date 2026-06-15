import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        Funcionario fun1 = new FuncionarioHorista("Paulo", "123.456.789-00", 160, 25);
        listaFuncionarios.add(fun1);

        Funcionario fun2 = new FuncionarioMensalista("João", "987.677.999-11", 4500);
        listaFuncionarios.add(fun2);

        Funcionario fun3 = new FuncionarioHorista("Carlos", "222.554.789-22", 80, 30);
        listaFuncionarios.add(fun3);


        System.out.println("--- Folha de Pagamento ---");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Funcionário: " + funcionario.nome);
            System.out.println("CPF: " + funcionario.cpf);
            System.out.printf("Pagamento: R$ %.2f\n", funcionario.calcularPagamento());
            System.out.println("--------------------------");
        }
    }
}