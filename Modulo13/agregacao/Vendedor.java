package Modulo13.agregacao;

public class Vendedor {
    
    private String nome;
    private Double comissao;
    
    public Double getComissao() {
        return comissao;
    }
    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void vende() {
        System.out.println("Vender");
    }
}
