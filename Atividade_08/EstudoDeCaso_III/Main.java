import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimais = new ArrayList<>();

        listaAnimais.add(new Cachorro("Rex", 3, "Pastor Alemão"));
        listaAnimais.add(new Gato("Mingau", 2, "Laranja"));
        listaAnimais.add(new Ave("Loro", 1, "Papagaio"));

        System.out.println(" ANIMAIS ");
        System.out.println("---------------------------");

        for (Animal animal : listaAnimais) {
            System.out.println("Nome: " + animal.nome);
            System.out.println("Idade: " + animal.idade + " anos");
            
            animal.emitirSom(); 
            
            System.out.println("---------------------------");
        }
    }
}