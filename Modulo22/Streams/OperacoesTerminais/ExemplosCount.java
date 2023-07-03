package Modulo22.Streams.OperacoesTerminais;

import java.util.List;

import Modulo22.Streams.OperacoesIntermediarias.Pessoa;

public class ExemplosCount {
    public static void main(String[] args) {
         List<Pessoa> lista = new Pessoa().populaPessoas();

        long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();

        System.out.println(count);
    }
}
