package org.example;

import java.util.Scanner;

public class Aula08 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabuada do " + i);

            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }

        int linha = 5;
        for (int i = 1; i <= linha; i++) {
            for (int j = 1; j <= linha - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();
        int teste = 0;
        for (int i = 1; i <= n; i++) {
            teste = teste + i;
        }
        System.out.println(teste);
    }
}
