public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    
    public void exibirDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
    }
}