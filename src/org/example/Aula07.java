package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 5){
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Calcular media de notas.\n2 - Verificar par ou impar.\n3 - Converter temperatura(C -> F).\n4 - Calculadora Simples.\n5 - Sair.");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 : System.out.println("Digite a primeira nota: ");
                    double primeiraNota = scanner.nextDouble();
                    System.out.println("Digite a segunda nota: ");
                    double segundaNota = scanner.nextDouble();
                    double media = (primeiraNota + segundaNota) / 2;
                    System.out.println("Media: "+media);
                    break;
                case 2 : System.out.println("Digite um numero para verificacao: ");
                    int numImparPar = scanner.nextInt();
                    String verificacao = (numImparPar % 2 == 0)? "Par" : "Impar";
                    System.out.println("Numero digitado e " + verificacao);
                    break;
                case 3 : System.out.println("Digite uma temperatura para conversao: ");
                    double temperatura = scanner.nextDouble();
                    double conversao = temperatura * 1.8 + 32;
                    System.out.println("Temperatura convertida para Fahrenheit: " + conversao);
                    break;
                case 4 : System.out.println(
                        "Calculo a ser feito:\n" +
                                "1 - Soma\n" +
                                "2 - Subtracao\n" +
                                "3 - Multiplicacao\n" +
                                "4 - Divisao\n");
                    int calculos = scanner.nextInt();
                    System.out.println("Digite o primeiro numero: ");
                    double primeiroNumero = scanner.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    double segundoNumero = scanner.nextDouble();
                    double resultado;
                    switch (calculos) {
                        case 1: resultado = primeiroNumero + segundoNumero;
                            System.out.println("A soma dos numeros: "+ primeiroNumero + " + " + segundoNumero + " = " + resultado);
                            break;
                        case 2: resultado = primeiroNumero - segundoNumero;
                            System.out.println("A subtracao dos numeros: "+ primeiroNumero + " - " + segundoNumero + " = " + resultado);
                            break;
                        case 3: resultado = primeiroNumero * segundoNumero;
                            System.out.println("A multiplicacao dos numeros: "+ primeiroNumero + " / " + segundoNumero + " = " + resultado);
                            break;
                        case 4: resultado = primeiroNumero / segundoNumero;
                            System.out.println("A divisao dos numeros: "+ primeiroNumero + " X " + segundoNumero + " = " + resultado);
                            break;
                        default : System.out.println("Informacao invalida");
                    }
                    break;
                case 5 : System.out.println("Saindo do sistema...");
                    break;
                default : System.out.println("Informacao invalida");
            }
        }
    }
}
