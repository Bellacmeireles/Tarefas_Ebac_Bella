package Modulo22.Streams.OperacoesTerminais;

import java.util.List;

import Modulo22.Streams.OperacoesIntermediarias.Pessoa;

public class ExemplosAllMach {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));
        System.out.println(result);

        //Método convencional
        Boolean re = true;
        for (Pessoa p : lista) {
            if (!p.getNacionalidade().equals("Mexico")) {
                re=false;
                break;
            }
            System.out.println(re);
        }
    }
}
