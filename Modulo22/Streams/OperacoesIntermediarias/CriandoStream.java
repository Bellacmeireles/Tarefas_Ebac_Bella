package Modulo22.Streams.OperacoesIntermediarias;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * CriandoStream
 */
public class CriandoStream {
    public static void main(String[] args) {
        Stream<String> stream = List.of("Nome: ", "Bella", "Cabral Meireles").stream();

        Stream<String> set = Set.of("Nome: ", "Bella", "Cabral Meireles").stream();

        Map<String, String> map = Map.of("Bella", "Cabral Meireles");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> values = map.values().stream();
        
        Stream<String> streamSTS = Stream.of("String", "asds");


        System.out.println(stream);
        System.out.println(set);
        System.out.println(chaves);
        System.out.println(values);
        System.out.println(streamSTS);

    }
}