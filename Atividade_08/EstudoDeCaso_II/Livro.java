public class Livro extends ItemBiblioteca {
    String autor;

    public Livro(String titulo, String codigo, String autor) {
        super(titulo, codigo); 
        this.autor = autor;
    }


    public void exibirInformacoes() {
        System.out.println("Livro");
        System.out.println("Título: " + this.titulo);
        System.out.println("Código: " + this.codigo);
        System.out.println("Autor: " + this.autor);
    }
}