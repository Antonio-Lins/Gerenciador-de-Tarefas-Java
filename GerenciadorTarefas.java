import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    private static ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public static void adicionarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa.getDescricao());
    }

    public static void listarTarefas() {
        System.out.println("\nLista de Tarefas:");
        for (Tarefa tarefa : listaTarefas) {
            tarefa.mostrarDetalhes();
        }
    }

    public static void concluirTarefa(int index) {
        if (index >= 0 && index < listaTarefas.size()) {
            listaTarefas.get(index).concluir();
            System.out.println("Tarefa " + (index + 1) + " concluída.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n1. Adicionar Tarefa Simples");
            System.out.println("2. Adicionar Tarefa com Prazo");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Concluir Tarefa");
            System.out.println("5. Sair");

            // Tratamento para escolha de opção
            boolean opcaoValida = false;
            while (!opcaoValida) {
                try {
                    System.out.print("Escolha uma opção: ");
                    opcao = Integer.parseInt(scanner.nextLine());
                    if (opcao >= 1 && opcao <= 5) {
                        opcaoValida = true;
                    } else {
                        System.out.println("Opção inválida. Escolha um número entre 1 e 5.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número válido.");
                }
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricaoSimples = scanner.nextLine();
                    adicionarTarefa(new TarefaSimples(descricaoSimples));
                    break;
                case 2:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricaoComPrazo = scanner.nextLine();
                    System.out.print("Digite o prazo (AAAA-MM-DD): ");
                    LocalDate prazo = null;
                    boolean dataValida = false;
                    while (!dataValida) {
                        try {
                            prazo = LocalDate.parse(scanner.nextLine());
                            dataValida = true;
                        } catch (DateTimeParseException e) {
                            System.out.println("Data inválida. Digite uma data no formato AAAA-MM-DD.");
                        }
                    }
                    adicionarTarefa(new TarefaComPrazo(descricaoComPrazo, prazo));
                    break;
                case 3:
                    listarTarefas();
                    break;
                case 4:
                    int index = -1;
                    boolean indexValido = false;
                    while (!indexValido) {
                        try {
                            System.out.print("Digite o número da tarefa para concluir: ");
                            index = Integer.parseInt(scanner.nextLine());
                            if (index > 0 && index <= listaTarefas.size()) {
                                indexValido = true;
                            } else {
                                System.out.println("Número inválido. Escolha um número entre 1 e " + listaTarefas.size() + ".");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Digite um número válido.");
                        }
                    }
                    concluirTarefa(index - 1);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}
