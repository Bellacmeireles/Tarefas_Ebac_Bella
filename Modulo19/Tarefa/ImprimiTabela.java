package Modulo19.Tarefa;


/* import java.lang.reflect.Field;
import Modulo18.Tarefa.TabelaAnnotation; */
import Modulo18.Tarefa.TabelaComAnnotation;

public class ImprimiTabela {
    public static void main(String[] args) {
    
        /* Class<?> tabela = TabelaComAnnotation.class;
        System.out.println(tabela); */
                
        TabelaComAnnotation tabComAno = new TabelaComAnnotation();
        Class<?> tabela1 = tabComAno.getClass();
        System.out.println(tabela1); 

        System.out.println(""); 

       /*  Field[] fields = tabela1.getDeclaredFields();
        for(Field field : fields) {
                TabelaComAnnotation annotation;
                TabelaComAnnotation tabelaAnnotation = (TabelaComAnnotation) tabComAno;
                System.out.println("Campo: " + field.getName());
                    System.out.println("Valor: " + field);
                    System.out.println("Sala: " + tabComAno);
                    System.out.println("Número da Sala: " + tabComAno.toString());
            }
        } */
    }

}

    

