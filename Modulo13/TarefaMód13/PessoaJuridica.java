package Modulo13.TarefaMód13;

public class PessoaJuridica extends Pessoa {
    public PessoaJuridica(String nome) {
        super(nome);
    }

    private String nome;
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

    @Override
    public String nomes() {
        return nome;
    }

}
