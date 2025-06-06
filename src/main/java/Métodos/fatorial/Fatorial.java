package Métodos.fatorial;

public class Fatorial {

    private int numero;

    public Fatorial(int numero) {
        this.numero = numero;
    }

    public long calcularFatorial() {
        if (numero == 0) {
            return 1;
        }
        long fator = 1;
        for (int i = 1; i <= numero; i++) {
            fator *= i;
        }
        return fator;
    }
}