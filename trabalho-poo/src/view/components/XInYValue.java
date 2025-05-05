package view.components;

import operation.CalculateAction;
import view.SkeletonComponent;

public class XInYValue extends SkeletonComponent{
	public XInYValue() {
		super(
			"Total (a)",
			"Parte (b)",
			"Corresponde a",
			"v = (b / a) * 100;",
			CalculateAction::getXInYValue
		);
	}
	
	@Override
	protected String getCardTitle() {
		return "Amostragem 2 - Quanto X representa de Y";
	}

}
