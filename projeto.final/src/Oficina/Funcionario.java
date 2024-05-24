package Oficina;

import Tipos.Cpf;
import Tipos.Telefone;

public class Funcionario extends Pessoa {
    /* Atributos */
    private float remuneracao;
    private int expediente;

    /* Método Construtor */
    public Funcionario(String nome, Cpf cpf, Telefone telefone, float remuneracao, int expediente) {
        super(nome, cpf, telefone);
        this.remuneracao = remuneracao;
        this.expediente = expediente;
    }

    /* Get e Set */

    // Remuneração
    public float getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(float remuneracao) {
        this.remuneracao = remuneracao;
    }

    // Expediente
    public int getexpediente() {
        return expediente;
    }

    public void setJornadaDeTrabalho(int expediente) {
        this.expediente = expediente;
    }

    /* Implementação do Método Abstrato */
    @Override
    public void imprimeDados() {
        System.out.println("\nFuncionário \n{");
        System.out.println("Nome = " + nome + "\nCPF = " + cpf.getValor() + "\nTelefone = " + telefone.getValor());
        System.out.println("Remuneração = " + remuneracao + "\nExpediente = " + expediente + "\n}");
    }
}