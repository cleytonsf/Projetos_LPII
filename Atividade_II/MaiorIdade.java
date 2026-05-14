import java.util.Scanner;

public class MaiorIdade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade");
        int idade = scan.nextInt();

        if(idade > 18){
            System.out.println("Voce ja pode ter sua carteira de motorista");
        }
        else{
            System.out.print("voce e de menor");
        }
        scan.close();
    }
}