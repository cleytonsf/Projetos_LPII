public class Teste{
    public static void main(String[] args){

        Produto produto1 = new Produto("Celular", 10000.00, 100);
        Produto produto2 = new Produto("Capinha", 100.00, 50);
        Produto produto3 = new Produto("Carregador", 500.00, 10);
        Produto produto4 = new Produto("Teste Invalido", -1264.00, -234);

        System.out.println("\n--- LISTA DE PRODUTOS ---");
        
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d%n", produto1.getNome(), produto1.getPreco(), produto1.getQuantEstoque());
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d%n", produto2.getNome(), produto2.getPreco(), produto2.getQuantEstoque());
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d%n", produto3.getNome(), produto3.getPreco(), produto3.getQuantEstoque());
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d%n", produto4.getNome(), produto4.getPreco(), produto4.getQuantEstoque());


        System.out.printf("%n--- INFORMAÇÕES ---%n");

        System.out.printf("Valor total em estoque do %s: R$ %.2f%n", produto1.getNome(), produto1.calcularValorEstoque());
        System.out.printf("Total de produtos cadastrados: %d%n", Produto.getQuantProdutoTotal());
    }
}