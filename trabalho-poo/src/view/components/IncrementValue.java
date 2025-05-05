package view.components;

import operation.CalculateAction;
import view.SkeletonComponent;

public class IncrementValue extends SkeletonComponent{
	public IncrementValue() {
        super(
            "Valor inicial R$ (a)", 
            "% acréscimo (b)", 
            "Resultado",
            "v = a + (a * (b /100))",
        	CalculateAction::incrementValue
        );
    }

    @Override
    protected String getCardTitle() {
        return "Incrementar % a um valor";
    }
}
