package Modulo11e12.domain;

import java.util.Comparator;

public class ComparaNotaAluno implements Comparator<Aluno1> {

    @Override
    public int compare(Aluno1 o1, Aluno1 o2) {
        //return Double.valueOf(o1.getNota()).compareTo(Double.valueOf(o2.getNota()));
        //return Double.compare(o2.getNota(), o1.getNota());
        return Double.compare(o2.getNota(), o1.getNota());
    }
    
}
