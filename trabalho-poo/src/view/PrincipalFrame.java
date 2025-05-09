package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

import view.components.ApplyDiscount;
import view.components.CalculateDiscountWithValues;
import view.components.CalculateInicialValueWithoutDiscount;
import view.components.DeltaVariation;
import view.components.GeneratePasswordPanel;
import view.components.IncrementValue;
import view.components.XInYPercentage;
import view.components.XInYValue;
import view.components.CalculateRuleOfThree;

public class PrincipalFrame {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Teste de Componentes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(0, 3, 10, 10));

            frame.add(new ApplyDiscount());
            frame.add(new IncrementValue());
            frame.add(new XInYPercentage());
            frame.add(new XInYValue());
            frame.add(new CalculateDiscountWithValues());
            frame.add(new DeltaVariation());
            frame.add(new CalculateInicialValueWithoutDiscount());
            frame.add(new CalculateRuleOfThree());
            frame.add(new GeneratePasswordPanel());
            
            frame.setSize(800, 600);
       
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
