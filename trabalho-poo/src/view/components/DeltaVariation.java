package view.components;

import operation.CalculateAction;
import view.SkeletonComponent;

public class DeltaVariation extends SkeletonComponent{
	public DeltaVariation() {
		super(
			"Valor inicial (a)",
			"Valor final(b)",
			"Diferença",
			" v = ((b-a)/a) * 100",
			CalculateAction::calculateDeltaVariation
		);
	}
	
	@Override
	protected String getCardTitle() {
		return "Variação Delta (%) - Diferença % entre valores";
	}
}
