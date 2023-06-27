package Modulo19.Tarefa;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import Modulo18.Tarefa.TabelaAnnotation;
import Modulo18.Tarefa.TabelaComAnnotation;

public class ImprimiTabela {
    public static void main(String[] args) {

        TabelaComAnnotation tabComAno = new TabelaComAnnotation();
        Class<?> tabela1 = tabComAno.getClass();
        System.out.println(tabela1);

        System.out.println("");

        Field[] fields = tabela1.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] fieldAnnotations = field.getAnnotations();
            for (Annotation annotation : fieldAnnotations) {
                if (annotation instanceof TabelaAnnotation) {
                    TabelaAnnotation tabelaAnnotation = (TabelaAnnotation) annotation;
                    System.out.println("Complete Information: " + tabelaAnnotation);
                    System.out.println("Value: " + tabelaAnnotation.value());
                    for (String sala : tabelaAnnotation.sala()) {
                        System.out.println("Sala: " + sala);
                    }
                    System.out.println("Número da sala: " + tabelaAnnotation.numeroDaSala());
                    System.out.println("");

                }

            }

        }
    }
}
/**
 * //System.out.println("Sala: " + tabelaAnnotation.sala());
 * não funciona pois o resultado no console sai:Sala:
 * [Ljava.lang.String;@52cc8049
 */