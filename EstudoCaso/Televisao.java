public class Televisao{
    int tamanho;
    int volume;
    String marca;
    int voltagem;
    int canal;


    public Televisao(String marca, int tamanho, int voltagem, int canal){
        this.marca = marca;
        this.tamanho = tamanho;
        setVoltagem(voltagem);
        this.canal = canal;
        this.volume = 5;
    }

    public void ligar(){
       int consumo = voltagem * tamanho;
       System.out.printf("A TV foi ligada! %nConsumo estimado: %d%n", consumo);
    }

    public void desligar(){
        System.out.println("A TV foi desligada.");
    }

    public void aumentarVolume(){
        if(volume <= 9){
            this.volume++;
            System.out.println("Volume: " + this.volume);
        }
    }

    public void diminuirVolume(){
        if(volume > 1){
            this.volume--;
            System.out.println("Volume: " + this.volume);
        }
    }

    public void passarCanal(){
        this.canal++;
        System.out.println("Canal atual: " + this.canal);
    }

    public void voltarCanal(){
        if(this.canal > 1){
            this.canal--;
            System.out.println("Canal atual: " + this.canal);
        }
    }

    public void setVoltagem(int voltagem) {
        if (voltagem == 110 || voltagem == 220) {
            this.voltagem = voltagem;
        }else{
            System.out.println("Erro: Voltagem inválida. Use 110 ou 220");
        }
    }
    
}