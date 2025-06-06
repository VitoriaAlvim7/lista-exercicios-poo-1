package metodos.conversorTemperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura que gostaria de converter: ");
        float temperatura = sc.nextFloat();

        ConversorTemperatura conversor = new ConversorTemperatura(temperatura);

        while(true){
            System.out.println("Escolha a conversão desejada: ");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("0 - Sair");
            int opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Temperatura em Fahrenheit: " + conversor.celsiusParaFahrenheit());
                    break;
                case 2:
                    System.out.println("Temperatura em Celsius: " + conversor.fahrenheitParaCelsius());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
