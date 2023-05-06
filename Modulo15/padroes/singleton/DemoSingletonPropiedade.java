package Modulo15.padroes.singleton;

public class DemoSingletonPropiedade {
    public static void main(String[] args) {
        SingletonComPropriedade singletonEx = SingletonComPropriedade.getInstance("Teste");
        SingletonComPropriedade singletonEx1 = SingletonComPropriedade.getInstance("Teste1");

        System.out.println(singletonEx.getValue());
        System.out.println(singletonEx1.getValue());
    }
}
