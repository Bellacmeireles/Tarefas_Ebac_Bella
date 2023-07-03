package Modulo22.Tarefa;

import java.util.List;
import java.util.stream.Collectors;


public class AppListPerson {
    public static void main(String[] args) {
        List<PessoasTarefa> listPerson = new PessoasTarefa().listaPeTarefas();

        System.out.println("All Group: ");
        List<PessoasTarefa> listMain = listPerson.stream()
                        .filter(pessoaList -> pessoaList.getPerson().equals("Pessoa"))
                        .collect(Collectors.toList());
        
        listMain.forEach(System.out::println);

        System.out.println("");

        System.out.println("Women Group: ");
        listPerson.stream()
                .filter(pessoaList -> pessoaList.getGender().equals("Female"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        
    }
}
