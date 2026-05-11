package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int senhaCofre = 1234;
        int senha;
        int contador = 0;

        do {
            System.out.println("Digente a senha: ");
            senha = scanner.nextInt();
            if (senha == senhaCofre){
                System.out.println("Cofre aberto");
                break;
            }
            contador++;

        }while (contador != 3);
    }
}
