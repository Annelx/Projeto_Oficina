package Oficina;

import Tipos.Cpf;
import Tipos.Telefone;

public class Cliente extends Pessoa {
    /* Atributos */
    Veiculo veiculo;

    /* Método Construtor */
    public Cliente(String nome, Cpf cpf, Telefone telefone, Veiculo veiculo) {
        super(nome, cpf, telefone); // Chamando explicitamente o construtor
        this.veiculo = veiculo;
    }

    /* Get e Set */
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /* Implementação do Método Abstrato */
    @Override
    public void imprimeDados() {
        System.out.println("\nCliente \n{");
        System.out.println("Nome = " + nome + "\nCPF = " + cpf.getValor() + "\nTelefone = " + telefone.getValor()); // Dados cliente
        System.out.println("Veículo => (Placa = " + veiculo.getPlaca().getValor() + ", Modelo = " + veiculo.getModelo() + ", Descrição = " + veiculo.getDescricao() + ")\n}"); // Dados veículo
    }
}