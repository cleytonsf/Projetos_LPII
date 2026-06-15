public class Bicicleta extends Transporte {
    int tamanhoAro;

    public Bicicleta(int capacidade, int tamanhoAro) {
        super(capacidade); 
        this.tamanhoAro = tamanhoAro;
    }

    public void mostrarDetalhes() {
        System.out.println("Bicicleta");
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Tamanho do Aro: " + this.tamanhoAro);
    }
}