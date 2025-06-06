package classesObjetos.agendaContatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final int MAX_CONTATOS = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> agenda = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Agenda de Contatos ---");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Todos os Contatos");
            System.out.println("3. Buscar Contato por Nome");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (agenda.size() >= MAX_CONTATOS) {
                        System.out.println("Agenda cheia, não foi possível adicionar mais contatos.");
                        break;
                    }

                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Digite o email: ");
                    String email = sc.nextLine();

                    agenda.add(new Contato(nome, telefone, email));
                    System.out.println("Contato adicionado com sucesso");
                    break;

                case 2:
                    if (agenda.isEmpty()) {
                        System.out.println("A agenda está vazia.");
                    } else {
                        System.out.println("\n--- Lista de Contatos ---");
                        for (Contato contato : agenda) {
                            System.out.println(contato);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato que deseja buscar: ");
                    String nomeBusca = sc.nextLine();
                    boolean encontrado = false;

                    for (Contato contato : agenda) {
                        if (contato.getNome().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("\n--- Contato Encontrado ---");
                            System.out.println("Nome: " + contato.getNome());
                            System.out.println("Telefone: " + contato.getTelefone());
                            System.out.println("Email: " + contato.getEmail());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato com o nome '" + nomeBusca + "' não foi encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando a agenda...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}