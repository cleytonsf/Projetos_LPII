public class Main {
    public static void main(String[] args) {
        
        Calculadora calc1 = new Calculadora(); 
        Calculadora calc2 = new Calculadora("Cientifica"); 

        System.out.println("Calculadora 1 - Marca: " + calc1.getMarca());
        System.out.println("Calculadora 2 - Marca: " + calc2.getMarca());
        System.out.println("----------------------------------------");

        
        System.out.println("Soma (5 + 3): " + calc2.somar(5, 3));
        System.out.println("Soma (5.5 + 3.2): " + calc2.somar(5.5, 3.2));
        System.out.println("----------------------------------------");


        System.out.println("Subtração (10 - 4): " + calc2.subtrair(10, 4));
        System.out.println("Subtração (10.5 - 4.2): " + calc2.subtrair(10.5, 4.2));
    }
}