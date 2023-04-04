package Modulo13.abstratas;

public class Comissionado extends Empregados {

    private Double totalVenda;
    private Double taxaComissao;

    public Double getTotalVenda() {
        return totalVenda;
    }
    public void setTotalVenda(Double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public Double getTaxaComissao() {
        return taxaComissao;
    }
    public void setTaxaComissao(Double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }
    
    @Override
    public Double vencimento() {
        return totalVenda*taxaComissao;
    }
}
