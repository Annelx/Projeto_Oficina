package Oficina;

import Tipos.Placa;

public class Veiculo {
    /* Atributos */
    Placa placa;
    String modelo;
    String descricao;

    /* Método Construtor */
    public Veiculo(Placa placa, String modelo, String descricao) {
        this.placa = placa;
        this.modelo = modelo;
        this.descricao = descricao;
    }

    /* Get e Set */

    // Placa
    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    // Modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}