package Oficina.lista;

import java.util.ArrayList;
import java.util.Scanner;

import Oficina.Funcionario;
import Tipos.Cpf;
import Tipos.Telefone;

public class ListaFuncionario {
    /* Atributos */
    ArrayList<Funcionario> funcionarios;

    /* Método construtor */
    public ListaFuncionario() {
        funcionarios = new ArrayList<Funcionario>();
    }

    /* Métodos */
    public String listaAdd() {
        Scanner sc = new Scanner(System.in);

        // Dados do funcionário
        String nome;
        Cpf cpf = new Cpf();
        Telefone telefone = new Telefone();
        Float remuneracao;
        int expediente;

        // Nome ->
        System.out.println("\nNome: ");
        nome = sc.nextLine();

        // CPF ->
        do {
            System.out.println("\nCPF: ");
            cpf.setValor(sc.nextLine());
        } while (cpf.getValor() == null);

        // Telefone ->
        do {
            System.out.println("\nTelefone: ");
            telefone.setValor(sc.nextLine());
        } while (telefone.getValor() == null);

        // Remuneração ->
        System.out.println("\nSalário: ");
        remuneracao = sc.nextFloat();

        // Expediente ->
        System.out.println("\nHorário de expediente: ");
        expediente = sc.nextInt();

        Funcionario funcionario = new Funcionario(nome, cpf, telefone, remuneracao, expediente);

        funcionarios.add(funcionario); // Adiciona o novo funcionário
        return "\nFuncionário cadastrado";
    }

    public boolean listaVazia() {
        boolean vazia = false;
        if (funcionarios.size() == 0) {
            vazia = true; // Caso esteja vazia
        }
        return vazia;
    }

    private int selecionaFuncionario() {
        Scanner sc = new Scanner(System.in);

        listaImprime();

        int indice = 0;
        System.out.println("\nDigite o índice do funcionário: ");
        indice = sc.nextInt();

        return indice;
    }

    public String listaRemove() {
        funcionarios.remove(selecionaFuncionario());
        return "\nFuncionário removido!";
    }

    public void listaImprime() {
        System.out.println("\nLista de funcionários ->");
        for (int indice = 0; indice < funcionarios.size(); indice++) {
            System.out.println("(" + indice + ")" + funcionarios.get(indice).getNome());
        } // Imprime na tela todos os clientes da lista
    }

    public void imprimeDadosFuncionario() {
        funcionarios.get(selecionaFuncionario()).imprimeDados();
    }
}