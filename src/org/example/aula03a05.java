package org.example;

import java.util.Scanner;

public class aula03a05 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Calculo a ser feito:\n" +
                "Soma (digite 1)\n" +
                "Subtracao (digite 2)\n" +
                "Multiplicacao (digite 3)\n" +
                "Divisao (digite 4)\n");
        int calculos = scanner.nextInt();
        System.out.println("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        //System.out.print("Resultado " + (primeiroNumero+segundoNumero));

        double resultado;

        switch (calculos) {
            case 1: resultado = primeiroNumero + segundoNumero;
                System.out.println("A soma dos numeros: "+ primeiroNumero + " + " + segundoNumero + " = " + resultado);
                break;
            case 2: resultado = primeiroNumero - segundoNumero;
                System.out.println("A subtracao dos numeros: "+ primeiroNumero + " - " + segundoNumero + " = " + resultado);
                break;
            case 3: resultado = primeiroNumero / segundoNumero;
                System.out.println("A multiplicacao dos numeros: "+ primeiroNumero + " / " + segundoNumero + " = " + resultado);
                break;
            case 4: resultado = primeiroNumero * segundoNumero;
                System.out.println("A divisao dos numeros: "+ primeiroNumero + " X " + segundoNumero + " = " + resultado);
                break;
        }

    }
}