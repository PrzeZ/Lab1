package pl.lublin.wsei.java.cwiczenia;

import mylib.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("piotr gołabek");
        System.out.println(acc.getName());
        System.out.printf("%s%n", Account.capitalize("stanisŁaw maruSARz"));
        System.out.printf(Account.translit("Юлия"));
    }
}
