package Arrays.matrizMaiorMenor;

public class Matriz {

    private int[][]matriz;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int[linhas][colunas];
    }

    public void preecherMatriz(int linha, int coluna, int valor) {
        this.matriz[linha][coluna] = valor;
    }

    public int encontrarMaiorElemento() {
        int maior = matriz[0][0];

        for(int i = 0; i < this.linhas; i++) {
            for(int j = 0; j < this.colunas; j++) {
                if(this.matriz[i][j] > maior) {
                    maior = this.matriz[i][j];
                }
            }
        }
        return  maior;
    }

    public int encontrarMenorElemento() {
        int menor = matriz[0][0];

        for(int i = 0; i < this.linhas; i++) {
            for(int j = 0; j < this.colunas; j++) {
                if(this.matriz[i][j] < menor) {
                    menor = this.matriz[i][j];
                }
            }
        }
        return  menor;
    }

    public void mostrarMatriz() {
        System.out.println("Exibindo a matriz:");
        for(int i = 0; i < this.linhas; i++) {
            for(int j = 0; j < this.colunas; j++) {
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
