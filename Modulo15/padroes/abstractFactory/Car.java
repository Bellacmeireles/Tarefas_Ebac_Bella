package Modulo15.padroes.abstractFactory;

/**
 * Car 3º classe criada, nela contem os metodos dessa classe
 */

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName());
        System.out.println("The " + fuelSource + " engine has been started, and is ready to utilize " + horsePower + " horsepowers.n" );
    }

    public void clean() {
        System.out.println("Car has been cleaned, and the " + color.toLowerCase() + " color shines");
    }

    public void mechaniCheck() {
        System.out.println("Car has been checked by the mechanic. Everything looks good!");
    }

    public void fuelCar() {
        System.out.println("Car is being filled with " + fuelSource.toLowerCase());
    }
}
