package main;

import operation.CalculateAction;

public class main {

	public static void main(String[] args) {
		// Calcular desconto
        String desconto = CalculateAction.calculateDiscount(200.0, 10.0);
        System.out.println("Desconto de 10% em R$ 200,00: " + desconto);

        // Incrementar valor
        String acrescimo = CalculateAction.incrementValue(200.0, 10.0);
        System.out.println("Acréscimo de 10% em R$ 200,00: " + acrescimo);

        // Quanto é X% de Y
        String xEmYPercentual = CalculateAction.getXInYPercentage(200.0, 15.0);
        System.out.println("15% de R$ 200,00 é: R$ " + xEmYPercentual);

        // Quanto X é em % de Y
        String xEmYValor = CalculateAction.getXInYValue(500.0, 100.0);
        System.out.println("R$ 100,00 é quantos % de R$ 500,00? " + xEmYValor);

        // Calcular desconto com valores reais
        String descontoComValores = CalculateAction.calculateDiscountWithValues(250.0, 200.0);
        System.out.println("Desconto de R$ 250,00 para R$ 200,00: " + descontoComValores);

        // Variação percentual entre dois valores
        String variacao = CalculateAction.calculateDeltaVariation(150.0, 200.0);
        System.out.println("Variação de R$ 150,00 para R$ 200,00: " + variacao);

        // Valor inicial antes do desconto
        String valorInicial = CalculateAction.calculateInicialValueWithoutDiscount(80.0, 20.0);
        System.out.println("Valor original antes do desconto de 20% que resultou em R$ 80,00: R$ " + valorInicial);

        // Regra de três
        String regraDeTres = CalculateAction.calculateRuleOfThree(50.0, 100.0, 25.0);
        System.out.println("Regra de três (50 está para 100, assim como 25 está para X): " + regraDeTres);
	}

}
