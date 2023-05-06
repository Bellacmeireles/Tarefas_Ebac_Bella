package Modulo15.padroes.builder;

public class Gerente {
    BurgerBuilder builder;

    /* public Gerente(BurgerBuilder builder) {
        this.builder = builder;
    } */

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public Burger builderBurger() {
        builder.buildBun();
        builder.buildCheese();
        builder.buildSalad();
        builder.buildSauce();
        return builder.build();
    }

    

}
