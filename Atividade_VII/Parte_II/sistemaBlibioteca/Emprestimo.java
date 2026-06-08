public class Emprestimo {
    private String dataEmprestimo;
    private Exemplar exemplar; 
    private Funcionario funcionario; 

    public Emprestimo(String dataEmprestimo, Exemplar exemplar, Funcionario funcionario) {
        this.dataEmprestimo = dataEmprestimo;
        this.exemplar = exemplar;
        this.funcionario = funcionario;
        exemplar.setDisponivel(false);
    }

    public void setDataEmprestimo(String dataEmprestimo) { 
        this.dataEmprestimo = dataEmprestimo; 
    }
    public String getDataEmprestimo() { 
        return dataEmprestimo; 
    }

    
    public void devolucao() {
        this.exemplar.setDisponivel(true); 
    }


    public void setExemplar(Exemplar exemplar) { 
        this.exemplar = exemplar; 
    }
    public Exemplar getExemplar() { 
        return exemplar; 
    }


    public void setFuncionario(Funcionario funcionario) { 
        this.funcionario = funcionario; 
    }
    public Funcionario getFuncionario() { 
        return funcionario; 
    }


    public void exibirEmprestimo() {
        System.out.println("Empréstimo: " + exemplar.getIdExemplar()); 
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Data: " + dataEmprestimo);
        System.out.println("Esta disponivel: " + exemplar.disponivel());
    }
    
}