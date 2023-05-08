package Modulo15.padroes.abstractFactory;

public class SemContratosFactory extends Factory {

    @Override
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Brasilia(100, "Cheio", "Prata");
        } else {
            return null;
        }
    }
    
}
