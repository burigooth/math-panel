package view.components;

import operation.CalculateAction;
import view.SkeletonComponent;

public class CalculateInicialValueWithoutDiscount extends SkeletonComponent{
	public CalculateInicialValueWithoutDiscount() {
		super(
			"Valor final R$ (a)",
			"% desconto (b)",
			"Valor inicial",
			"v = (a * 100 / (100 - b))",
			CalculateAction::calculateInicialValueWithoutDiscount
		);
	}
	
	@Override
	protected String getCardTitle() {
		return "Qual era o valor original?";
	}
}
