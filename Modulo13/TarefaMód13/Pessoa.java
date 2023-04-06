package Modulo13.TarefaMód13;

public abstract class Pessoa {
    private String nome;

     public Pessoa(String nome) {
        this.nome = nome;
    } 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimiNomes(){
        System.out.println(this.nome);
    }
    public abstract String nomes();
}
