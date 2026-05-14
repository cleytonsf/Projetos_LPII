import java.util.Scanner;

public class Salario{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float salario, valorH, Num_aulas, inss;

        System.out.print("digite o valor por hora");
        valorH = scan.nextFloat();

        System.out.print("digite o numero de aulas");
        Num_aulas = scan.nextFloat();

        System.out.print("digite o descondo inss");
        inss = scan.nextFloat();


        salario = (valorH * Num_aulas) - (inss/100);


        System.out.print("salario = " + salario);

        scan.close();
    }
}
