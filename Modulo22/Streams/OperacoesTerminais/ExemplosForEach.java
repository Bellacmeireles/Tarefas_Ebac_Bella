package Modulo22.Streams.OperacoesTerminais;

import java.util.List;
import java.util.stream.Stream;

import Modulo22.Streams.OperacoesIntermediarias.Pessoa;

public class ExemplosForEach {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("*********");
        System.out.println("*********");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(p -> System.out.println(p.getNome()));

        System.out.println("*********");
        System.out.println("*********");

        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));

        stream.forEach(p -> System.out.println(p.getNome()));

        System.out.println("*********");
        System.out.println("*********");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(p -> System.out.println(p));
    }
    
}
