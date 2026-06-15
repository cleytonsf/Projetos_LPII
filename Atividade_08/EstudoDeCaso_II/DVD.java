public class DVD extends ItemBiblioteca {
    int duracao;

    public DVD(String titulo, String codigo, int duracao) {
        super(titulo, codigo);
        this.duracao = duracao;
    }

    public void exibirInformacoes() {
        System.out.println("DVD");
        System.out.println("Título: " + this.titulo);
        System.out.println("Código: " + this.codigo);
        System.out.println("Duração: " + this.duracao);
    }
}