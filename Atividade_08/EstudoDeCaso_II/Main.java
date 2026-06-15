import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ItemBiblioteca> listaItens = new ArrayList<>();

        ItemBiblioteca livro = new Livro("O caminho de alguma coisa", "01", "Desconhecido");
        listaItens.add(livro);

        ItemBiblioteca revista = new Revista("ModaModa", "52", 450);
        listaItens.add(revista);

        ItemBiblioteca dvd = new DVD("Evidencias", "8", 169);
        listaItens.add(dvd);

        System.out.println(" SISTEMA DA BIBLIOTECA ");
        System.out.println("----------------------------------------------");
        
        for (ItemBiblioteca item : listaItens) {
            item.exibirInformacoes();
            System.out.println("----------------------------------------------");
        }
    }
}