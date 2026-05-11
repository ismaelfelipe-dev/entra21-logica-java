package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner notasTurma = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int quantidadeAlunos = notasTurma.nextInt();
        notasTurma.nextLine();

        String[] nomeAlunos = new String[quantidadeAlunos];
        double[] primeiraNota = new double[quantidadeAlunos];
        double[] segundaNota = new double[quantidadeAlunos];
        double mediaGeral = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno " + (1+ i) + ": ");
            nomeAlunos[i] = notasTurma.nextLine();
            System.out.println("Digite a primeira nota: ");
            primeiraNota[i] = notasTurma.nextDouble();
            System.out.println("Digite a segunda nota: ");
            segundaNota[i] = notasTurma.nextDouble();
            notasTurma.nextLine();
            double media = (primeiraNota[i] + segundaNota[i]) / 2;
            System.out.println("A média do aluno " + nomeAlunos[i] + " é " + media);
            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            if (primeiraNota[i] > segundaNota[i]) {
                System.out.println("Maior nota do aluno " + nomeAlunos[i] + " é " + primeiraNota[i]);
            } else {
                System.out.println("Maior nota do aluno " + nomeAlunos[i] + " é " + segundaNota[i]);
            }
            if (primeiraNota[i] < segundaNota[i]){
                System.out.println("Menor nota do aluno " + nomeAlunos[i] + " é " + primeiraNota[i]);
            } else {
                System.out.println("Menor nota do aluno " + nomeAlunos[i] + " é " + segundaNota[i]);
            }
            mediaGeral = mediaGeral + media;
        }
        mediaGeral = mediaGeral / quantidadeAlunos;
        System.out.println("A média geral da turma é " + mediaGeral);
    }
}