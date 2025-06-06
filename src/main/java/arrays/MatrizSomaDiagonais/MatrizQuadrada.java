package arrays.MatrizSomaDiagonais;

public class MatrizQuadrada {

    private int[][] matrizQuadrada;
    private int linhas;
    private int colunas;

    public MatrizQuadrada(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matrizQuadrada = new int[linhas][colunas];
    }

    public void preecherMatriz(int linha, int coluna, int valor) {
        this.matrizQuadrada[linha][coluna] = valor;
    }

    public int calcularSomaDiagonalPrincipal() {
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            soma += matrizQuadrada[i][i];
        }
        return soma;
    }

    public int calcularSomaDiagonalSecundaria() {
        int soma = 0;
        for (int i = 0; i < linhas; i++) {
            soma += matrizQuadrada[i][linhas - 1 - i];
        }
        return soma;
    }

    public void mostrarMatriz() {
        System.out.println("Exibindo a matriz:");
        for(int i = 0; i < this.linhas; i++) {
            for(int j = 0; j < this.colunas; j++) {
                System.out.print(this.matrizQuadrada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
