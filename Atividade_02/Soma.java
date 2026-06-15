import java.util.Scanner;

public class Soma{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int soma, val1, val2;

        System.out.print("digiite um valor ");
        val1 = scan.nextInt();
        System.out.print("digite um valor");
        val2 = scan.nextInt();
        
        soma = val1 + val2;

        if(soma > 10){
            System.out.println(soma);
        }
    
        scan.close();
    }
}