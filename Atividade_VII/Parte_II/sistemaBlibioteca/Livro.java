public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Autor autor; 

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }
    public String getTitulo() { 
        return titulo; 
    }
    
    public void setAnoPublicacao(int anoPublicacao) { 
        this.anoPublicacao = anoPublicacao; 
    }
    public int getAnoPublicacao() { 
        return anoPublicacao; 
    }
    
    public void setAutor(Autor autor) { 
        this.autor = autor; 
    }
    public Autor getAutor() { 
        return autor; 
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor.getNome() + " " + this.autor.getSobrenome());
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
    }


}