public class Carro extends Transporte {
    String marca;

    public Carro(int capacidade, String marca) {
        super(capacidade);
        this.marca = marca;
    }

    public void mostrarDetalhes() {
        System.out.println("Carro");
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Marca: " + this.marca);
    }
}