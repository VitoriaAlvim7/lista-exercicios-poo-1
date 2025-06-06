package metodos.fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial:");
        int numero = sc.nextInt();

        Fatorial fatorial = new Fatorial(numero);
        long resultado = fatorial.calcularFatorial();

        System.out.println("O fatorial do número " + numero + " é: " + resultado);

        sc.close();
    }
}
