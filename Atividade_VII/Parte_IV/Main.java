public class Main {
    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario("Carlos Silva", 3000.0);

        Funcionario func2 = new Gerente("Ana Souza", 8000.0, 2500.0);

        Funcionario func3 = new Analista("Bruno Costa", 4500.0, "TI");

        Funcionario func4 = new Estagiario("Mariana Lima", 1200.0, 30);


        System.out.println("Funcionario 1:"); 
        func1.gerarRelatorio();
        System.out.println(); 

        System.out.println("Funcionario 2:"); 
        func2.gerarRelatorio();
        System.out.println(); 

        System.out.println("Funcionario 3:"); 
        func3.gerarRelatorio();
        System.out.println();

        System.out.println("Funcionario 4:"); 
        func4.gerarRelatorio();
        System.out.println(); 
    }
}