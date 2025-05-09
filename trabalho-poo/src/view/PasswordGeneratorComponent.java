package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.*;

public abstract class PasswordGeneratorComponent extends JPanel {

    protected JCheckBox upperCase;
    protected JCheckBox lowerCase;
    protected JCheckBox numbers;
    protected JCheckBox symbols;
    protected JSpinner lengthSpinner;
    protected JButton generateButton;
    protected JTextField result;

    public PasswordGeneratorComponent() {
        setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.GRAY),
            getCardTitle(),
            TitledBorder.CENTER,
            TitledBorder.TOP
        ));

        setLayout(new GridLayout(5, 2, 5, 5));

        upperCase = new JCheckBox("Maiúsculas", true);
        lowerCase = new JCheckBox("Minúsculas", true);
        numbers = new JCheckBox("Números", true);
        symbols = new JCheckBox("Símbolos", true);

        add(upperCase);
        add(lowerCase);
        add(numbers);
        add(symbols);

        add(new JLabel("Tamanho:"));
        lengthSpinner = new JSpinner(new SpinnerNumberModel(8, 1, 100, 1));
        add(lengthSpinner);

        generateButton = new JButton("Gerar");
        add(generateButton);

        add(new JLabel());

        result = new JTextField();
        result.setEditable(false);
        add(result);
        add(new JLabel()); 

        generateButton.addActionListener(e -> {
            int length = (int) lengthSpinner.getValue();
            boolean useUpper = upperCase.isSelected();
            boolean useLower = lowerCase.isSelected();
            boolean useNumbers = numbers.isSelected();
            boolean useSymbols = symbols.isSelected();

            if (!useUpper && !useLower && !useNumbers && !useSymbols) {
                result.setText("Selecione ao menos uma opção.");
                return;
            }

            result.setText(generatePassword(length, useUpper, useLower, useNumbers, useSymbols));
        });
    }

    protected abstract String getCardTitle();

    protected abstract String generatePassword(int length, boolean upper, boolean lower, boolean numbers, boolean symbols);
}
