import java.util.Scanner;

public class Gasolina{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("quantos km para o distino?");
        float km = scan.nextFloat();
        System.out.print("quanto eh o litro de gasolina");
        float preco = scan.nextFloat();


        float quant_litros = km/12;
        float custo = quant_litros*preco;

        System.out.printf("km rodados: %f %ngasolina necessaria: %f%n custo: %f%n", km, quant_litros, custo);

        scan.close();
    }

}