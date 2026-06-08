public class Exemplar {
    private int idExemplar;
    private Livro livro; 
    private boolean disponivel;

    public Exemplar(int idExemplar, Livro livro) {
        this.idExemplar = idExemplar;
        this.livro = livro;
        this.disponivel = true;
    }


    public void setIdExemplar(int idExemplar) { 
        this.idExemplar = idExemplar; 
    }
    public int getIdExemplar() { 
        return idExemplar; 
    }

    public void setLivro(Livro livro) { 
        this.livro = livro; 
    }
    public Livro getLivro() { 
        return livro; 
    }

    public void setDisponivel(boolean disponivel) { 
        this.disponivel = disponivel; 
    }
    public boolean disponivel() { 
        return disponivel; 
    }


    public void exibirExemplar() {
        System.out.println("Exemplar #" + idExemplar + " do " + livro.getTitulo());
        System.out.println("status de emprestimo:");
        if(disponivel){
            System.out.println("Disponível");
        } else {
            System.out.println("Emprestado");
        }
    }
    
}