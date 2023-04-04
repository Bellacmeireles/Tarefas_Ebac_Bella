package Modulo13.abstratas;

public abstract class Empregados {
    
    private String nome;
    private String sobrenome;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimisobrenome() {
        System.out.println(this.sobrenome);
    }

    

    public abstract Double vencimento();
}
