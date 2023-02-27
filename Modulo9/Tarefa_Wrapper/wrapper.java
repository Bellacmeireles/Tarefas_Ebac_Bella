package Tarefa_Wrapper;
/**
 * @author Bellacmeireles
 * Tarefa_Wrapper - Módulo 9
 * 
 * Passos:
 * 1º Ler do console um valor numérico 
 * 2º Coloque a variável no tipo primitiva
 * 3º Depois faça a conversão para o tipo Wrapper
 * 4º Por fim imprima novamente no console
 *
 */
public class wrapper {
    
    public static void main(String[] args) {

        int lerValor = 2023;
        System.out.println("Valor Númerico:" + " " + lerValor);

        Integer lerValor1 = lerValor;
        System.out.println("Valor Númerico Wrapper:" + " " + lerValor1);
        
    }

}
