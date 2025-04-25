package validator;

import java.awt.Color;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class InputValidator {

    public static void validate(JTextField field) {
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                check(field);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                check(field);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                check(field);
            }
        });
    }

    private static void check(JTextField field) {
        String text = field.getText().trim();
        boolean isValid = !text.isEmpty() && text.matches("[0-9.]+");

        if (!isValid) {
            field.setBackground(new java.awt.Color(255, 230, 230)); // vermelho
        } else {
            field.setBackground(Color.WHITE);
        }
    }

 
    public static String getValidationError(JTextField field) {
        String text = field.getText().trim();
        if (text.isEmpty()) return "Campo vazio";
        if (!text.matches("[0-9.]+")) return "Apenas números são permitidos";
        return null;
    }
}
