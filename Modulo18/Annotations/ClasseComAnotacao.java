package Modulo18.Annotations;

@PrimeirAnotacao(value = "Bella", bairros = "jardins", numeroCasa = 10)
public class ClasseComAnotacao {
    
    @PrimeirAnotacao(value = "Pires", bairros = {"Teste", "Teste1"}, numeroCasa = 20, valores = 100d)
    private String nome;

    @PrimeirAnotacao(value = "Rodrigo", bairros = "Teste", numeroCasa = 10)
    public ClasseComAnotacao() {

    }
}
