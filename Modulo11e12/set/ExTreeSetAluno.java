package Modulo11e12.set;

import java.util.Set;
import java.util.TreeSet;

import Modulo11e12.domain.Aluno1;

public class ExTreeSetAluno {

        public static void main(String args[]) {
            exemploListaSimples();
        }
    
        /**
         * Para não repetir objetos na lista de alunos é necessário que a classe
         * Aluno implemente a classe Comparable
         * Tem ordem natural dos objetos
         */
        private static void exemploListaSimples() {
            Set<Aluno1> conjunto = new TreeSet<>();
    
            Aluno1 a = new Aluno1("João da Silva", "Linux básico", 0);
            Aluno1 b = new Aluno1("Antonio Sousa", "OpenOffice", 0);
            Aluno1 c = new Aluno1("Lúcia Ferreira", "Internet", 0);
            Aluno1 d = new Aluno1("Antonio Sousa", "OpenOffice", 0);
            conjunto.add(a);
            conjunto.add(b);
            conjunto.add(c);
            conjunto.add(d);
            System.out.println(conjunto);
        }
}

