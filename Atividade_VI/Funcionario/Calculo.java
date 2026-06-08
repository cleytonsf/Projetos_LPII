public class Calculo {
    private double totalSalario;

    public void calcularSalario(double salarioBase, int horasTrabalhadas) {
        this.totalSalario = salarioBase * horasTrabalhadas;
    }

    public double getTotalSalario() {
        return this.totalSalario;
    }
}