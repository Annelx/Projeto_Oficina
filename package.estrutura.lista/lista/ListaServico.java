package Oficina.lista;

import java.util.ArrayList;
import java.util.Scanner;

import Oficina.Servico;

public class ListaServico {
    /* Atributos */
    ArrayList<Servico> servicos;

    /* Método construtor */
    public ListaServico() {
        servicos = new ArrayList<Servico>();
    }

    /* Métodos */
    public String listaAdd() {
        Scanner sc = new Scanner(System.in);

        // Dados do serviços
        String nome;
        float valor;
        String descricao;

        // Nome ->
        System.out.println("\nNome: ");
        nome = sc.nextLine();

        // Descrição ->
        System.out.println("\nDescrição: ");
        descricao = sc.nextLine();

        // Valor ->
        System.out.println("\nValor: ");
        valor = sc.nextFloat();

        Servico servico = new Servico(nome, descricao, valor);

        servicos.add(servico);
        return "\nServiço cadastrado";
    }

    public boolean listaVazia() {
        boolean vazia = false;
        if (servicos.size() == 0) {
            vazia = true; // Caso esteja vazia
        }
        return vazia;
    }

    private int selecionaServico() {
        Scanner sc = new Scanner(System.in);

        listaImprime();

        int indice = 0;
        System.out.println("\nDigite o índice do Cliente: ");
        indice = sc.nextInt();

        return indice;
    }

    public String listaRemove() {
        servicos.remove(selecionaServico());
        return "\nServiço removido";
    }

    public void listaImprime() {
        System.out.println("\nLista de Serviços ->");
        for (int indice = 0; indice < servicos.size(); indice++) {
            System.out.println("(" + indice + ")" + servicos.get(indice).getNome());
        } // Imprime na tela todos os servicos da lista
    }

    public void imprimeDadosServico() {
        servicos.get(selecionaServico()).imprimeDados();
    }
}