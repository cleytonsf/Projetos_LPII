import java.util.Scanner;

public class HoraTrabalho{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantas horas de trabalho");
        float horas = scan.nextFloat();

        float salario = horas * 20;

        System.out.printf("O resultado eh %f", salario);

        scan.close();
    }
}