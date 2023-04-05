package Modulo13.Composicao;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setCodigo(10L);
        banco.setNome("Banco Bella");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(20d);

        banco.add(cc);
        banco.add(cp);

        System.out.println("Nome Do banco: " + banco.getNome() + " - Código do banco " + banco.getCodigo());

    }
}
