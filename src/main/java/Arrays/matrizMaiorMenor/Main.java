package Arrays.matrizMaiorMenor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = sc.nextInt();

        Matriz matriz = new Matriz(linhas, colunas);

        for(int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                int valor = sc.nextInt();
                matriz.preecherMatriz(i, j, valor);
            }
        }
        matriz.mostrarMatriz();

        int maior = matriz.encontrarMaiorElemento();
        int menor = matriz.encontrarMenorElemento();

        System.out.println("O maior elemento da matriz é: " + maior);
        System.out.println("O menor elemento da matriz é: " + menor);
        sc.close();
    }
}
