public class Revista extends ItemBiblioteca {
    int edicao;

    public Revista(String titulo, String codigo, int edicao) {
        super(titulo, codigo);
        this.edicao = edicao;
    }

    public void exibirInformacoes() {
        System.out.println("Revista");
        System.out.println("Título: " + this.titulo);
        System.out.println("Código: " + this.codigo);
        System.out.println("Edição: " + this.edicao);
    }
}