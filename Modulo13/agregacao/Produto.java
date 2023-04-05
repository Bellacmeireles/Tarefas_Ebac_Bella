package Modulo13.agregacao;

public class Produto {

    private Double preco;
    private long codigo;
    private String nome;


    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void vendido() {
        System.out.println("Vendido!");
    }
}
