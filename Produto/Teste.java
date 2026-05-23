public class Teste{
    public static void main(String[] args){

        Produto produto1 = new Produto("celular", 10000, 100);
        Produto produto2 = new Produto("capinha", 100, 50);
        Produto produto3 = new Produto("carregador", 500, 10);
        Produto produto4 = new Produto("test", -1264, -234);

        System.out.printf("%nnome: %s %npreco: %.2f %nquantidade: %d", produto1.getNome(), produto1.getPreco(), produto1.getQuantidadeEstoque());
        System.out.printf("%nnome: %s %npreco: %.2f %nquantidade: %d", produto2.getNome(), produto2.getPreco(), produto2.getQuantidadeEstoque());
        System.out.printf("%nnome: %s %npreco: %.2f %nquantidade: %d", produto3.getNome(), produto3.getPreco(), produto3.getQuantidadeEstoque());

        System.out.printf("%nnome: %s %npreco: %.2f %nquantidade: %d", produto4.getNome(), produto4.getPreco(), produto4.getQuantidadeEstoque());

        System.out.printf("%ntotal valo em estoque do produto 1: %.2f", produto1.calcularValorEstoque());

        System.out.printf("%ntotal de produtos: %d", Produto.quantidadeProduto());
    }
}