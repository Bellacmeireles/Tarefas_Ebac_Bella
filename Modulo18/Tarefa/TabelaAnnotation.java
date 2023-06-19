package Modulo18.Tarefa;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface TabelaAnnotation {
    
    String value();

    long numeroDaSala();

    String[] sala();
}
