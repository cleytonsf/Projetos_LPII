import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transporte> tranportes = new ArrayList<>();

        tranportes.add(new Bicicleta(1, 29));
        tranportes.add(new Carro(5, "Fiat"));
        tranportes.add(new Onibus(45, "042"));

        System.out.println(" Gerenciamento de Transportes ");
        System.out.println("------------------------------");

        for (Transporte veiculo : tranportes) {
            veiculo.mostrarDetalhes();
            System.out.println("------------------------------");
        }
    }
}