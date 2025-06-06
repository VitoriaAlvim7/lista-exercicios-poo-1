package manipulacaoObjetosReferencias.trocandoValoresEntreObjetos;

public class ValorContainer {

    private int valor;

    public ValorContainer(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static void trocarValor(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
    }
}
