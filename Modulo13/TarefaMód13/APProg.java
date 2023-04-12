package Modulo13.TarefaMód13;

public class APProg {
    public static void main(String[] args) {

        PessoaFisica fis = new PessoaFisica();
        fis.setNome("Bella");
        fis.setTrabalho("vendedora");
        fis.setMei(12315d);

        imprimir1(fis);

        System.out.println("");

        PessoaJuridica jud = new PessoaJuridica();
        jud.setNome("João");
        jud.setEmpresa("Churrasquinho tio João");
        jud.setCnpj(347745d);

        imprimir(jud);

    }

    
    private static void imprimir(Pessoa pessoa) {
        System.out.println(pessoa.getNome() + " tem uma empresa chamada: " + pessoa.getEmpresa() + " e o CNPJ é: "
                + pessoa.getCnpj());
    }

    private static void imprimir1(Pessoa pessoa) {
        System.out.println(pessoa.getNome() + " é " + pessoa.getTrabalho() + " e o seu MEI é: " + pessoa.getMei());
    }

}
