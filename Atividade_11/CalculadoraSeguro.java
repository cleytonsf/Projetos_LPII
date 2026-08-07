public class CalculadoraSeguro {
    public double calcularSeguro(int idade, double valor) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Idade inválida!, Idade mínima é 18 anos.");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor do veículo deve ser maior que zero!");
        }

        double valorVeiculo = (idade < 25) ? (7 * valor) / 100 : (5 * valor) / 100 ;
        
        return valorVeiculo;
    }
}