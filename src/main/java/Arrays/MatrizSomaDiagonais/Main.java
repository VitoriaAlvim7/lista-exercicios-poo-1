package Arrays.MatrizSomaDiagonais;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = sc.nextInt();

        MatrizQuadrada matrizQuadrada = new MatrizQuadrada(linhas, colunas);

        for(int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                int valor = sc.nextInt();
                matrizQuadrada.preecherMatriz(i, j, valor);
            }
        }
        matrizQuadrada.mostrarMatriz();

        int somaDiagonalPrincipal = matrizQuadrada.calcularSomaDiagonalPrincipal();
        int somaDiagonalSecundaria = matrizQuadrada.calcularSomaDiagonalSecundaria();

        System.out.println("A soma da diagonal principal é: " + somaDiagonalPrincipal);
        System.out.println("A soma da diagonal secundária é: " + somaDiagonalSecundaria);

    }
}
