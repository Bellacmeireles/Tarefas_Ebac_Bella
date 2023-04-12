package Modulo13.TarefaMód13;

public class PessoaJuridica extends Pessoa {

    private String empresa;
    private Double cnpj;

    
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
        return empresa + " " + cnpj;
    }
    
    
  

}
