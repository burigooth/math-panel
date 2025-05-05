package view.components;

import operation.CalculateAction;
import view.SkeletonComponent;

public class XInYPercentage extends SkeletonComponent{
	public XInYPercentage() {
        super(
            "Total (a)", 
            "Porcentagem (b)", 
            "Corresponde a",
            "v = (a * b) / 100",
        	CalculateAction::getXInYPercentage
        );
    }

    @Override
    protected String getCardTitle() {
        return "Amostragem - Quanto X% representa de Y";
    }
}
