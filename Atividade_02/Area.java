import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double pi = 3.14;
        double area, r;

        System.out.print("digite o valor do raio");
        r = scan.nextDouble();

        area = pi * (r * r);

        System.out.printf("a area eh: %f", area);

        scan.close();
    }
}
