package Modulo13.Composicao;

public class ContaCorrente {
    private Banco banco;
    private Double saldo;
    private Double chequeEspecial;

    public Double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
   
    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    
}
