package manipulacaoObjetosReferencias.trocandoValoresEntreObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor para o objeto A: ");
        int valorA = sc.nextInt();

        System.out.print("Digite o valor para o objeto B: ");
        int valorB = sc.nextInt();

        ValorContainer objA = new ValorContainer(valorA);
        ValorContainer objB = new ValorContainer(valorB);

        System.out.println("Antes da troca:");
        System.out.println("Objeto A: " + objA.getValor());
        System.out.println("Objeto B: " + objB.getValor());

        objA.trocarValor(objA, objB);

        System.out.println("Depois da troca:");
        System.out.println("Objeto A: " + objA.getValor());
        System.out.println("Objeto B: " + objB.getValor());

        sc.close();
    }
}
