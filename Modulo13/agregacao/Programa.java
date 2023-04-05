package Modulo13.agregacao;

public class Programa {

    public static void main(String[] args) {
        Produto produtoTv = criarProduto(1L, 10d, "TV");
        Produto produtoCel = criarProduto(2L, 1000d, "Celular");

        Vendedor vendedor = criarVendedor("Bella", 10d);

        Comprador comprador = criarComprador("Junio", 2000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTv);
        venda.add(produtoCel);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);

    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }
    
    private static Vendedor criarVendedor(String nome, double commissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(commissao);
        vendedor.setNome(nome);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
