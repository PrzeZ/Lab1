package pl.lublin.wsei.java.cwiczenia;

import mylib.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("Piotr Gołabek");
        System.out.println(acc.getName());
    }
}
