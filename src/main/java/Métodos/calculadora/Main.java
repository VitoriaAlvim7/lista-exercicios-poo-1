package Métodos.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        float num1 = sc.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float num2 = sc.nextFloat();

        Calculadora calculadora = new Calculadora(num1, num2);

        while (true) {
            System.out.println("\n===== Menu de Operações =====");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");

            System.out.println("Escolha uma operação: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma: " + calculadora.soma());
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + calculadora.subtracao());
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + calculadora.multiplicacao());
                    break;
                case 4:
                        System.out.println("Resultado da divisão: " + calculadora.divisao());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
