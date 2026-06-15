import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("João",30,50);

        f1.rg ="12345678"; 
        f1.cpf ="123456789101";  
        
        f1.calcularSalario();
        f1.imprimirDados();  
        

        
        Funcionario f2 = new Funcionario("Maria",25,40); 

        f2.rg ="12345678";  
        f2.cpf ="123456789101"; 

        f2.calcularSalario();  
        f2.imprimirDados();

    }
}