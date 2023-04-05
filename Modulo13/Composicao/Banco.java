package Modulo13.Composicao;

import java.util.HashSet;
/* import java.util.List; */
import java.util.Set;


public class Banco {
    private Banco banco;
    private Long codigo;
    private String nome;
    private Set<ContaCorrente> contaCorrentes;

    private Set<ContaPoupanca> contaPoupancas;

    public Banco() {
        this.contaCorrentes = new HashSet<>();
        this.contaPoupancas = new HashSet<>();
    }

    public void add(ContaCorrente cc) {
        this.contaCorrentes.add(cc);
    }
    public void add(ContaPoupanca cp) {
        this.contaPoupancas.add(cp);
    }

    public Long getCodigo() {
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

    public Banco getBanco() {
        return banco;
    }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
