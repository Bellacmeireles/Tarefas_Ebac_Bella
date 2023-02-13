package Módulo7.src;

public class Cliente {
    
    private int código;

    private String nome;
    
    private String endereço;
    
    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void cadastrarEndereço(String endereço) {
        setEndereço(endereço);
    }

    public void imprimirEndereço() {
        System.out.println(this.endereço);
    }

    public String retornaNomeCliente() {
        return "Endereço da Bella";
    }

    public int valorTotal() {
        return 20;
    }

}
