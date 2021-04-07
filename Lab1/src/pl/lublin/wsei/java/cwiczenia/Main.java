package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        do {
            System.out.print("podaj 1 liczbe");
            num1 = input.nextInt();
            if (num1 == 0) {
                break;
            }

            System.out.print("podaj 2 liczbe");
            num2 = input.nextInt();
            if (num2 == 0) {
                break;
            }
        } while (true);
        System.out.print(num1 + num2);
    }
}
