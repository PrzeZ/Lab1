package mylib;

import org.apache.commons.lang3;


public class Account {
    private String name;

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

}
