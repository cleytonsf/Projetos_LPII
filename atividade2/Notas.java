import java.util.Scanner;

public class Notas{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        float p1, p2, tr;


        System.out.print("digite a nota da prova 1");
        p1 = scan.nextFloat();

        System.out.print("digite a nota da prova 2");
        p2 = scan.nextFloat();
        
        System.out.print("digite a nota do trabalho");
        tr = scan.nextFloat();

        float media = (p1 + p2 + tr)/3;

        if(media >= 7){
            System.out.print("vc foi aprovado");
        }
        else{
            System.out.print("vc foi reprovado");
        }

        scan.close();
    }
}