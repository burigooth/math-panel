package view.components;

import operation.GeneratePassword;
import view.PasswordGeneratorComponent;

public class GeneratePasswordPanel extends PasswordGeneratorComponent {

    public GeneratePasswordPanel() {
        super();
    }

    @Override
    protected String getCardTitle() {
        return "Gerador de Senha";
    }

    @Override
    protected String generatePassword(int length, boolean upper, boolean lower, boolean numbers, boolean symbols) {
        return GeneratePassword.generatePassword(length, upper, lower, numbers, symbols);
    }
}
