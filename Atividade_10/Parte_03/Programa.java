public class Programa {
    public static void main(String[] args) {
        Professor prof = new Professor("01", "Cleber Jorge Lira", 3000.00, 20, 70.00);
        Tecnico tec = new Tecnico("02", "Paulo", 3200.00, 500.00);
        Coordenador coord = new Coordenador("03", "Eduardo Costa", 6000.00, 1500.00);

        System.out.println("--- Ficha de Salarios ---");
        System.out.println("-----------------------------------");

        double salarioProf = prof.calcularSalario();
        System.out.printf("%nMatrícula: %s%n", prof.getMatricula());
        System.out.printf("Nome: %s%n", prof.getNome());
        System.out.printf("Salário Final: R$ %.2f%n", salarioProf);

        double salarioTec = tec.calcularSalario();
        System.out.printf("%nMatrícula: %s%n", tec.getMatricula());
        System.out.printf("Nome: %s%n", tec.getNome());
        System.out.printf("Salário Final: R$ %.2f%n", salarioTec);

        double salarioCoord = coord.calcularSalario();
        System.out.printf("%nMatrícula: %s%n", coord.getMatricula());
        System.out.printf("Nome: %s%n", coord.getNome());
        System.out.printf("Salário Final: R$ %.2f%n%n", salarioCoord);

        System.out.println("-----------------------------------");

    }
}