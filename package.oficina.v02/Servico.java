package Oficina;

public class Servico {
    /* Atributos */
    private String nome;
    private String descricao;
    private float valor;

    /* Método Construtor */
    public Servico(String nome, String descricao, float valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    /* Get e Set */

    // Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Valor
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    /* Metódos */
    public void imprimeDados() {
        System.out.println("\nServiço \n{");
        System.out.println("Nome = " + nome + "\nValor = " + valor + "\nDescrição = " + descricao + "\n}");
    }
}