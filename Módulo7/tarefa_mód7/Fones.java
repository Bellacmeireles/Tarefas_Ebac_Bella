/**
 * Programa que mostra 2 fones de marcas diferentes
 * 
 * @author Bellacmeireles
 * 
 * @param args
 * @see Fones.java
 */

package Módulo7.tarefa_mód7;

public class Fones {
    private String marca;

    private String cor;

    private int código;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    //

    public void nomeMarca(String marca) {
        setMarca(marca);
    }

    public void corProduto(String cor) {
        setCor(cor);
    }

    public int númeroSérie() {
        return código;
    }

    public static void main(String[] args) {
        Fones foneJbl = new Fones();

        foneJbl.setMarca("JBL");
        foneJbl.setCor("Branco");
        foneJbl.setCódigo(212123);

        System.out.println("Marca do produto:" + " " + foneJbl.getMarca());
        System.out.println("Cor do produto:" + " " + foneJbl.getCor());
        System.out.println("Número de série:" + " " + foneJbl.getCódigo());

        System.out.println();

        Fones foneAKG = new Fones();

        foneAKG.setMarca("AKG");
        foneAKG.setCor("Preto");
        foneAKG.setCódigo(232425);

        System.out.println("Marca do produto:" + " " + foneAKG.getMarca());
        System.out.println("Cor do produto:" + " " + foneAKG.getCor());
        System.out.println("Número de série:" + " " + foneAKG.getCódigo());

    }

}
