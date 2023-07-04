package Modulo23e24.Tarefa;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class TestePerson {

    @Test
    public void testListWomen() {

        List<Person> listPerson = new Person().listaPeTarefas();

        System.out.println("Women Group: ");
        listPerson.stream()
                .filter(pessoaList -> pessoaList.getGender().equals("Female"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    @Test
    public void teste() {
        Person lista = new Person();
        String retorno = lista.getClass().getName();
        Assert.assertEquals("Female", retorno);
    }
}
