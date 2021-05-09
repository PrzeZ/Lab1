package mylib;

import org.apache.commons.lang3.*;


public class Account {
    private String name;

    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "i", "ji", "j",
            "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c",
            "ch", "sh", "shh", "'", "ju", "ja"};

    public void setName(String name) {
        String[] tokens = StringUtils.split(name);
        for (int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        this.name = StringUtils.join(tokens, ' ');

    }

    public String getName() {
        return name;
    }

    public static String capitalize(String aStr) {
        String[] tokens = StringUtils.split(aStr);
        for (int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens, ' ');
    }

    public static String translit(String arg) {

        String[] tokens = StringUtils.split(arg);
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = tokens[i].toLowerCase();
            char ch = arg.charAt(i);
            int index = StringUtils.indexOf(ch);
            tokens[i] = ukrAlphabet.charAt(i);
        }

        return StringUtils.join(tokens, ' ');

    }

}
