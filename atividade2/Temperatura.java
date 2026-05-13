import java.util.Scanner;

public class Temperatura{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperratura do corpo");
        float temp = scan.nextFloat();

        if(temp > 37){
            System.out.print("esta com febre");
        }
        else{
            System.out.print("sua temperatura esta normal");
        }
        scan.close();
    }
}