package Modulo23e24.Mod23.Testes;

import org.junit.Assert;
import org.junit.Test;

/**
 * PrimeiroTesteComJUnit
 */
public class PrimeiroTesteComJUnit {
    
    @Test
    public void teste() {
        String nome = "Ana";
        Assert.assertEquals("Ana", nome);
    }

    /**
     * Exemplos de erro 
     */
    /* @Test
    public void testeNotEquals() {
        String nome = "Ana";
        Assert.assertEquals("Bella", nome);
    } */

    /**
     * Exemplosse eu quiser um teste que falha "assertNotEquals"
     */
    @Test
    public void testeNotEquals2() {
        String nome = "Bella";
        Assert.assertNotEquals("Ana", nome);
    }
}