public class Carro extends Veiculo {
    private String cor;

    public Carro(String marca, int ano, String cor) {
        super(marca, ano); 
        this.cor = cor;
    }

    public void exibirDados() {
        super.exibirDados(); 
        System.out.println("Cor do carro: " + this.cor);
    }
}