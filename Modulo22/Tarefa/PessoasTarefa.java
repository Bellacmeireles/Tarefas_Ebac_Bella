package Modulo22.Tarefa;

import java.util.List;
import java.util.Objects;

public class PessoasTarefa {

    private String person;
    
    private String name;

    private String gender;

    public PessoasTarefa(String person, String name, String gender) {
        this.person = person;
        this.name = name;
        this.gender = gender;
    }

    public PessoasTarefa() {}

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

    public List<PessoasTarefa> listaPeTarefas() {
        PessoasTarefa pessoa1 = new PessoasTarefa("Pessoa", "Bella", "Female");
        PessoasTarefa pessoa2 = new PessoasTarefa("Pessoa", "Ana", "Female");
        PessoasTarefa pessoa3 = new PessoasTarefa("Pessoa", "Samu", "Male");
        PessoasTarefa pessoa4 = new PessoasTarefa("Pessoa", "Pedro", "Male");

        return List.of(pessoa1,pessoa2,pessoa3,pessoa4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoasTarefa pessoa = (PessoasTarefa) o;
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
