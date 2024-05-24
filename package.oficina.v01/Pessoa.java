package Oficina;

import Tipos.*;

public abstract class Pessoa {
    /* Atributos */
    String nome;
    Cpf cpf;
    Telefone telefone;

    /* Método Construtor */
    public Pessoa(String nome, Cpf cpf, Telefone telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    /* Get e Set */

    // Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // CPF
    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    // Telefone
    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    /* Método Abstrato */
    public abstract void imprimeDados();
}