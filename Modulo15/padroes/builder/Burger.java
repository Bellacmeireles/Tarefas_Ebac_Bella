package Modulo15.padroes.builder;

public class Burger {
    private String bun = "No Bun";
    private String meat = "No Meat";
    private String salad = "No Salad";
    private String cheese = "No Cheese";
    private String sauce = "No Sauce";

    public void setBun(String bun) {
        this.bun = bun;
    }
    public void setMeat(String meat) {
        this.meat = meat;
    }
    public void setSalad(String salad) {
        this.salad = salad;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void print() {
        System.out.println(
            "Burguer is finisehd! " + "n " + "Bun: " + bun +
            " - Meat: " + meat +
            " - Salad: " + salad +
            " - Cheese: " + cheese +
            " - Sauce: " + sauce);
    }
}
