package Tipos;

public class Placa {
    /* Atributos */
    private String valor;

    /* Método Construtor */
    public Placa(){

    }

    /* Get e Set */
    public String getValor() {
        return valor;
    }

    public void setValor(String placa) {
        if (verificaPlaca(placa)) {
            valor = placa;
        }
    }

    /* Métodos */
    private boolean verificaPlaca(String placa) {
        boolean resultado = true;

        if (placa.length() != 7) {
            resultado = false; // Placa inválida
        } // Verificar quantidade de caracteres

        return resultado;
    }
}