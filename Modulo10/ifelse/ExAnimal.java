package Modulo10.ifelse;

import java.util.Scanner;

public class ExAnimal {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o nome do animal: ");
        String texto = s.next();
        String animal = exampleOfIF(texto);
        System.out.println(animal);

    }

    public static String exampleOfIF(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        
        return result;
    }
}
