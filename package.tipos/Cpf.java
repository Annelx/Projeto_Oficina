package Tipos;

public class Cpf {
    /* Atributos */
    private String valor;

    /* Método Construtor */
    public Cpf() {
    }

    /* Get e Set */
    public String getValor() {
        return valor;
    }

    public void setValor(String cpf) {
        if (verificaCpf(cpf)) {
            valor = cpf;
        }
    }

    /* Métodos */
    private boolean verificaCpf(String cpf) {
        boolean resultado = true; // Resultado da verificação

        if (cpf.length() != 11) {
            resultado = false; // CPF inválido
        } // Verifica quantidade de caracteres
        else {
            for (int temp = 0; temp < 11;) {
                char caractere = cpf.charAt(temp);

                switch (caractere) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        temp++;
                        break;
                    default:
                        resultado = false; // CPF inválido
                        temp = 11; // Finaliza laço de repetição
                        break;
                }
            }
        } // Verifica se há letras
        return resultado;
    }
}