package Métodos.palindromos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase que gostaria de verificar se é um palíndromo:");
        String texto = sc.nextLine();

        Palindromo palindromo = new Palindromo(texto);

        if (palindromo.isPalindromo()) {
            System.out.println("A frase ou palavra é um palíndromo.");
        } else {
            System.out.println("A frase ou palavra não é um palíndromo.");
        }
    }
}
