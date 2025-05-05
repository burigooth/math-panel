package view.components;

import operation.CalculateAction;
import view.SkeletonComponent;

public class CalculateDiscountWithValues extends SkeletonComponent{
	public CalculateDiscountWithValues() {
		super(
			"Valor original (a)",
			"Valor c/desconto (b)",
			"desconto",
			"v = ((a - b) / a) * 100",
			CalculateAction::calculateDiscountWithValues
		);
	}
	
	@Override
	protected String getCardTitle() {
		return "Valor era A e paguei B, qual foi o desconto %?";
	}
}
