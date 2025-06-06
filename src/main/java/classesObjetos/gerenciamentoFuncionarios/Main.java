package classesObjetos.gerenciamentoFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        int proximoId = 1;

        while (true) {
            System.out.println("\n--- Gerenciamento de Funcionários ---");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Calcular Salário Total por Departamento");
            System.out.println("3. Listar Todos os Funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");


            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Departamento: ");
                    String depto = sc.nextLine();

                    funcionarios.add(new Funcionario(nome, proximoId++, salario, depto));
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o departamento para calcular o total de salários: ");
                    String deptoBusca = sc.nextLine();
                    double totalSalarios = 0;

                    for (Funcionario f : funcionarios) {
                        if (f.getDepartamento().equalsIgnoreCase(deptoBusca)) {
                            totalSalarios += f.getSalario();
                        }
                    }
                    System.out.printf("O total de salários do departamento '%s' é: R$ %.2f\n", deptoBusca, totalSalarios);
                    break;

                case 3:
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        System.out.println("\n--- Lista de Funcionários ---");
                        for (Funcionario f : funcionarios) {
                            System.out.println(f);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
