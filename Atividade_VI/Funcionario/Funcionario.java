public class Funcionario {
    public String nome;
    public String cpf;
    public String rg;
    public String dataContratacao;
    
    private int matricula;
    private double salario;
    private double salarioBase;
    private int horasTrabalhadas;

    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = "11/02/2020";
        geraMatricula();

    }

    public void geraMatricula() {
        this.matricula = ++geraMatricula;
    }

    public int getMatricula() {
        return this.matricula;
    }


    public double getSalario() {
        return this.salario;
    }


    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }


    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void calcularSalario() {
        
        Calculo calculo = new Calculo();
        calculo.calcularSalario(this.salarioBase, this.horasTrabalhadas);
        
        this.salario = calculo.getTotalSalario();
    }


    public void imprimirDados() {
        System.out.println("=====================================");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Data de contratação: " + this.dataContratacao);
        System.out.println("Salário Base: R$ " + this.salarioBase);
        System.out.println("Horas trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Salário Total: R$ " + this.salario);
        System.out.println("=====================================\n");
    }

}