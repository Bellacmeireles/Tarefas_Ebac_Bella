package Modulo15.padroes.singleton;

/**
 * SingletonEx
 */
public class SingletonEx {

    private static SingletonEx singletonEx;

    private SingletonEx() {

    }

    public static SingletonEx getInstance() {
        if (singletonEx == null) {
            singletonEx = new SingletonEx();
        }
        return singletonEx;
    }

}