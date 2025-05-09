package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.*;

import validator.InputValidator;

public abstract class RuleOfThreeComponent extends JPanel {

    protected JTextField input1;
    protected JTextField input2;
    protected JTextField input3;
    protected JButton calculateButton;
    protected JTextField result;
    protected JLabel formula;
    
    // Serve para passar minha função estática para o construtor
    @FunctionalInterface
    public interface Calculation {
        String apply(double a, double b, double r1);
    }
    
    public RuleOfThreeComponent(String label1, String label2, String label3, String resultLabel, String formula, Calculation calculation) {
        setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.GRAY),
            getCardTitle(), 
            TitledBorder.CENTER,
            TitledBorder.TOP
        ));

        setLayout(new GridLayout(3, 2, 5, 5)); 

        add(new JLabel(label1));
        input1 = new JTextField();
        InputValidator.validate(input1);
        add(input1);

        add(new JLabel(label2));
        input2 = new JTextField();
        InputValidator.validate(input2);
        add(input2);
        
        add(new JLabel(label3));
        input3 = new JTextField();
        InputValidator.validate(input3);
        add(input3);

        add(new JLabel(resultLabel));
        result = new JTextField();
        result.setEditable(false);
        add(result);
        
        this.formula = new JLabel(formula);
        add(this.formula);


        calculateButton = new JButton("Calcular");
        add(calculateButton);
        
        calculateButton.addActionListener(e -> {
            String error1 = InputValidator.getValidationError(input1);
            String error2 = InputValidator.getValidationError(input2);
            String error3 = InputValidator.getValidationError(input3);

            if (error1 != null || error2 != null || error3 != null) {
            	result.setText(error1 != null ? error1 : error2 != null ? error2 : error3);
                return;
            }

            double a = Double.parseDouble(input1.getText());
            double b = Double.parseDouble(input2.getText());
            double r1 = Double.parseDouble(input2.getText());

            result.setText(calculation.apply(a, b, r1));
        });
        add(calculateButton);
    }

    protected abstract String getCardTitle();
}
