package Métodos.palindromos;

public class Palindromo {

    private String texto;

    public Palindromo(String texto) {
        this.texto = texto;
    }
    public boolean isPalindromo() {
        String textoLimpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int tamanho = textoLimpo.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (textoLimpo.charAt(i) != textoLimpo.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
