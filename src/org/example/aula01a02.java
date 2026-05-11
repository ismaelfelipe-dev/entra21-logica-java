package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class aula01a02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cadastro Simples \n");
        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        System.out.print("É um estudante: ");
        System.out.print("Sim(digite 1) || Não(digite 2): ");
        int confirmacao = scanner.nextInt();
        int anoAtual = 2026;
        String estudante = "";
        if (confirmacao == 1) {
            estudante = "Sim";
        } else {
            estudante = "Não";
        }

        System.out.print("Confirme suas informações:\n");
        System.out.print("Nome completo: " + nome + "\n");
        System.out.print("Idade: " + idade + "\n");
        System.out.print("Altura: " + altura + "\n");
        System.out.print("É um estudande: " + estudante + "\n");
        System.out.print("Ano de nascimento: " + (anoAtual - idade));
    }
}
