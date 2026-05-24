public class Produto{

    private String nome;
    private double preco;
    private int quant_estoque;

    private static int quant_produto = 0;


    public Produto(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantEstoque(quantidade);
        quant_produto++;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }


    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        }else{
            System.out.printf("Erro no produto %s: %.2f (O preço não pode ser negativo).%n", this.nome, preco);
        }
    }

    public double getPreco(){
        return preco;
    }


    public void setQuantEstoque(int quantidade){
        if(quantidade >= 0){
            this.quant_estoque = quantidade;
        }else{
            System.out.printf("Erro no produto %s: %d (A quantidade em estoque não pode ser negativa.%n", this.nome, quantidade);
        }
    }

    public int getQuantEstoque(){
        return quant_estoque;
    }

    public double calcularValorEstoque(){
       double valorestoque = this.preco * this.quant_estoque;
       return valorestoque;
    }

    public static int getQuantProdutoTotal(){
        return quant_produto;
    }
}
