public class Carro{
    String modelo;
    double velocidade;
    double aceleracao;
    int marcha;

    public Carro(String modelo, double velocidade, double aceleracao, int marcha){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
    }

    public void ligar(){
        System.out.println("ligando");
    }

    public void desligar(){
        System.out.println("deslingando");
    }

    public void acelerar(){
        System.out.println("acelerando");
    }

    public void desacelerar(){
        System.out.println("desacelerando");
    }

    public void virarDireita(){
        System.out.println("virando pra direita");
    }

    public void virarEsquerda(){
        System.out.println("virando pra esquerda");
    }

    public void passarMarcha(){
        this.marcha++;
    }

    public void reduzirMacha(){
        this.marcha--;
    }

}