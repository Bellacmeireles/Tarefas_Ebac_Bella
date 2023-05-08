package Modulo15.padroes.abstractFactory;

/**
 * Customer 1º classe criada, nela contem as propiedades  
 */

public class Customer {
    
    private String gradeRequest;
    private boolean hasCompanyContract;

    public Customer(String gradeRequest, boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public boolean hasCompanyContract() {
        return hasCompanyContract;
    }
    public String gradeRequest() {
        return gradeRequest;
    }
    
}
