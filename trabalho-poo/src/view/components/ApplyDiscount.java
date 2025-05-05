package view.components;

import operation.CalculateAction;
import view.SkeletonComponent;

public class ApplyDiscount extends SkeletonComponent {

    public ApplyDiscount() {
        super(
            "Valor inicial R$ (a)", 
            "% desconto (b)", 
            "Preço com desconto",
            "v = a - (a * (b /100))",
        	CalculateAction::calculateDiscount
        );
    }

    @Override
    protected String getCardTitle() {
        return "Aplicar desconto % num valor";
    }
}
