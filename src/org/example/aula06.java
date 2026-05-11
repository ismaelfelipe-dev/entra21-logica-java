package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class aula06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        System.out.println("Primeira nota: ");
        double primeiraNota = scanner.nextDouble();
        System.out.println("Segunda nota: ");
        double segundaNota = scanner.nextDouble();
        double media = (primeiraNota + segundaNota) / 2;
        String mediaAluno;
        if (media >= 7) {
            mediaAluno = "aprovado";
        } else if (media >= 5) {
            mediaAluno = "recuperacao";
        } else {
            mediaAluno = "reprovado";
        }

        System.out.println("Aluno " + nomeAluno + ", ficou com a media " + media + ", ele esta " + mediaAluno);
        if (mediaAluno.equals("recuperacao")) {
            System.out.println("Nota de recuperacao: ");
            double notaRecuperacao = scanner.nextDouble();
            double mediarecuperacao = 7 - media;
            if (notaRecuperacao >= mediarecuperacao) {
                System.out.println("Nota extra necessaria:" + mediarecuperacao + "\nNota extra atingida: " + notaRecuperacao + "\nStatus: Aprovado");
            } else {
                System.out.println("Nota extra necessaria:" + mediarecuperacao + "\nNota extra atingida: " + notaRecuperacao + "\nStatus: Reprovado");
            }
        }
    }
}
