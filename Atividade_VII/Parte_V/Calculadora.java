public class Calculadora {
    private String marca;

    public Calculadora() {

    }

    public Calculadora(String marca) {
        this.marca = marca;
    }

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }


    public int subtrair(int a, int b) {
        return a - b;
    }
    public double subtrair(double a, double b) {
        return a - b;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
}