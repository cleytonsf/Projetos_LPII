import java.util.Scanner;

public class Salario{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float salario, valorH, Num_aulas, inss;

        System.out.print("digite");
        valorH = scan.nextFloat();

        System.out.print("digite");
        Num_aulas = scan.nextFloat();

        System.out.print("digite");
        inss = scan.nextFloat();


        salario = (valorH * Num_aulas) - inss;


        System.out.print("salario = " + salario);

        scan.close();
    }
}