public class SistemaMain {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("Antonio", "vermelho");
        Autor autor2 = new Autor("Fernado", "silva");

        
        Livro livro1 = new Livro("Dom Quixote", 1899, autor1);
        Livro livro2 = new Livro("Harry Potter", 1997, autor2);

        
        Exemplar exemplar1 = new Exemplar(1, livro1);
        Exemplar exemplar2 = new Exemplar(2, livro1);
        Exemplar exemplar3 = new Exemplar(3, livro2);

        
        Funcionario func1 = new Funcionario("João", "567");
        Funcionario func2 = new Funcionario("Maria", "234");

       
        Emprestimo emprestimo1 = new Emprestimo("01/06", exemplar1, func1);
        Emprestimo emprestimo2 = new Emprestimo("15/06", exemplar3, func2);

      
        emprestimo1.devolucao();

        emprestimo1.exibirEmprestimo();
        System.out.println("---------------------------");
        emprestimo2.exibirEmprestimo();
        System.out.println("---------------------------");
        System.out.println("Exemplar 1 está disponível? " + exemplar1.disponivel());
        System.out.println("Exemplar 3 está disponível? " + exemplar3.disponivel());
    }
}