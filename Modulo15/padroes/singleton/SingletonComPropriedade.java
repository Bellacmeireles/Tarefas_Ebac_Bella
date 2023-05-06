package Modulo15.padroes.singleton;

public class SingletonComPropriedade {
    
    private static SingletonComPropriedade singletonEx;
    private String value;

    public String getValue() {
        return value;
    }

    private SingletonComPropriedade(String value) {
        this.value = value;
    }

    public static SingletonComPropriedade getInstance(String value) {
        if (singletonEx == null) {
            singletonEx = new SingletonComPropriedade(value);
        }
        return singletonEx;
    }

}
