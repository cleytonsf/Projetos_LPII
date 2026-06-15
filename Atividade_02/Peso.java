import java.util.Scanner;

public class Peso{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float peso, altura;

        System.out.print("digite seu peso");
        peso = scan.nextFloat();

        System.out.print("digite sua altura");
        altura = scan.nextFloat();

        float imc = peso/(altura * altura);

        if(imc > 30){
            System.out.print("Obeso");
        }
        else{
            System.out.print("normal");
        }

        scan.close();
    }
}