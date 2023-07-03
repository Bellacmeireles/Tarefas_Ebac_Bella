package Modulo22.Streams.OperacoesTerminais;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import Modulo22.Streams.OperacoesIntermediarias.Pessoa;

public class ExemplosOPtional {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Optional<Pessoa> opcional = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        if (opcional.isPresent()) {
            System.out.println(opcional.get());
        }

        opcional.ifPresent(System.out::println);
    }
}
