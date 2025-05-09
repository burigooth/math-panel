package operation;

import java.util.Random;

public class GeneratePassword {

    public static String generatePassword(int length, boolean upper, boolean lower, boolean numbers, boolean symbols) {
        StringBuilder chars = new StringBuilder();

        if (upper) chars.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        if (lower) chars.append("abcdefghijklmnopqrstuvwxyz");
        if (numbers) chars.append("0123456789");
        if (symbols) chars.append("!@#$%&*()-_=+");

        if (chars.length() == 0) return "Selecione ao menos uma opção.";

        StringBuilder result = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int idx = rand.nextInt(chars.length());
            result.append(chars.charAt(idx));
        }

        return result.toString();
    }
}
