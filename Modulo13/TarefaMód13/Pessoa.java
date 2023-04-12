package Modulo13.TarefaMód13;

public abstract class Pessoa {
    private String nome;
    private String trabalho;
    private Double mei;
    private String empresa;
    private Double cnpj;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public Double getCnpj() {
        return cnpj;
    }
    public void setCnpj(Double cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getTrabalho() {
        return trabalho;
    }
    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }
    
    public Double getMei() {
        return mei;
    }
    public void setMei(Double mei) {
        this.mei = mei;
    }
   
    public abstract String nomes();
    
    public String nome() {
        return nome;
    }
    
}
