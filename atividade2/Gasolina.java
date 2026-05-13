import java.util.Scanner;

public class Gasolina{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("quantos km para o distino?");
        float km = scan.nextFloat();

        float quant_litros = km/12;

        System.out.printf("km rodados: %f %ngasolina necessaria: %f%n", km, quant_litros);

        scan.close();
    }

}