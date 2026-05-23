public class Televisao{
    int tamanho;
    int volume;
    String marca;
    int voltagem;
    int canal;


    public Televisao(String marca, int tamanho, int voltagem, int canal){
        this.volume = 5;
        this.marca = marca;
        this.tamanho = tamanho;
        this.voltagem = voltagem;
        this.canal = canal;
    }

    public void ligar(){
       int consumo = voltagem * tamanho;
       System.out.println(consumo);
    }

    public void desligar(){
        System.out.println("desligando");
    }

    public void aumentarVolume(){
        if(volume <= 9){
            this.volume++;
        }
    }

    public void diminuirVolume(){
        if(volume > 1){
            this.volume--;
        }
    }

    public void passarCanal(){
        this.canal++;
    }

    public void voltarCanal(){
        this.canal--;
    }
    
}