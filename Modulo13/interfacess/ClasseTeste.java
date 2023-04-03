package Modulo13.interfacess;

public class ClasseTeste {
   
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Bella, você está usando caneta Bic");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá Bella, você está usando caneta Bic");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Bella, você está usando caneta Bic");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());

        System.out.println("");

        Icarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();
        
        Icarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }
}
