package Modulo13.abstratas;

public class Programa {
    public static void main(String[] args) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Bella");
        empregado.setSobrenome("Cabral");
        empregado.setSalario(200d);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("14");
        comissionado.setNome("João");
        comissionado.setSobrenome("Oliveira");
        comissionado.setTotalVenda(1000d);
        comissionado.setTaxaComissao(01d);
        imprimir(comissionado);
        
        Horista horista = new Horista();
        horista.setCpf("12");
        horista.setNome("Julio");
        horista.setSobrenome("Meireles");
        horista.setPrecoHora(100d);
        horista.setHorasTrabalhadas(60d);
        imprimir(horista);
    }

    /**
     * @param empregados
     * método que imprimi todas as classes de uma vez, ao ivez de usar o println() em cada um para imprimir vc usa esse metodo que faz tudo de uma vez só
     * 
     */
    private static void imprimir(Empregados empregados) {
        System.out.println(empregados.getNome() + " tem salário: " + empregados.vencimento());
        empregados.imprimisobrenome();
    }
}
