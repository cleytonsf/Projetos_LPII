import java.util.Scanner;

public class SomaSub{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int val1, val2, resul;

        System.out.println("digite um valor");
        val1 = scan.nextInt();
        
        System.out.println("digite um valor");
        val2 = scan.nextInt();

        resul = val1 + val2;

        if(resul >= 10){
            resul += 5;
            System.out.println(resul);
        }
        else{
            resul -= 7;
            System.out.println(resul);
        }

        scan.close();
    }
}