package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean tentarNovamente = true;

        while (tentarNovamente) {
            int numeroSecreto = (int) (Math.random() * 100) + 1;
            int chuteJogador = 0;
            int input = 0;
            int limite = 10;

            System.out.println("===== JOGO DE ADIVINHACAO =====");
            System.out.println("Voce tera " + limite + " tentativas para acertar o numero, boa sorte.");

            do {
                System.out.println("Tentativa " + (chuteJogador + 1) + "/" + limite);
                input = scanner.nextInt();
                chuteJogador++;

                if (input == numeroSecreto) {
                    System.out.println("Parabéns! Acertou em: " + chuteJogador + " tentativas");
                    break;
                } else if (input < numeroSecreto) {
                    System.out.println("O número está abaixo do correto.");
                } else {
                    System.out.println("O número está a cima do correto.");
                }

                if (chuteJogador == limite) {
                    System.out.println("O número é: " + numeroSecreto);
                }
            } while (chuteJogador < limite);
            System.out.println("Voce deseja jogar novamente?");
            System.out.println("1 - SIM");
            System.out.println("2 - NAO");
            int opt = scanner.nextInt();
            if (opt == 1) {
                System.out.println("COMEÇANDO O JOGO NOVAMENTE");
                tentarNovamente = true;
            } else {
                tentarNovamente = false;
            }
        }
        System.out.println("FIM DE JOGO");

    }
}
