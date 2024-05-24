package Oficina.lista;

import java.util.ArrayList;
import java.util.Scanner;

import Oficina.Cliente;
import Oficina.Veiculo;
import Tipos.Cpf;
import Tipos.Placa;
import Tipos.Telefone;

public class ListaCliente {
    /* Atributos */
    ArrayList<Cliente> clientes;

    /* Método construtor */
    public ListaCliente() {
        clientes = new ArrayList<Cliente>();
    }

    /* Métodos */
    public String listaAdd() {
        Scanner sc = new Scanner(System.in);

        // Dados do cliente
        String nome;
        Cpf cpf = new Cpf();
        Telefone telefone = new Telefone();

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

        // Dados do veículo
        Placa placa = new Placa();
        String modelo;
        String descricao;

        // Placa ->
        do {
            System.out.println("\nPlaca do veículo: ");
            placa.setValor(sc.nextLine());
        } while (placa.getValor() == null);

        // Modelo ->
        System.out.println("\nModelo do veículo: ");
        modelo = sc.nextLine();

        // Descrição ->
        System.out.println("\nDescrição do veículo: ");
        descricao = sc.nextLine();

        Veiculo v = new Veiculo(placa, modelo, descricao);
        Cliente c = new Cliente(nome, cpf, telefone, v);

        clientes.add(c); // Adiciona o novo cliente
        return "\nCliente cadastrado";
    }

    public boolean listaVazia() {
        boolean vazia = false;
        if (clientes.size() == 0) {
            vazia = true; // Caso esteja vazia
        }
        return vazia;
    }

    private int selecionaCliente() {
        Scanner sc = new Scanner(System.in);

        listaImprime();

        int indice = 0;
        System.out.println("\nDigite o índice do Cliente: ");
        indice = sc.nextInt();

        return indice;
    }

    public String listaRemove() {
        clientes.remove(selecionaCliente());
        return "\nCliente removido!";
    }

    public void listaImprime() {
        System.out.println("\nLista de clientes ->");
        for (int indice = 0; indice < clientes.size(); indice++) {
            System.out.println("(" + indice + ")" + clientes.get(indice).getNome());
        } // Imprime na tela todos os clientes da lista

    }

    public void imprimeDadosCliente() {
        clientes.get(selecionaCliente()).imprimeDados();
    }
}