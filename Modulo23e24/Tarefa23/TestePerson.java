package Modulo23e24.Tarefa23;

import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;

public class TestePerson {

    @Test
    public void testListWomen() {

        List<Person> listPerson = new Person().listaPeTarefas();

        List<Person> womenList = listPerson.stream()
                .filter(person -> person.getGender().equals("Female"))
                .collect(Collectors.toList());

        for (Person person : womenList) {
            Assert.assertEquals("Female", person.getGender());
        }

    }
}
