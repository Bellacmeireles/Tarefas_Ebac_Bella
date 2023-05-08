package Modulo15.padroes.abstractFactory;

public class Demo {
    public static void main(String[] args) {
        Customer cliente = new Customer("A", false);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.gradeRequest());
        car.startEngine();  
    }

    private static Factory getFactory(Customer cliente) {
        if(cliente.hasCompanyContract()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }

    

}
