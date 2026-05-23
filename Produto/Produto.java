public class Produto{
    private String nome;
    private double preco;
    private int quant_estoque;

    public static int quant_produto = 0;

    public Produto(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidadeEstoque(quantidade);
        quant_produto = ++quant_produto;
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

        }
    }

    public double getPreco(){
        return preco;
    }

    public void setQuantidadeEstoque(int quantidade){
        if(quantidade >= 0){
            this.quant_estoque = quantidade;
        }else{

        }
    }

    public int getQuantidadeEstoque(){
        return quant_estoque;
    }

    public double calcularValorEstoque(){
       double valorestoque = preco * quant_estoque;
       return valorestoque;
    }

    public static int quantidadeProduto(){
        return quant_produto;
    }
}
