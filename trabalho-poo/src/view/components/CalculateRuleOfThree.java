package view.components;

import operation.CalculateAction;
import view.RuleOfThreeComponent;

public class CalculateRuleOfThree extends RuleOfThreeComponent{
	public CalculateRuleOfThree() {
		super(
			"A =",
			"R1 =",
			"B =",
			"R2 =",
			"R2 = (R1 * B) / A;",
			CalculateAction::calculateRuleOfThree
		);
	}
	
	@Override
	protected String getCardTitle() {
		return "Regra de três";
	}

}
