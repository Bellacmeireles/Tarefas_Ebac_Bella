package Modulo15.padroes.abstractFactory;

/**
 * Factory 2º classe criada, nela contem os metodos
 */

public abstract class Factory {

    public Car create(String requestedGrade) {
        Car car = retriveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clean();
        car.mechaniCheck();
        car.fuelCar();
        return car;
    }

    abstract Car retriveCar(String requestedGrade);

}
