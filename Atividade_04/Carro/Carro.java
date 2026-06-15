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
        System.out.println("desligando");
    }

    public void acelerar(){
        System.out.println("acelerando");
    }

    public void desacelerar(){
        System.out.println("desacelerando");
    }

    public void virarDireita(){
        System.out.println("Virando para a direita..");
    }

    public void virarEsquerda(){
        System.out.println("Virando para a esquerda..");
    }

    public void passarMarcha(){
        if (this.marcha < 6) {
            this.marcha++;
            System.out.println("Marcha passada para: " + this.marcha);
        }
    }

    public void reduzirMarcha(){
        if(this.marcha > 1){
            this.marcha--;
            System.out.println("Marcha reduzida para: " + this.marcha);
        }
    }

}