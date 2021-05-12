package pl.lublin.wsei.java.cwiczenia;

import mylib.Account;

import java.util.Random;


public class Main {


    public static void main(String[] args) {
        final int[] liczby = new int[30];
        Random rnd = new Random();
        for (int i = 0; i < 30; i++) {
            liczby[i] = rnd.nextInt();
        }
        int mx = Integer.MAX_VALUE;
        int mn = Integer.MIN_VALUE;

        long avg = 0;

        for (int l : liczby) {
            System.out.println(l);
            if (l < mn) mn = l;
            if (l > mx) mx = l;
            avg += l;
        }
        System.out.printf("min = %d, max = % d, avg = %f", mn, mx, (float) avg / liczby.length);

        System.out.print("\n" + "\n");

        Account acc = new Account();
        acc.setName("piotr gołabek");
        System.out.println(acc.getName());
        System.out.printf("%s%n", Account.capitalize("stanisŁaw maruSARz"));
        System.out.printf(Account.translit("иван"));
    }
}
