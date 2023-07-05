package Modulo23e24.Tarefa23;

import java.util.List;
import java.util.stream.Collectors;



public class APP {
    public static void main(String[] args) {
        List<Person> listPerson = new Person().listaPeTarefas();

        System.out.println("All Group: ");
        List<Person> listMain = listPerson.stream()
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
