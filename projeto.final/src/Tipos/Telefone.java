package Tipos;

public class Telefone {
    /* Atributos */
    private String valor;

    /* Método Construtor */
    public Telefone() {

    }

    /* Get e Set */
    public String getValor() {
        return valor;
    }

    public void setValor(String telefone) {
        if (verificaTelefone(telefone)) {
            valor = telefone;
        }
    }

    /* Métodos */
    private boolean verificaTelefone(String telefone) {
        boolean resultado = true; // Resultado da verificação

        if (telefone.length() != 8) {
            resultado = false; // Telefone inválido
        } // Verificar quantidade de caracteres
        else {
            for (int temp = 0; temp < telefone.length();) {
                char caractere = telefone.charAt(temp);

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
                        resultado = false; // Telefone inválido
                        temp = 8; // Finaliza laço de repetição
                        break;
                }
            }
        } // Verificar se há letras

        return resultado;
    }
}