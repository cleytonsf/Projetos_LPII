public class Onibus extends Transporte {
    String linha;

    public Onibus(int capacidade, String linha) {
        super(capacidade);
        this.linha = linha;
    }

    public void mostrarDetalhes() {
        System.out.println("Ônibus");
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Linha: " + this.linha);
    }
}