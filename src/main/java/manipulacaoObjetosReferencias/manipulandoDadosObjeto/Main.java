package manipulacaoObjetosReferencias.manipulandoDadosObjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int valor = sc.nextInt();

        Numero numero = new Numero(valor);

        System.out.println("O valor do objeto é: " + numero.mostrarValor());
        System.out.println("O endereço de memória do numero é: " + System.identityHashCode(numero));
    }
}
