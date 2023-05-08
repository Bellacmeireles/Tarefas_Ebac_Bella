package Modulo15.padroes.abstractFactory;

public class ContratosFactory extends Factory {

    @Override
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorolaCar(100, "Cheio", "Prata");
        } else {
            return null;
        }
    }

}
