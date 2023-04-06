package Modulo13.TarefaMód13;

public class PessoaFisica extends Pessoa {
    public PessoaFisica(String nome) {
        super(nome);
    }

    private String nome;
    private String trabalho;
    private Double mei;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
    
    @Override
    public String nomes() {
        return nome;
    }

}
