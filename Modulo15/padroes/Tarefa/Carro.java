package Modulo15.padroes.Tarefa;

public abstract class Carro {
    
    private String motor;
    private String cor;
    private String tanqueGas;
    
    public Carro(String motor, String cor, String tanqueGas) {
        this.motor = motor;
        this.cor = cor;
        this.tanqueGas = tanqueGas;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("O " + tanqueGas + " está cheio e preparado para utilizar e o " + motor + " horsepowers.n " );
    }

    public void mecanica() {
        System.out.println("Todas as combinações de segurança e mecânica foram testadas e estão prontas para o uso. Dirija com cuidado! ");
    }

    public void tanque() {
        System.out.println("O " + tanqueGas + " esta cheio e o " + motor + "esta pronto para ser utilizado");
    }

    public void limpa() {
        System.out.println("Seu carro está limpo e a " + cor.toLowerCase() + " esta brilhando! ");
    }
    

}
