package Modulo15.padroes.Tarefa;

public class CarroSemi {

    private String motor;
    private String cor;
    private String tanqueGas;

    public CarroSemi(String motor, String cor, String tanqueGas) {
        this.motor = motor;
        this.cor = cor;
        this.tanqueGas = tanqueGas;
    }

    public void mecanicaS() {
        System.out.println("Seu carro semi novo está pronto, aproveite com segurança! ");
    }

    public void tanqueS() {
        System.out.println("O " + tanqueGas + " esta cheio e o " + motor + "esta pronto para ser utilizado");
    }

    public void limpaS() {
        System.out.println("Seu carro está limpo e a " + cor.toLowerCase() + " esta brilhando! ");
    }
}