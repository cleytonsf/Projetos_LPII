import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a idade do condutor: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o valor do veículo: ");
            double valorVeiculo = scanner.nextDouble();

            CalculadoraSeguro calculo = new CalculadoraSeguro();

            double valorSeguro = calculo.calcularSeguro(idade, valorVeiculo);
            System.out.printf("Valor do seguro: R$ %.2f%n", valorSeguro);

        } catch (IdadeInvalidaException | IllegalArgumentException e) {
            System.out.println("Erro ao calcular: " + e.getMessage());
        } finally {
            System.out.println("Processo encerrado.");
            scanner.close();
        }
    }
}