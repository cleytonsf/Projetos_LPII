public class Gato extends Animal {
    String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public void emitirSom() {
        System.out.println("Miau!");
    }
}