public class Main{
    public static void main(String[] args){
        System.out.println("--- Criando e Testando a TV ---");
        Televisao tv = new Televisao("LG", 55, 220, 7);


        tv.ligar(); 
        
        tv.aumentarVolume(); 


        tv.aumentarVolume(); 
        tv.passarCanal();     
        

        tv.desligar();
    }
}