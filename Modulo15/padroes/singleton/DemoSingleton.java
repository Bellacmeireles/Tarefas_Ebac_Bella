package Modulo15.padroes.singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        SingletonEx singletonEx = SingletonEx.getInstance();
        SingletonEx singletonEx1 = SingletonEx.getInstance();
        System.out.println(singletonEx);
        System.out.println(singletonEx1);
    }
}
