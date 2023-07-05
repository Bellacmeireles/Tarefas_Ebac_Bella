package Modulo23e24.Tarefa23;

import java.util.List;
import java.util.Objects;



public class Person {
    private String person;
    
    private String name;

    private String gender;

    public Person(String person, String name, String gender) {
        this.person = person;
        this.name = name;
        this.gender = gender;
    }

    public Person() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }

    public List<Person> listaPeTarefas() {
        Person pessoa1 = new Person("Pessoa", "Bella", "Female");
        Person pessoa2 = new Person("Pessoa", "Ana", "Female");
        Person pessoa3 = new Person("Pessoa", "Samu", "Male");
        Person pessoa4 = new Person("Pessoa", "Pedro", "Male");

        return List.of(pessoa1,pessoa2,pessoa3,pessoa4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person pessoa = (Person) o;
        return name.equals(pessoa.name) && gender.equals(pessoa.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
