package Modulo15.padroes.singleton;

public class SingletonComPropriedadeSyncronized {

    private static SingletonComPropriedadeSyncronized singletonEx;
    private String value;

    private SingletonComPropriedadeSyncronized(String value) {
        this.value = value;
    }

    public static synchronized SingletonComPropriedadeSyncronized getInstance(String value) {
        if (singletonEx == null) {
            singletonEx = new SingletonComPropriedadeSyncronized(value);
        }
        return singletonEx;        
    }

    public String getValue() {
        return value;
    }
}
