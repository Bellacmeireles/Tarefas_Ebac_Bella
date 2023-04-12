package Modulo13.TarefaMód13;

public class PessoaFisica extends Pessoa {

    private String trabalho;
    private Double mei;



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
        return trabalho + " " + mei;
    }
   


}





/*     public String trabalho() {
        return trabalho;
    }
    
    public Double mei() {
        return mei;
    } */