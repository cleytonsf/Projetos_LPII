public class Main{
    public static void main(String[] args){

        Carro carro = new Carro("Civic", 0, 20, 1);

        System.out.println("--- TESTANDO O CARRO ---");

        carro.ligar();
        carro.passarMarcha(); 

        carro.acelerar(); 
        carro.passarMarcha(); 
        carro.acelerar(); 

        carro.virarDireita();
        carro.desacelerar(); 

        carro.desacelerar(); 
        carro.reduzirMarcha(); 
        carro.reduzirMarcha(); 
        
        carro.desligar(); 
    }
}