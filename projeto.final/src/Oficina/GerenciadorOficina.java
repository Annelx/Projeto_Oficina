package Oficina;

import java.util.Scanner;

import Oficina.lista.ListaCliente;
import Oficina.lista.ListaFuncionario;
import Oficina.lista.ListaServico;

public class GerenciadorOficina {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ListaCliente listaCliente = new ListaCliente();
        ListaFuncionario listaFuncionario = new ListaFuncionario();
        ListaServico listaServico = new ListaServico();

        boolean controlador = true;
        char resposta;

        while (true) {
            do {
                limpaConsole();
                System.out.println("Gerenciador de Oficina");
                System.out.println("\n1 -> Área de cliente\n2 -> Área de funcionário\n3 -> Área de serviço");
                System.out.println("\nEscolha uma opção: ");
                resposta = sc.next().charAt(0);

                switch (resposta) {
                    case '1':
                        areaCliente(listaCliente);
                        break;
                    case '2':
                        areaFuncionario(listaFuncionario);
                        break;
                    case '3':
                        areaServico(listaServico);
                        break;
                    default:
                        opcaoErrada();
                        break;
                }
            } while (controlador);
        }
    }

    public static void pausa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPressione ENTER para continuar...");
        sc.nextLine();
    }

    public static void limpaConsole() {
        int temp = 0;
        while (temp != 100) {
            System.out.println();
            temp++;
        }
    }

    public static void opcaoErrada() {
        limpaConsole();
        System.out.println("Selecione uma opção válida, por favor! =)");
    }

    public static void areaCliente(ListaCliente listaCliente) {
        Scanner sc = new Scanner(System.in);

        boolean controlador = true;
        char resposta;

        do {
            limpaConsole();
            System.out.println("1 -> Cadastrar cliente\n2 -> Remover cliente\n3 -> Exibir cadastro");
            System.out.println("\nEscolha uma opção: ");
            resposta = sc.next().charAt(0);

            switch (resposta) {
                case '1':
                    // Cadastrar cliente
                    limpaConsole();
                    System.out.print(listaCliente.listaAdd());
                    pausa();

                    controlador = false; // Sair do laço

                    break;
                case '2':
                    // Remover cliente
                    if (listaCliente.listaVazia()) {
                        System.out.println("\nLista Vazia!");
                        pausa();
                    } else {
                        System.out.print(listaCliente.listaRemove());
                        pausa();
                    }

                    controlador = false; // Sair do laço
                    break;
                case '3':
                    // Exibir cadastro
                    if (listaCliente.listaVazia()) {
                        System.out.println("\nLista Vazia!");
                        pausa();
                    } else {
                        listaCliente.imprimeDadosCliente();
                        pausa();
                    }

                    controlador = false; // Sair do laço
                    break;
                default:
                    opcaoErrada();
                    pausa();
                    break;
            }
        } while (controlador);
    }

    public static void areaFuncionario(ListaFuncionario listaFuncionario) {
        Scanner sc = new Scanner(System.in);

        boolean controlador = true;
        char resposta;

        do {
            limpaConsole();
            System.out.println("1 -> Cadastrar funcionário\n2 -> Remover funcionário\n3 -> Exibir funcionário");
            System.out.println("\nEscolha uma opção: ");
            resposta = sc.next().charAt(0);

            switch (resposta) {
                case '1':
                    // Cadastrar funcionário
                    limpaConsole();
                    System.out.print(listaFuncionario.listaAdd());
                    pausa();

                    controlador = false; // Sair do laço

                    break;
                case '2':
                    // Remover funcionário
                    if (listaFuncionario.listaVazia()) {
                        System.out.println("\nLista Vazia!");
                        pausa();
                    } else {
                        System.out.print(listaFuncionario.listaRemove());
                        pausa();
                    }

                    controlador = false; // Sair do laço
                    break;
                case '3':
                    // Exibir cadastro
                    if (listaFuncionario.listaVazia()) {
                        System.out.println("\nLista Vazia!");
                        pausa();
                    } else {
                        listaFuncionario.imprimeDadosFuncionario();
                        pausa();
                    }

                    controlador = false; // Sair do laço
                    break;
                default:
                    opcaoErrada();
                    pausa();
                    break;
            }
        } while (controlador);
    }

    public static void areaServico(ListaServico listaServico) {
        Scanner sc = new Scanner(System.in);

        boolean controlador = true;
        char resposta;

        do {
            limpaConsole();
            System.out.println("1 -> Cadastrar serviço\n2 -> Remover serviço\n3 -> Exibir serviço");
            System.out.println("\nEscolha uma opção: ");
            resposta = sc.next().charAt(0);

            switch (resposta) {
                case '1':
                    // Cadastrar serviço
                    limpaConsole();
                    System.out.print(listaServico.listaAdd());
                    pausa();

                    controlador = false; // Sair do laço

                    break;
                case '2':
                    // Remover serviço
                    if (listaServico.listaVazia()) {
                        System.out.println("\nLista Vazia!");
                        pausa();
                    } else {
                        System.out.print(listaServico.listaRemove());
                        pausa();
                    }

                    controlador = false; // Sair do laço
                    break;
                case '3':
                    // Exibir cadastro
                    if (listaServico.listaVazia()) {
                        System.out.println("\nLista Vazia!");
                        pausa();
                    } else {
                        listaServico.imprimeDadosServico();
                        pausa();
                    }

                    controlador = false; // Sair do laço
                    break;
                default:
                    opcaoErrada();
                    pausa();
                    break;
            }
        } while (controlador);
    }
}