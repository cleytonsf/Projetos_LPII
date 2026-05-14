import java.util.Scanner;

public class MaiorValor{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.print("digite um valor");
        num1 = scan.nextInt();        

        System.out.print("digite um valor");
        num2 = scan.nextInt();

        if(num1 > num2){
            System.out.printf("o valor %d e maior", num1);
        }
        else{
            System.out.printf("o valor %d e maior", num2);
        }

        scan.close();
    }
}